package gov.loc;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CDGClient {

    /**
     * makeRequestAndOutputResponse
     *
     * Make a GET request to the given URL and output the response per the config
     *
     * The auth parameters are automatically added.
     *
     * @param url the parameterless url to call
     *
     */
    public static void makeRequestAndOutputResponse(String url) {

        // Show where we're making the call to
        Utils.outputMessage("Making call to " + url);

        // Make the call and get the response
        HttpResponse<String> response = makeRequestGetResponse(url);

        // Output the response
        outputHttpResponse(response, url);
    }

    /**
     * makeRequestGetResponse
     *
     * Make a request to the given url and return the response
     *
     * The auth parameters are automatically added.
     *
     * @param url the parameterless url to call
     * @return HttpResponse
     */
    public static HttpResponse<String> makeRequestGetResponse(String url) {

        // Build the client and request
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(appendParameters(url)))
                .build();

        // Make the call & get a response
        HttpResponse<String> response = null;
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException ex) {
            Utils.outputMessage("Something went wrong with the call to " + url);
            Utils.outputMessageAndBail(ex.getMessage());
        }

        // If our response is null, something wasn't right
        if (response == null || response.body() == null) {
            Utils.outputMessageAndBail("Something went wrong, we didn't get a response from " + url);
        }

        return response;
    }

    /**
     * appendParameters
     *
     * @param url The URL to append the authkey and format URL parameters to
     *
     * @return String The url with the appended auth and format parameters
     */
    private static String appendParameters(String url) {
        return url + "?authkey=" + Config.getAuthKey() + "&format=" + Config.getResponseFormat();
    }

    /**
     * outputHttpResponse
     *
     * Output the response to the appropriate location based on the config
     *
     * @param response the HttpResponse
     * @param url the URL called
     */
    private static void outputHttpResponse(HttpResponse<String> response, String url) {

        // Save the output to a file if our config says to do so
        if (Config.getStoreResponse().equals("true")) {
            // Turns http://api1.test.congress.gov/v3/bill/117/hr/21/titles into bill_117_hr_21_titles.txt
            String filename = url.replace(Config.getRootUrl() + "/", "").replace("/", "_") + ".txt";

            // Store our default output
            PrintStream console = System.out;

            // Set up our file output
            PrintStream fileOut = null;
            try {
                fileOut = new PrintStream(filename);
            } catch (FileNotFoundException ex) {
                Utils.outputMessageAndBail("Unable to create the output file " + filename);
            }

            // Ensure we have a fileOut
            if (fileOut == null) {
                Utils.outputMessageAndBail("Something went wrong creating the output file " + filename);
            }

            System.setOut(fileOut);

            Utils.outputMessage(response.body());

            // Restore the default output
            System.setOut(console);

            // Let us know what file was created
            Utils.outputMessage("Output saved to " + filename);
        } else {
            // Otherwise, print it to the screen
            System.out.println(response.body());
        }
    }
}