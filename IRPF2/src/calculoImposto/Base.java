package calculoImposto;

// rendimentos-deducao
public class Base {
	private double valor;
	
	public Base(double a, double b, double c) {
		valor = a - b - c;
	}
	
	public double getValor() {
		return valor;
	}

}
