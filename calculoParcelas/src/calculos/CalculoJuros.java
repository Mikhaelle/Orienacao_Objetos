package calculos;

public class CalculoJuros {
	
	public static double getValorDoJuros(double parc, int meses, double valorfin) {
		double valor ;
		valor = (parc*meses) - valorfin;
		return valor;
	}

}
