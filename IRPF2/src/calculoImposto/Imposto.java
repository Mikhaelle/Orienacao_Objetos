package calculoImposto;


public class Imposto {
	double totalImposto;
	
	
	public double calcularBase(double rends, double deds) {
		double totalBase = rends - deds;
		return totalBase;
	} 
}
