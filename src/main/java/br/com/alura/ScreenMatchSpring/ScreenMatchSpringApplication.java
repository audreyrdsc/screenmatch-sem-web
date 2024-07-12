package br.com.alura.ScreenMatchSpring;

import br.com.alura.ScreenMatchSpring.model.DadosSerie;
import br.com.alura.ScreenMatchSpring.service.ConsumoApi;
import br.com.alura.ScreenMatchSpring.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenMatchSpringApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(ScreenMatchSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//System.out.println("Primeiro projeto");
		var consumoApi = new ConsumoApi();
		var endereco = "https://www.omdbapi.com/?t=gilmore+girls&apikey=5ea9f51d";
		var json = consumoApi.obterDados(endereco);
		System.out.println(json);
		/*endereco = "https://coffee.alexflipnote.dev/random.json";
		json = consumoApi.obterDados(endereco);
		System.out.println(json);*/

		ConverteDados conversor = new ConverteDados();
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
		System.out.println(dados);

	}
}
