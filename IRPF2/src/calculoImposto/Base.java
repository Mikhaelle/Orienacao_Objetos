package calculoImposto;


public class Base {
	public double totalBase = 0;
	
	public double calcularBase(double rends, double deds) {
		totalBase = rends - deds;
		return totalBase;
	} 
	
}
