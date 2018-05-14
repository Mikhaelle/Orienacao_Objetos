package figuras;

import javax.swing.JOptionPane;

public abstract class FiguraGeometrica {
	float area,
		  perimetro;
	
	abstract float calcularArea(); // abstract é um 
	
	abstract float calcularPerimetro();
	
	public void imprimirDados() {
		calcularArea();
		calcularPerimetro();
		
		String msg = "Essa figura tem " + perimetro + "cm de perimetro e " + area + "cm de area";
		JOptionPane.showMessageDialog(null, msg);
	}
	
	}


