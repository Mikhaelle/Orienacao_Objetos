package progrecao_aritmetica;

import javax.swing.JOptionPane;

public class calculo_pa {
	public static void main(String[] args) {

		int n_termos;
		int razao;
		double primeiro_termo;
		double resultado;
		
		
		n_termos = Integer.parseInt(
				JOptionPane.showInputDialog("Informe o número de inteiros")
		);
		
		razao = Integer.parseInt(
				JOptionPane.showInputDialog("Informe a razão")
		);
		
		primeiro_termo = Double.parseDouble(
				JOptionPane.showInputDialog("Informe o valor do primeiro termo")
		);
		
		for (int i = 1; i <= n_termos; i++) {
			resultado = (primeiro_termo +((i-1)*razao));
			
			JOptionPane.showMessageDialog(null, "a" + i + " = "+ resultado );
		}
		
	}

}
