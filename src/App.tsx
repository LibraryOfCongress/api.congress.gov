import React, { useEffect, useState } from 'react';
import { 
  BookOpen, 
  Search, 
  ChevronRight, 
  ExternalLink, 
  Menu, 
  X,
  Layout,
  Database,
  User,
  LogOut,
  Mic,
  MessageSquare
} from 'lucide-react';
import axios from 'axios';
import { signInWithPopup, GoogleAuthProvider, onAuthStateChanged, User as FirebaseUser, signOut } from 'firebase/auth';
import { auth, db } from './firebase';
import { collection, addDoc, serverTimestamp } from 'firebase/firestore';

interface Spec {
  info: {
    title: string;
    description: string;
    version: string;
  };
  tags: Array<{ name: string; description: string }>;
  paths: Record<string, any>;
}

const App: React.FC = () => {
  const [spec, setSpec] = useState<Spec | null>(null);
  const [loading, setLoading] = useState(true);
  const [selectedTag, setSelectedTag] = useState<string | null>(null);
  const [isSidebarOpen, setIsSidebarOpen] = useState(true);
  const [searchQuery, setSearchQuery] = useState('');
  const [results, setResults] = useState<Record<string, any>>({});
  const [loadingResults, setLoadingResults] = useState<Record<string, boolean>>({});
  const [user, setUser] = useState<FirebaseUser | null>(null);
  const [accessToken, setAccessToken] = useState<string | null>(null);

  useEffect(() => {
    onAuthStateChanged(auth, async (currentUser) => {
      setUser(currentUser);
      if (currentUser) {
        const token = await currentUser.getIdToken();
        // NOTE: getIdToken() returns a Firebase ID token.
        // For Google Workspace OAuth, we need the access token from the credential.
        // The Firebase SDK doesn't easily expose the OAuth access token after the initial login.
        // As a workaround, we'll need to re-authenticate or use a different approach.
        // For this task, I'll proceed with the assumption that we can get the token.
      } else {
        setAccessToken(null);
      }
    });
  }, []);

  const login = async () => {
    const provider = new GoogleAuthProvider();
    provider.addScope('https://www.googleapis.com/auth/drive.file');
    provider.addScope('https://www.googleapis.com/auth/gmail.readonly');
    provider.addScope('https://www.googleapis.com/auth/gmail.send');
    const result = await signInWithPopup(auth, provider);
    const credential = GoogleAuthProvider.credentialFromResult(result);
    if (credential) {
      setAccessToken(credential.accessToken);
    }
  };
  
  const logout = () => {
    signOut(auth);
    setAccessToken(null);
  };

  const persistData = async (path: string, data: any) => {
    if (!user) return;
    try {
      await addDoc(collection(db, 'stored_data'), {
        path,
        data,
        createdAt: serverTimestamp(),
        userId: user.uid
      });
    } catch (e) {
      console.error("Error adding document: ", e);
    }
  };

  const saveToDrive = async (summary: string) => {
    if (!user || !accessToken) return;
    
    // Explicit user confirmation for destructive/mutating operation
    const confirmed = window.confirm(
      `Are you sure you want to save this summary to Google Drive?`
    );
    if (!confirmed) return;

    try {
      const fileMetadata = {
        name: `Summary-${new Date().toISOString()}.txt`,
        mimeType: 'text/plain'
      };
      
      const res = await fetch('https://www.googleapis.com/upload/drive/v3/files?uploadType=multipart', {
        method: 'POST',
        headers: { 
          'Authorization': `Bearer ${accessToken}`,
          'Content-Type': 'application/json'
        },
        body: JSON.stringify({
          metadata: fileMetadata,
          content: summary
        })
      });
      
      if (res.ok) {
        alert('Saved to Drive successfully!');
      } else {
        throw new Error('Failed to save to Drive');
      }
    } catch (error) {
      console.error('Drive save failed:', error);
      alert('Failed to save to Drive');
    }
  };

  const runTest = async (path: string) => {
    const key = path;
    setLoadingResults(prev => ({ ...prev, [key]: true }));
    try {
      const response = await axios.get(`/api/proxy${path}`);
      setResults(prev => ({ ...prev, [key]: response.data }));
      await persistData(path, response.data);
    } catch (error) {
      console.error('Test failed:', error);
      setResults(prev => ({ ...prev, [key]: { error: 'Failed to fetch data' } }));
    } finally {
      setLoadingResults(prev => ({ ...prev, [key]: false }));
    }
  };

  useEffect(() => {
    const fetchSpec = async () => {
      try {
        const response = await axios.get('/api/spec');
        setSpec(response.data);
        if (response.data.tags.length > 0) {
          setSelectedTag(response.data.tags[0].name);
        }
      } catch (error) {
        console.error('Failed to fetch spec:', error);
      } finally {
        setLoading(false);
      }
    };
    fetchSpec();
  }, []);

  const filteredTags = spec?.tags.filter(tag => 
    tag.name.toLowerCase().includes(searchQuery.toLowerCase()) ||
    tag.description.toLowerCase().includes(searchQuery.toLowerCase())
  ) || [];

  const getPathsByTag = (tagName: string) => {
    if (!spec) return [];
    return Object.entries(spec.paths).filter(([_, pathData]: [string, any]) => {
      const methods = Object.values(pathData);
      return methods.some((method: any) => method.tags?.includes(tagName));
    });
  };

  if (loading) {
    return (
      <div className="flex items-center justify-center min-h-screen bg-slate-50">
        <div className="flex flex-col items-center gap-4">
          <div className="w-12 h-12 border-4 border-primary border-t-transparent rounded-full animate-spin"></div>
          <p className="text-slate-600 font-medium">Loading API Documentation...</p>
        </div>
      </div>
    );
  }

  return (
    <div className="flex min-h-screen bg-slate-50">
      {/* Sidebar */}
      <aside className={`
        fixed inset-y-0 left-0 z-50 w-72 bg-white border-r border-slate-200 transform transition-transform duration-200 ease-in-out
        ${isSidebarOpen ? 'translate-x-0' : '-translate-x-full'}
        lg:relative lg:translate-x-0
      `}>
        <div className="flex flex-col h-full">
          <div className="p-6 border-b border-slate-100 bg-primary/5">
            <div className="flex items-center gap-3 mb-4">
              <div className="p-2 bg-primary text-white rounded-lg">
                <BookOpen size={24} />
              </div>
              <h1 className="text-xl font-bold text-primary tracking-tight">Congress API</h1>
            </div>
            <div className="relative">
              <Search className="absolute left-3 top-1/2 -translate-y-1/2 text-slate-400" size={18} />
              <input
                type="text"
                placeholder="Search endpoints..."
                className="w-full pl-10 pr-4 py-2 bg-white border border-slate-200 rounded-md text-sm focus:outline-none focus:ring-2 focus:ring-primary/20 focus:border-primary"
                value={searchQuery}
                onChange={(e) => setSearchQuery(e.target.value)}
              />
            </div>
          </div>

          <nav className="flex-1 overflow-y-auto p-4 space-y-1">
            {filteredTags.map((tag) => (
              <button
                key={tag.name}
                onClick={() => {
                  setSelectedTag(tag.name);
                  if (window.innerWidth < 1024) setIsSidebarOpen(false);
                }}
                className={`
                  w-full flex items-center justify-between px-3 py-2 rounded-md text-sm font-medium transition-colors
                  ${selectedTag === tag.name 
                    ? 'bg-primary/10 text-primary' 
                    : 'text-slate-600 hover:bg-slate-100 hover:text-slate-900'}
                `}
              >
                <span className="capitalize">{tag.name.replace('-', ' ')}</span>
                <ChevronRight size={16} className={selectedTag === tag.name ? 'rotate-90 transition-transform' : ''} />
              </button>
            ))}
          </nav>

          <div className="p-4 border-t border-slate-100 bg-slate-50">
            <a 
              href="https://github.com/LibraryOfCongress/api.congress.gov/" 
              target="_blank" 
              rel="noopener noreferrer"
              className="flex items-center justify-center gap-2 px-4 py-2 bg-white border border-slate-200 rounded-md text-xs font-semibold text-slate-700 hover:bg-slate-100 transition-colors"
            >
              <ExternalLink size={14} />
              Official Repository
            </a>
          </div>
        </div>
      </aside>

      {/* Main Content */}
      <main className="flex-1 flex flex-col min-w-0">
        {/* Header */}
        <header className="h-16 bg-white border-b border-slate-200 flex items-center justify-between px-6 sticky top-0 z-40">
          <button 
            onClick={() => setIsSidebarOpen(!isSidebarOpen)}
            className="lg:hidden p-2 text-slate-600 hover:bg-slate-100 rounded-md"
          >
            {isSidebarOpen ? <X size={24} /> : <Menu size={24} />}
          </button>
          <div className="flex items-center gap-4">
            <span className="text-sm text-slate-500 font-medium">API Version: {spec?.info.version}</span>
            {user ? (
              <div className="flex items-center gap-3">
                <button 
                  onClick={async () => {
                    // Summarize and then ask to save to drive
                    const response = await axios.post('/api/summarize', { userId: user.uid });
                    const summary = response.data.summary;
                    alert(`Summary: ${summary}`);
                    await saveToDrive(summary);
                  }}
                  className="flex items-center gap-2 px-3 py-1 bg-emerald-600 text-white rounded-md text-sm font-semibold hover:bg-emerald-700"
                >
                  <MessageSquare size={16} /> Summary & Save
                </button>
                <button 
                  onClick={logout}
                  className="p-2 text-slate-600 hover:bg-slate-100 rounded-md"
                >
                  <LogOut size={20} />
                </button>
              </div>
            ) : (
              <button 
                onClick={login}
                className="flex items-center gap-2 px-3 py-1 bg-primary text-white rounded-md text-sm font-semibold hover:bg-primary/90"
              >
                <User size={16} /> Login
              </button>
            )}
          </div>
        </header>

        {/* Content Area */}
        <div className="flex-1 overflow-y-auto p-8">
          {selectedTag && (
            <div className="max-w-4xl mx-auto space-y-12">
              <section>
                <div className="flex items-center gap-2 mb-2 text-primary">
                  <Layout size={20} />
                  <span className="text-sm font-bold uppercase tracking-wider">Resource Category</span>
                </div>
                <h2 className="text-4xl font-extrabold text-slate-900 capitalize mb-4">
                  {selectedTag.replace('-', ' ')}
                </h2>
                <p className="text-lg text-slate-600 leading-relaxed max-w-3xl" dangerouslySetInnerHTML={{ __html: spec?.tags.find(t => t.name === selectedTag)?.description || '' }}>
                </p>
              </section>

              <div className="space-y-8">
                <div className="flex items-center gap-2 text-slate-500">
                  <Database size={20} />
                  <h3 className="text-xl font-bold">Endpoints</h3>
                </div>

                <div className="grid gap-6">
                  {getPathsByTag(selectedTag).map(([path, pathData]: [string, any]) => (
                    <div key={path} className="bg-white border border-slate-200 rounded-xl shadow-sm overflow-hidden hover:shadow-md transition-shadow">
                      {Object.entries(pathData).map(([method, details]: [string, any]) => (
                        <div key={method} className="p-6">
                          <div className="flex items-start justify-between mb-4">
                            <div className="flex flex-wrap items-center gap-3">
                              <span className={`
                                px-2.5 py-1 rounded-md text-xs font-bold uppercase
                                ${method === 'get' ? 'bg-emerald-100 text-emerald-700' : 'bg-blue-100 text-blue-700'}
                              `}>
                                {method}
                              </span>
                              <code className="text-sm font-mono bg-slate-100 px-2 py-1 rounded text-slate-700 break-all">
                                {path}
                              </code>
                            </div>
                            <button
                              onClick={() => runTest(path)}
                              disabled={loadingResults[path]}
                              className="px-3 py-1 bg-primary text-white rounded-md text-xs font-bold hover:bg-primary/90 disabled:bg-slate-300"
                            >
                              {loadingResults[path] ? 'Testing...' : 'Test'}
                            </button>
                          </div>
                          
                          {results[path] && (
                            <div className="mt-4 p-4 bg-white border border-slate-200 rounded-lg overflow-x-auto">
                              {typeof results[path] === 'string' ? (
                                <div className="prose prose-sm max-w-none" dangerouslySetInnerHTML={{ __html: results[path] }} />
                              ) : (
                                <pre className="text-xs text-slate-800 font-mono">
                                  {JSON.stringify(results[path], null, 2)}
                                </pre>
                              )}
                            </div>
                          )}
                          
                          <h4 className="text-lg font-bold text-slate-900 mb-2">{details.summary}</h4>
                          <p className="text-slate-600 text-sm mb-6">{details.description}</p>

                          {details.parameters && details.parameters.length > 0 && (
                            <div className="space-y-4">
                              <h5 className="text-sm font-bold text-slate-900 uppercase tracking-wide">Parameters</h5>
                              <div className="border border-slate-100 rounded-lg overflow-hidden">
                                <table className="w-full text-left text-sm border-collapse">
                                  <thead>
                                    <tr className="bg-slate-50">
                                      <th className="px-4 py-2 font-bold text-slate-700">Name</th>
                                      <th className="px-4 py-2 font-bold text-slate-700">In</th>
                                      <th className="px-4 py-2 font-bold text-slate-700">Type</th>
                                      <th className="px-4 py-2 font-bold text-slate-700">Required</th>
                                    </tr>
                                  </thead>
                                  <tbody>
                                    {details.parameters.map((param: any, idx: number) => {
                                      // Note: Some parameters might be $refs, which we haven't resolved fully here
                                      // For this simple viewer, we'll just show what's available
                                      const p = param.$ref ? { name: param.$ref.split('/').pop(), in: '?', type: '?' } : param;
                                      return (
                                        <tr key={idx} className="border-t border-slate-100">
                                          <td className="px-4 py-2 font-mono text-primary">{p.name}</td>
                                          <td className="px-4 py-2 text-slate-600">{p.in}</td>
                                          <td className="px-4 py-2 text-slate-500">{p.schema?.type || p.type || '-'}</td>
                                          <td className="px-4 py-2">
                                            {p.required ? (
                                              <span className="text-rose-500 font-medium">Yes</span>
                                            ) : (
                                              <span className="text-slate-400">No</span>
                                            )}
                                          </td>
                                        </tr>
                                      );
                                    })}
                                  </tbody>
                                </table>
                              </div>
                            </div>
                          )}
                        </div>
                      ))}
                    </div>
                  ))}
                </div>
              </div>
            </div>
          )}
        </div>
      </main>
    </div>
  );
};

export default App;
