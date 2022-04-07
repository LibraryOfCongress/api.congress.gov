package loc.gov;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;

public class Utils {

    /**
     * makeRequest
     *
     * Make a GET request to the given URL.  The auth parameters are automatically added.
     *
     * @param url The URL of the API we are going to make a GET request to
     *
     */
    public static void makeRequest(String url) {

        outputMessage("Making call to " + url);

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
            outputMessageAndBail(ex.getMessage());
        }
        
        // If our response is null, something wasn't right
        if (response == null || response.body() == null) {
            outputMessageAndBail("Something went wrong, we didn't get a response from " + url);
        }

        // Save the output to a file if our config says to do so
        if (Config.getStoreResponse().equals("true")) {
            saveOutputToNamedTextFile(response, url);
        } else {
            // Otherwise, print it to the screen
            outputMessage(response.body());
        }
    }

    /**
     * saveOutput
     * 
     * Save the output of the call to url in a text file named for the route.
     * 
     * @param output The HttpResponse to save
     * @param url The url that was called that provided the response
     */
    private static void saveOutputToNamedTextFile(HttpResponse<String> output, String url) {
        String filename = url.replace(Config.getRootUrl() + "/", "").replace("/", "_") + ".txt";

        // Store our default output
        PrintStream console = System.out;

        // Set up our file output
        PrintStream fileOut = null;
        try {
            fileOut = new PrintStream(filename);
        } catch (FileNotFoundException ex) {
            outputMessageAndBail("Unable to create the output file " + filename);
        }
        assert fileOut != null;
        System.setOut(fileOut);

        outputMessage(output.body());

        // Restore the default output
        System.setOut(console);
    }

    /**
     *
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
     * outputMessage
     *
     * Display a message on the console
     *
     * @param message The message to output to System.out
     */
    public static void outputMessage(String message) {
        System.out.println(message);
    }

    /**
     * outputMessageAndBail
     *
     * Display a message on the console and exit
     *
     * @param message The message to output to System.out
     */
    public static void outputMessageAndBail(String message) {
        outputMessage(message);
        System.exit(1);
    }
}
