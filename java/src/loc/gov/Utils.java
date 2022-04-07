package loc.gov;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Utils {

    /**
     * make_request
     *
     * Make a GET request to the given URL.  The auth parameters are automatically added.
     *
     * @param url
     *
     * @throws IOException
     * @throws InterruptedException
     */
    public void make_request(String url) throws IOException, InterruptedException {

        Config config = new Config();

        url += "?authkey=" + config.getAuthKey() + "&format=" + config.getResponseFormat();

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        HttpResponse<String> response = client.send(request,
                HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
