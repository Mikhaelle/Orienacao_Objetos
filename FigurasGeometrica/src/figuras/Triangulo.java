package figuras;

public class Triangulo extends FiguraGeometrica{

	float lado;
	
	public Triangulo(float L) {
		lado = L;
	}
	
	float calcularArea() {
		area =  ((lado * lado * 1.732f)/4);
		return area;
	}


	float calcularPerimetro() {
		perimetro = lado + lado + lado;
		return perimetro;
	}

}
