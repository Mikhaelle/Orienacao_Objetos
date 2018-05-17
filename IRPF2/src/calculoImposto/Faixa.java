package calculoImposto;

import javax.swing.JOptionPane;

//faixas de imposto
public class Faixa {
	private double totalDeduzido;
	
	

	public Faixa(double quantia){
		if(quantia <= 1903.98){
			JOptionPane.showMessageDialog(null, "Contribuinte Insento");
		}
		else if(quantia > 1903.98 && quantia <= 2826.66 ){
			quantia -= 1903.98;
			totalDeduzido = (quantia * 0.075);
		}
		else if(quantia > 2826.66 && quantia <= 3751.06){
			quantia -= 2826.66;
			totalDeduzido = (quantia * 0.15) + 69.20;
		}
		else if(quantia > 3751.06 && quantia <= 4682.69){
			quantia -= 3751.06;
			totalDeduzido = (quantia * 0.225) + 69.20 + 138.66;
			
		}
		else if(quantia > 4682.69){
			quantia -= 4682.69;
			totalDeduzido = (quantia * 0.275) + 69.20 + 138.66 + 209.61;
		}
		
	}

	public double getValor() {
		return totalDeduzido;
	}
}
