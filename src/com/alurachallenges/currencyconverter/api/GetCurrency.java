package com.alurachallenges.currencyconverter.api;

import com.alurachallenges.currencyconverter.models.ExchangeRateCurrency;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class GetCurrency {

    public ExchangeRateCurrency findCurrency(String coin){

        String apiKey = "819d236555ca3821533c4f78";
        URI address = URI.create("https://v6.exchangerate-api.com/v6/"+apiKey+"/pair/"+coin.toUpperCase());

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(address)
                .build();

        HttpResponse<String> response;

        {
            try {
                response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
                        return new Gson().fromJson(response.body(), ExchangeRateCurrency.class);
            } catch (IOException | InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}




