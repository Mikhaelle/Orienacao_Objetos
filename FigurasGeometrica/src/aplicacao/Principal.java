package aplicacao;

import figuras.Circulo;
import figuras.FiguraGeometrica;
import figuras.Quadrado;
import figuras.Retangulo;
import figuras.Trapezio;
import figuras.Triangulo;

public class Principal {

	public static void main(String[] args) {
		// Criar Dois Retangulos
		FiguraGeometrica figuras[] = new FiguraGeometrica[5];
		
		figuras [0] = new Circulo (3);
		figuras [1] = new Retangulo (3,4);
		figuras [2] = new Quadrado (4);
		figuras [3] = new Trapezio (5,3,2);
		figuras [4] = new Triangulo (2);
		
		for (FiguraGeometrica f: figuras) {
			f.imprimirDados();
		}
		
		//Circulo c = (Circulo)figuras[0]; // mudança de tipo
		
		//System.out.println(c.PI);
	}

}


// figGeom f; --> f=new Circulo(2); : pode ser feito