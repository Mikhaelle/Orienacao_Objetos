import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Media n = new Media();

		int opcao = JOptionPane.showConfirmDialog(null, "Dseja ler um numero?");

		while (opcao == JOptionPane.YES_OPTION) {
			int num = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero"));
			n.adicionarNumero(num);
			opcao = JOptionPane.showConfirmDialog(null, "Dseja ler um numero?");
		}

		try {
		JOptionPane.showMessageDialog(null, "A media é: " + n.calcularMedia());
	
		}catch(ArithmeticException e) {
			JOptionPane.showMessageDialog(null, "Excecao capturada em main");
			e.printStackTrace();
		}
	}
}
