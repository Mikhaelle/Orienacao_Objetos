package figuras;

public class Trapezio extends FiguraGeometrica {
	float baseMaior;
	float baseMenor;
	float lado;
	float altura;
	
	public Trapezio ( float a, float b, float h) {
		baseMaior = a;
		baseMenor = b;
		altura = h;
	}
	
	float calcularArea() {
		area = ((baseMaior + baseMenor) * altura)/2;
		return area;
	}


	float calcularPerimetro() {
		lado = (baseMaior - baseMenor);
		perimetro = baseMaior + baseMenor + (2 * lado);
		return perimetro;
	}
}
