package calculoImposto;
import aplicacao.Principal;

public class Base {
	private double totalBase = 0;
	
	public double calcularBase(double rends, double deds) {
		totalBase = rends - deds;
		return totalBase;
	} 
	
}
