import express from 'express';
import { createServer as createViteServer } from 'vite';
import path from 'path';
import { fileURLToPath } from 'url';
import fs from 'fs';
import { initializeApp } from 'firebase-admin/app';
import { getFirestore, Timestamp, FieldValue } from 'firebase-admin/firestore';
import { GoogleGenAI } from '@google/genai';

initializeApp();
const db = getFirestore();
const ai = new GoogleGenAI({
  apiKey: process.env.GEMINI_API_KEY!,
  httpOptions: {
    headers: {
      'User-Agent': 'aistudio-build',
    }
  }
});

const __dirname = path.dirname(fileURLToPath(import.meta.url));

async function createServer() {
  const app = express();
  app.use(express.json());
  const isProd = process.env.NODE_ENV === 'production';

  if (!isProd) {
    const vite = await createViteServer({
      server: { middlewareMode: true },
      appType: 'custom',
    });
    app.use(vite.middlewares);

    app.get('/api/spec', (req, res) => {
      const specPath = path.resolve(__dirname, 'Documentation/openapi.json');
      const spec = JSON.parse(fs.readFileSync(specPath, 'utf-8'));
      res.json(spec);
    });

    app.get('/api/proxy/*', async (req, res) => {
      const apiPath = req.params[0];
      const apiKey = process.env.CONGRESS_API_KEY;

      if (!apiKey) {
        return res.status(500).json({ error: 'API key not configured' });
      }

      const queryString = new URLSearchParams(req.query as any).toString();
      const url = `https://api.congress.gov/v3/${apiPath}?api_key=${apiKey}&${queryString}`;
      
      try {
        const response = await fetch(url);
        const data = await response.json();
        res.json(data);
      } catch (error) {
        res.status(500).json({ error: 'Failed to fetch from Congress API' });
      }
    });

    app.post('/api/summarize', async (req, res) => {
      const { userId } = req.body;
      if (!userId) return res.status(400).json({ error: 'Missing userId' });
      
      // Fetch data for today
      const now = new Date();
      const startOfDay = new Date(now.setHours(0,0,0,0));
      
      const snapshot = await db.collection('stored_data')
        .where('userId', '==', userId)
        .where('createdAt', '>=', Timestamp.fromDate(startOfDay))
        .get();

      const data = snapshot.docs.map(doc => doc.data().data);
      
      const response = await ai.models.generateContent({
        model: 'gemini-3.8-flash',
        contents: `Summarize this data about today's work: ${JSON.stringify(data)}`,
      });

      const summary = response.text;

      // Save summary
      await db.collection('summaries').add({
        text: summary,
        createdAt: FieldValue.serverTimestamp(),
        userId: userId
      });

      res.json({ summary });
    });

    app.use('*', async (req, res, next) => {

      const url = req.originalUrl;
      try {
        let template = fs.readFileSync(path.resolve(__dirname, 'index.html'), 'utf-8');
        template = await vite.transformIndexHtml(url, template);
        res.status(200).set({ 'Content-Type': 'text/html' }).end(template);
      } catch (e) {
        vite.ssrFixStacktrace(e as Error);
        next(e);
      }
    });
  } else {
    app.use(express.static(path.resolve(__dirname, 'dist')));
    app.get('*', (req, res) => {
      res.sendFile(path.resolve(__dirname, 'dist/index.html'));
    });
  }

  app.listen(3000, '0.0.0.0', () => {
    console.log('Server running on http://0.0.0.0:3000');
  });
}

createServer();
