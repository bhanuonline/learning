package interview.general;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HttpPostExample {

    public static void main(String[] args) {
        // Use a real testing API if no URI is provided
        String uri = (args.length > 0) ? args[0] : "https://jsonplaceholder.typicode.com/posts";

        // Log the URI being used
        System.out.println("Using URI: " + uri);

        // Create an HttpClient instance to send the HTTP request
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {

            // Create an HttpPost request with the URI
            HttpPost postRequest = new HttpPost(uri);

            // Add headers to specify content type and other metadata
            postRequest.setHeader("Content-Type", "application/json");
            postRequest.setHeader("Accept", "application/json"); // Indicates we expect JSON in the response

            // Create a JSON payload to send in the body of the POST request
            String jsonPayload = "{\"title\":\"foo\",\"body\":\"bar\",\"userId\":1}";

            // Log the payload being sent
            System.out.println("Sending Payload: " + jsonPayload);

            // Set the payload as the entity of the HttpPost request
            HttpEntity stringEntity = new StringEntity(jsonPayload);
            postRequest.setEntity(stringEntity);

            // Execute the request and capture the response
            try (CloseableHttpResponse response = httpClient.execute(postRequest)) {

                // Log the HTTP response status code
                int statusCode = response.getStatusLine().getStatusCode();
                System.out.println("Response Code: " + statusCode);

                // If the response code indicates success, read the response body
                if (statusCode >= 200 && statusCode < 300) {
                    System.out.println("Response Content:");
                    try (BufferedReader reader = new BufferedReader(
                            new InputStreamReader(response.getEntity().getContent()))) {
                        String line;
                        while ((line = reader.readLine()) != null) {
                            System.out.println(line);
                        }
                    }
                } else {
                    // Log an error message if the response status is not successful
                    System.out.println("Request failed with status: " + statusCode);
                }
            }
        } catch (Exception e) {
            // Log any exceptions that occur during the process
            e.printStackTrace();
        }
    }
}

