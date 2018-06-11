import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		float l1, l2, l3;

		l1 = Float.parseFloat(JOptionPane.showInputDialog("Informe l1"));
		l2 = Float.parseFloat(JOptionPane.showInputDialog("Informe l2"));
		l3 = Float.parseFloat(JOptionPane.showInputDialog("Informe l3"));
		
		try {
			Triangulos t=Triangulos.obterTriangulo(l1, l2, l3);
		}catch(LadosInvalidosTrianguloException e) {
			e.printStackTrace();
		}

	}

}
