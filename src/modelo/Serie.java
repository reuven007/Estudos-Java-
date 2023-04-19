package modelo;

public class Serie extends Titulo{

	public Serie(int anoDeLancamento, String nome) {
		super(anoDeLancamento, nome);
		
	}

	private int temporadas;
	private int episodiosPorTemporada;
	private boolean ativa;
	private int minutosPorEpisodio;
	

	public int getTemporadas() {
		return temporadas;
	}
	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}
	public int getEpisodiosPorTemporada() {
		return episodiosPorTemporada;
	}
	public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
		this.episodiosPorTemporada = episodiosPorTemporada;
	}
	public boolean isAtiva() {
		return ativa;
	}
	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}
	public int getMinutosPorEpisodio() {
		return minutosPorEpisodio;
	}
	public void setMinutosPorEpisodio(int minutosPorEpisodio) {
		this.minutosPorEpisodio = minutosPorEpisodio;
	}
	
	@Override
	public int getDuracaoEmMinutos() {
	    return super.getDuracaoEmMinutos();
	}
	
	@Override
	public String toString() {
		
		return getNome() + (" ") + getGenero();
	}
}
