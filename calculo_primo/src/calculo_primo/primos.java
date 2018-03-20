package calculo_primo;

import javax.swing.JOptionPane;

public class primos {
	
	public static void main(String[] args) {
		int intervalo;
		boolean dividiu;
		
		intervalo = Integer.parseInt(
				JOptionPane.showInputDialog("Informe o numero de intervalos")
				);
		
		for (int i = 2; i <= intervalo; i++) {
			dividiu=false;
			for (int j = 2; j < i ; j++) {
				if(i%j==0){
					dividiu=true;
					break;
				}
			}
			
			if(dividiu==false){
				JOptionPane.showMessageDialog(null, i + " é primo");
			}
		}
		
	}

}
