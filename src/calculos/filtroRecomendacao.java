package calculos;

public class filtroRecomendacao {
		
	
	
	public void filtra(Classificavel classificavel) {
		if (classificavel.getClassificacao() >=4) {
			System.out.println("Filme preferido do momento!");
		}else if (classificavel.getClassificacao() >= 2){
			System.out.println("Bom filme no momento");
		}else {
			System.out.println("Assista depois!");
		}
	}
}
