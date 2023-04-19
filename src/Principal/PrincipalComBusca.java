package Principal;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Scanner;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import modelo.Titulo;
import modelo.TituloOmdb;

public class PrincipalComBusca {

	public static void main(String[] args) throws IOException, InterruptedException {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o filme: ");
		String movie = sc.nextLine();

		String endereco = "http://www.omdbapi.com/?t=" + movie + "&apikey=727fc5af";

		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();

		HttpResponse<String> response = client.send(request, BodyHandlers.ofString());

		String json = response.body();
		System.out.println(json);

		Gson gson = new GsonBuilder()
				.setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
				.create();
		TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
		System.out.println(meuTituloOmdb);
		
		Titulo meuTitulo = new Titulo(meuTituloOmdb);
		
		
		FileWriter escrever = new FileWriter("filmes.txt");
		escrever.write(meuTitulo.toString());
		escrever.close();

	}

}
