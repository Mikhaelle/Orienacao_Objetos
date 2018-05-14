package figurasGeometricas;
//import java.lang;

public class Circulo {
	public static final double PI = 3.14159265358979323846;
	
	static double raio;
	static double perimetro;
	double area;
	
	public Circulo(double raio2) {
		raio = raio2;
	}
	
	public static double getPerimetro() {
		perimetro = 2* PI *raio;
		return perimetro;
	}
	
	public double getArea() {
		area =  PI *raio * raio;
		return area;
	}
}
