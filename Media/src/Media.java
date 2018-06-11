import javax.swing.JOptionPane;

public class Media {

	private int[] numeros;

	public Media() {
		numeros = new int[0];
	}

	public boolean adicionarNumero(int n) throws ArithmeticException{

		int[] novoVetor = new int[numeros.length + 1];

		for (int i = 0; i < numeros.length; i++) {
			novoVetor[i] = numeros[i];
		}

		novoVetor[numeros.length] = n;

		numeros = novoVetor;
		return true;

	}

	public float calcularMedia() {
		int soma = 0;
		int n = 0;
		for (int i : numeros) {
			soma += i;
			n++;
		}
		float media;
	//	try {
			media = soma / n;
	//	} catch (ArithmeticException e) {
	//		JOptionPane.showMessageDialog(null, "Capturei a excecao!!!!");
//			media = Float.MAX_VALUE;
	//		e.printStackTrace();
//		}finally {
	//		JOptionPane.showMessageDialog(null, "Entrei no finaly");
//		}
		return media;

	}

}
