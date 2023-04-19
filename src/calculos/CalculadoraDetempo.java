package calculos;

import modelo.Titulo;

public class CalculadoraDetempo {

	private int tempoTotal;

	public int getTempoTotal() {
		return tempoTotal;
	}

	public void setTempoTotal(int tempoTotal) {
		this.tempoTotal = tempoTotal;
	}
	
	//public void incluir(Filme f) {
	//}
	//public void incluir(Serie s) {
	//	 tempoTotal =+ s.getDuracaoEmMinutos();
	//}
	
	public void incluir(Titulo t) {
		
		System.out.println("Adicioanndo duracao em minutos de " + t);
		tempoTotal =+ t.getDuracaoEmMinutos();
	}
}
