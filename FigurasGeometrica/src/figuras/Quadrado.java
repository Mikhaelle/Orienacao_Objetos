package figuras;

public class Quadrado extends FiguraGeometrica {
	float lado;
	
	public Quadrado(float l ) {
		lado = l;
	}
	
	float calcularArea() {
		area = lado * lado;
		return area;
	}


	float calcularPerimetro() {
		perimetro = 4 * lado;
		return perimetro;
	}

}
