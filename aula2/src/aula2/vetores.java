package aula2;

import javax.swing.JOptionPane;

public class vetores {
	public static void main (String[] args) {
		
		int nota[];
		float pesos[];
		
		float media = 0;
		
		final int numatividades ;
		boolean soma10 = false;
		
		numatividades = Integer.parseInt(
				JOptionPane.showInputDialog("Informe a qtde de avaliações")
		);
				
		nota= new int[numatividades];
		pesos= new float[numatividades];
		
		do {
		for (int i = 0; i < numatividades; i++) {
			pesos[i] = Float.parseFloat(
					JOptionPane.showInputDialog("Informe o peso da avaliação" + (i+1))
					);
			soma10 = pesoSoma10(pesos);
		}
		}while(!soma10);
		
		for (int i = 0; i < numatividades; i++) {
			nota[i] = Integer.parseInt(
					JOptionPane.showInputDialog("informe a nota da valiação " + (i+1))
					);
		}
		
			
		for (int i=0; i< numatividades;i++) {
			media += nota[i]*pesos[i];
		}
		
		media /= 10;
		
		JOptionPane.showInternalMessageDialog(null, "Média:" + media);
		
}
	private static boolean pesoSoma10(float[] pesos) {
		int soma = 0;
		for (int i=0; i<pesos.length; i++) //como acessou o n de atividades em peso(peso.lengh
		{
			soma += pesos[i];
		}
		return (soma == 10);
	}
}