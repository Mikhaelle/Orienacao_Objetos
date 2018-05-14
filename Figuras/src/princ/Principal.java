package princ;

import javax.swing.JOptionPane;

import objeto.figuraGeometrica;

public class Principal {
	
	static figuraGeometrica[] novafg = new figuraGeometrica[0];
	
	
	public static void main(String[] args) {
		
		int i = Integer.parseInt( JOptionPane.showInputDialog("Deseja cadastrar um circulo? 1 para sim e 0 para não"));
		
		if (i==1) {
			
			int numCirc = Integer.parseInt( JOptionPane.showInputDialog("Deseja cadastrar quantos circulos?"));
			
			for (int k = 0; k<numCirc; k++) {
				figuraGeometrica fig = new figuraGeometrica("circulo");
				fig.cadastrarCirculo();
				figuraGeometrica[] tempfig = new figuraGeometrica[novafg.length+1];
			
				for(int j = 0; j<novafg.length; j++) {
					tempfig[j] = novafg[j];
				}
				tempfig[novafg.length] = fig;
	
				novafg = tempfig;
			}
		}	
		else return ;
		
		diametro();
	}
	
	public static void diametro() {
		for (int n = 0; n<novafg.length; n++) {
		 JOptionPane.showMessageDialog(null, "O valor do perimetro é: " + novafg[n].perimetroCirculo());
		 //JOptionPane.showMessageDialog(null, "O valor da area é:" + novafg[n].circulo[n].getArea());
		}
	}

}
