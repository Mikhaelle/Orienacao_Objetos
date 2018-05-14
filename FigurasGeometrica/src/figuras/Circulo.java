package figuras;

public class Circulo extends FiguraGeometrica{

	float raio;
	public static final float PI = 3.141516f;
	
	public Circulo(float r ) {
		raio = r;
	}
	
	float calcularArea() {
		area = PI * raio* raio;
		return area;
	}


	float calcularPerimetro() {
		perimetro = 2* PI * raio;
		return perimetro;
	}
	

}
