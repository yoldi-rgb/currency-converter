import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ObtenerMonedas {

    public Divisa obtenerdivisa  (String moneda){

        String apiKey = "819d236555ca3821533c4f78";
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/"+apiKey+"/pair/"+moneda.toUpperCase());

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        HttpResponse<String> response;

        {
            try {
                response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
                        return new Gson().fromJson(response.body(),Divisa.class);
            } catch (IOException | InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}




