package figuras;

public class Retangulo extends FiguraGeometrica {

float base ;
float altura ;

	public Retangulo(float b, float a) {
		base = b;
		altura = a;
	}
	
 

	float calcularArea() {
	
 		area = base * altura;
 		return area;
 	}
	

 	float calcularPerimetro() {
 
 		perimetro = 2*base+2*altura;
 		return perimetro;
 	}
}
