package modelo;

import calculos.Classificavel;

public class Episodio implements Classificavel {

	private String nome;
	private int numero;
	private Serie serie;
	private int totalVisualizacoes;

	public int getTotalVisualizacoes() {
		return totalVisualizacoes;
	}

	public void setTotalVisualizacoes(int totalVisualizacoes) {
		this.totalVisualizacoes = totalVisualizacoes;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Serie getSerie() {
		return serie;
	}

	public void setSerie(Serie lost) {
		this.serie = lost;
	}

	@Override
	public int getClassificacao() {
		if (totalVisualizacoes > 100) {
			// System.out.println("Otimo Filme");
			return 4;

		} else {
			return 2;
		}

	}
}
