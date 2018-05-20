package calculos;

public class CalculoCoef {
	double taxaJuros;
	int numMeses;
	double coeficiente;
	
	public CalculoCoef(double taxaJuros, int numMeses) {
		this.taxaJuros = taxaJuros;
		this.numMeses = numMeses;
		coeficiente = (taxaJuros/(1-(1/Math.pow((1+taxaJuros), numMeses))));
	}
	
	public double getCoef() {
		return coeficiente;
	}
	
}
