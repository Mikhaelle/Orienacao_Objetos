package atividade_aula;

import javax.swing.JOptionPane;

public class impostos {
	public static void main (String[]args)
	{
		double rendimentos;
		int  posDeducao,dependentes;
		double deducoes,total;
		double previdenciaOficial, pensaoAlimenticia, outros,totalDeImposto ;
		
		rendimentos = Double.parseDouble(
		JOptionPane.showInputDialog("Informe o total de rendimentos")
		);
		
		posDeducao = Integer.parseInt(
		JOptionPane.showInputDialog("Possui dedução? Se sim aperte 1 se não aperte 0")
		);
				
		if (posDeducao==0) {
			 totalDeImposto = calculoDoImposto(rendimentos);
			 
			 JOptionPane.showMessageDialog(null, "O total de imposto é: " + totalDeImposto);
		}
		else {
			previdenciaOficial=Double.parseDouble(
					JOptionPane.showInputDialog("Informe valor de previdência oficial")
			);
			dependentes = Integer.parseInt(
					JOptionPane.showInputDialog("Informe o número de dependentes")
			);
			pensaoAlimenticia=Double.parseDouble(
					JOptionPane.showInputDialog("Informe valor da pensão alimentícia")
			);
			outros=Double.parseDouble(
					JOptionPane.showInputDialog("Informe valor de outras deduções")
			);
			
			deducoes = previdenciaOficial+ (dependentes*189.59)+ pensaoAlimenticia + outros;
			total = rendimentos - deducoes;
			totalDeImposto = calculoDoImposto(total);
			
		}
	}
	
	private static double calculoDoImposto(double total) {
		
		double soma[];
		//double total;
		//double soma;
		if(total<1903.98){
			
		}
		else if(total<2826.66 && total>=1903.99){
			//colocar constantes e calculos
		}
		else if(total<3751.06 && total>=2826.67) {
		
		}
		else if(total<4664.69 && total>=3351.07)
		{
		
		}
		else {
			
		}
		
		return total;
	}
	

}
