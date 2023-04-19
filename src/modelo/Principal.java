package modelo;

import java.util.ArrayList;

import javax.swing.plaf.basic.BasicToolTipUI;

import calculos.CalculadoraDetempo;
import calculos.filtroRecomendacao;

public class Principal {
	public static void main(String[] args) {

		Filme filme = new Filme(1999,"Batman Forever");

	
		filme.setGenero("acao");
		filme.setIncluidoNoPlano(true);
		filme.exibirFichaTecnica();
		filme.setDuracaoEmMinutos(180);
		System.out.println("***************************");

		filme.avaliar(10);
		filme.avaliar(10);
		filme.avaliar(9);

		// System.out.println(filme.somaDasAvaliacoes);
		// System.out.println(filme.getTotalDeAvaliacoes());
		// System.out.println(filme.ObterMedia());
		// System.out.println(filme.getGenero());

		Serie lost = new Serie(1999, "Lost");

		lost.setAnoDeLancamento(1975);
		lost.setGenero("Drama");
		lost.setTemporadas(5);
		lost.setEpisodiosPorTemporada(10);
		lost.setDuracaoEmMinutos(140);

		lost.exibirFichaTecnica();

		//System.out.println("Temporadas: " + lost.getTemporadas());
	//	System.out.println("Episodios: " + lost.getEpisodiosPorTemporada());
		//System.out.println("Duração do filme: " + lost.getDuracaoEmMinutos());

		CalculadoraDetempo calculadora = new CalculadoraDetempo();

		calculadora.incluir(filme);

		Filme outroFilme = new Filme(1955, "Pantera Negra");
	
		filme.setAnoDeLancamento(1970);
		filme.setGenero("acao");
		filme.setIncluidoNoPlano(true);
		filme.exibirFichaTecnica();

		System.out.println("************************");
		Filme f = new Filme( 1970, "Jordan O Filme");

		f.setAnoDeLancamento(1970);
		f.setGenero("acao");
		f.setIncluidoNoPlano(true);
		f.exibirFichaTecnica();
		f.setDuracaoEmMinutos(180);

		System.out.println("*****************************");

		Filme filmeDoReuven = new Filme(1986, "Cutindo a vida adoidado");

		filmeDoReuven.setAnoDeLancamento(1986);
		filmeDoReuven.setGenero("Comedia");
		filmeDoReuven.setIncluidoNoPlano(true);
		filmeDoReuven.setDuracaoEmMinutos(120);

		filmeDoReuven.exibirFichaTecnica();
		System.out.println(filmeDoReuven);

		outroFilme.setDuracaoEmMinutos(200);
		calculadora.incluir(filme);
		System.out.println(calculadora.getTempoTotal());
		calculadora.incluir(outroFilme);
		System.out.println(calculadora.getTempoTotal());
		calculadora.incluir(lost);
		System.out.println(calculadora.getTempoTotal());

		filtroRecomendacao filtro = new filtroRecomendacao();

		filtro.filtra(outroFilme);

		Episodio episodio = new Episodio();
		episodio.setNumero(1);
		episodio.setSerie(lost);
		episodio.setTotalVisualizacoes(150);
		filtro.filtra(episodio);

		ArrayList<Filme> todosOsFilmes = new ArrayList<>();

		todosOsFilmes.add(f);
		todosOsFilmes.add(filme);
		todosOsFilmes.add(outroFilme);
		todosOsFilmes.add(filmeDoReuven);

		System.out.println("Tamanho total da lista de filmes: " + todosOsFilmes.size());
		System.out.println("Primeiro filme: " + todosOsFilmes.get(3).getNome());
		System.out.println("Lista Completa dos Filmes: " + todosOsFilmes.toString());
		System.out.println();
		System.out.println("**************************");

	}

}
