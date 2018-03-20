package atividade_aula;

import javax.swing.JOptionPane;

public class imposto {
	public static void main (String[]args){
		double rendimentos;
		int dependentes;
		double deducoes,total,contaImposto = 0;
		double previdenciaOficial, pensaoAlimenticia, outros;
		
		rendimentos = Double.parseDouble(
		JOptionPane.showInputDialog("Informe o total de rendimentos")
		);
		
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
			JOptionPane.showMessageDialog(null, "O total de imposto é: " + total);
			
		if(total<1903.98){
			contaImposto = 0;
		}
		else if(total<2826.66 && total>=1903.99){
			contaImposto = ((total-1903.99)*0.075);
					}
		else if(total<3751.06 && total>=2826.67) {
			contaImposto= (((total-2826.67)*0.15)+ 69.225);
		}
		else if(total<4664.69 && total>=3351.07){
			contaImposto=(((total-3351.07)*0.225)+ 69.225 + 138.7585);
		}
		else {
			contaImposto=(((total-4664.69)*0.275)+ 69.225 + 138.7585 + 295.5645);	
		}
		JOptionPane.showMessageDialog(null, "O total de imposto é: " + contaImposto);
		}
	}

