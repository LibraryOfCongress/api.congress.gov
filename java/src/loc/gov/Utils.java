package loc.gov;

import java.io.IOException;
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

        printMessage("Making call to " + url);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(appendParameters(url)))
                .build();

        HttpResponse<String> response = null;
        try {
            response = client.send(request,
                    HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException ex) {
            printMessage(ex.getMessage());
        }

        printMessage(response.body());
    }

    /**
     *
     * appendParameters
     *
     * @param url The URL to append the authkey and format URL parameters to
     *
     * @return String
     */
    private static String appendParameters(String url) {
        return url + "?authkey=" + Config.getAuthKey() + "&format=" + Config.getResponseFormat();
    }

    /**
     * printMessage
     *
     * Display a message on the console
     *
     * @param message
     */
    public static void printMessage(String message) {
        System.out.println(message);

    }

    /**
     * printMessageAndBail
     *
     * Display a message on the console and exit
     *
     * @param message
     */
    public static void printMessageAndBail(String message) {
        printMessage(message);
        System.exit(1);
    }
}
