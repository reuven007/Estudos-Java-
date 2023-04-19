package modelo;

import calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {

	private static final String String = null;
	private String diretor;

	public Filme(int anoDeLancamento, String nome) {
		super(anoDeLancamento, nome);
		
	}
	

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	@Override
	public int getClassificacao() {
		return (int) obterMedia() / 2;
	}
	

	@Override
	public java.lang.String toString() {
		// TODO Auto-generated method stub
		return "Filme: " + this.getNome() + " "+ this.getAnoDeLancamento();
	}
	}
