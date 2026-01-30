package br.com.viacep.controller;

import br.com.viacep.models.Endereco;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ViaCepController {
    private String api_url = "https://viacep.com.br/ws/";
    private String tipo = "/json/";

    public Endereco buscaEndereco(String cep) throws IOException, InterruptedException {
        var url = api_url + cep + this.tipo;
        System.out.println(url);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        Endereco endereco = gson.fromJson(json, Endereco.class);
        return endereco;
    }
}
