package Principal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collector;

import modelo.Filme;
import modelo.Serie;
import modelo.Titulo;

public class PrincipalComListas {

	public static void main(String[] args) {

		Filme filme = new Filme(1999,"Batman Forever");

	
		filme.setGenero("acao");
		filme.setIncluidoNoPlano(true);
		filme.exibirFichaTecnica();
		filme.setDuracaoEmMinutos(180);
		filme.avaliar(9);
		
		Serie lost = new Serie(1999, "Lost");

		lost.setAnoDeLancamento(1975);
		lost.setGenero("Drama");
		lost.setTemporadas(5);
		lost.setEpisodiosPorTemporada(10);
		lost.setDuracaoEmMinutos(140);

		lost.exibirFichaTecnica();
		

		Filme outroFilme = new Filme(1955, "Pantera Negra");
	
		filme.setAnoDeLancamento(1970);
		filme.setGenero("acao");
		filme.setIncluidoNoPlano(true);
		filme.exibirFichaTecnica();
		filme.avaliar(8);
		
		Filme f = new Filme( 1970, "Jordan O Filme");

		f.setAnoDeLancamento(1970);
		f.setGenero("acao");
		f.setIncluidoNoPlano(true);
		f.exibirFichaTecnica();
		f.setDuracaoEmMinutos(180);

		
		Filme filmeDoReuven = new Filme(1986, "Cutindo a vida adoidado");

		filmeDoReuven.setAnoDeLancamento(1986);
		filmeDoReuven.setGenero("Comedia");
		filmeDoReuven.setIncluidoNoPlano(true);
		filmeDoReuven.setDuracaoEmMinutos(120);
		filmeDoReuven.avaliar(10);
		filmeDoReuven.exibirFichaTecnica();
		
		ArrayList<Titulo> todosOsFilmes = new ArrayList<>();

		todosOsFilmes.add(f);
		todosOsFilmes.add(filme);
		todosOsFilmes.add(outroFilme);
		todosOsFilmes.add(filmeDoReuven);
		todosOsFilmes.add(lost);
		lost.avaliar(7);
		
	
		Filme f1 = filmeDoReuven;
			
		for(Titulo item : todosOsFilmes) {
			System.out.println(item.getNome());
			
			if(item instanceof Filme filme1) {
				System.out.println("E um filme SIM!");
			}
			
			System.out.println("Classificacao: " + filme.getClassificacao());
		}
			
		ArrayList<String> buscaPorArtista = new ArrayList<>();
			buscaPorArtista.add("Adam Sandler");
			buscaPorArtista.add("Thom Hanks");
			buscaPorArtista.add("Jason Momoa");
			
			System.out.println(buscaPorArtista.size());
			System.out.println(buscaPorArtista);
			
			System.out.println("Depois da ordenacao alfabetica...");
			Collections.sort(buscaPorArtista);
			System.out.println(buscaPorArtista);
			
			System.out.println(" ");
			System.out.println(todosOsFilmes);
			
			Collections.sort(todosOsFilmes);
			System.out.println("Lista de titulos ordenadas alfabeticamente");
			System.out.println(todosOsFilmes);
			
			
	}

}
