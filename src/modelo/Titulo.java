package modelo;

import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo>{
	private String genero;
	private int anoDeLancamento;
	private boolean incluidoNoPlano;
	private double somaDasAvaliacoes;
	private int totalDeAvaliacoes;
	private int duracaoEmMinutos;
	
	@SerializedName("Title")
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getAnoDeLancamento() {
		return anoDeLancamento;
	}

	public void setAnoDeLancamento(int anoDeLancamento) {
		this.anoDeLancamento = anoDeLancamento;
	}

	public boolean isIncluidoNoPlano() {
		return incluidoNoPlano;
	}

	public void setIncluidoNoPlano(boolean incluidoNoPlano) {
		this.incluidoNoPlano = incluidoNoPlano;
	}

	public double getSomaDasAvaliacoes() {
		return somaDasAvaliacoes;
	}

	public void setSomaDasAvaliacoes(double somaDasAvaliacoes) {
		this.somaDasAvaliacoes = somaDasAvaliacoes;
	}

	public int getDuracaoEmMinutos() {
		return duracaoEmMinutos;
	}

	public void setDuracaoEmMinutos(int duracaoEmMinutos) {
		this.duracaoEmMinutos = duracaoEmMinutos;
	}

	public int getTotalDeAvaliacoes() {

		return totalDeAvaliacoes;
	}

	public void exibirFichaTecnica() {
		System.out.println("Nome do Filme: " + nome);
		System.out.println("Ano de lancamento: " + anoDeLancamento);
		System.out.println("Duracao em minutos: " + duracaoEmMinutos);
		System.out.println("Genero: " + genero);
		System.out.println(incluidoNoPlano);
		
	}

	public void avaliar(double nota) {
		somaDasAvaliacoes += nota;
		totalDeAvaliacoes++;

	}

	public double obterMedia() {
		return somaDasAvaliacoes / totalDeAvaliacoes;

	}

	public Titulo(int anoDeLancamento, String nome) {
		super();
		this.anoDeLancamento = anoDeLancamento;
		this.nome = nome;
	}

	public Titulo(TituloOmdb meuTituloOmdb) {
		this.nome = meuTituloOmdb.title();
		this.anoDeLancamento = Integer.valueOf(meuTituloOmdb.year());
		this.genero = meuTituloOmdb.genre();
		this.duracaoEmMinutos = Integer.valueOf(meuTituloOmdb.runtime().substring(0,3));
		}

	@Override
	public int compareTo(Titulo outroTitulo) {
		
		return this.getNome().compareTo(outroTitulo.getNome());
		}

	@Override
	public String toString() {
		
		return "Nome: " + nome + " / "
				+ "Ano: " + anoDeLancamento + " / "
				+ "Genero: " + genero +
			" / "+	duracaoEmMinutos;
	}
}
