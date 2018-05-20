package figuras;

public class Retangulo extends Quadrado {

	float base ;

	public Retangulo(float b, float a) {
		super(a); // usa o construtor do quadrado
		base = b;
	}
	
	float calcularArea() {
	
 		area = base * lado;
 		return area;
 	}
	

 	float calcularPerimetro() {
 
 		perimetro = 2*base+2*lado;
 		return perimetro;
 	}
}
