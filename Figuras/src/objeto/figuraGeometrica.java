package objeto;

import javax.swing.JOptionPane;

import figurasGeometricas.Circulo;

public class figuraGeometrica {
		String tipoFigura;
		
		public figuraGeometrica(String nome) {
			tipoFigura = nome;
		}
		
	
		public Circulo cadastrarCirculo() {
			
			double raio= Double.parseDouble(JOptionPane.showInputDialog("Entre com o raio do circulo"));
			
			Circulo circ = new Circulo(raio);
			
			return circ;

		}
		
		public double perimetroCirculo() {
			 return Circulo.getPerimetro();
		}
}