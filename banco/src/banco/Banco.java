package banco;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import dados.ContaCorrente;
import dados.Correntista;

public class Banco {
	String nome;
	int proxAgencia = 100;
	int proxConta = 1000;

	ArrayList<Correntista> correntistas = new ArrayList<Correntista>();

	// Correntista[] correntista = new Correntista[1];

	public Banco(String n) {
		nome = n;
		criarCorrentista();
	}

	public void criarCorrentista() {
		proxAgencia++;
		proxConta++;
		correntistas.add(new Correntista("Mikhaelle", "0", proxAgencia, proxConta));
		proxAgencia++;
		proxConta++;
		correntistas.add(new Correntista("Lucas", "0", proxAgencia, proxConta));
	}

	public ContaCorrente acharContaCorrente(int agencia, int conta) {
		for (int i =0; i<2; i++) {
			if (agencia == correntistas.get(i).contadoCorrentista.getAgencia())
			{
				if (conta == correntistas.get(i).contadoCorrentista.getConta()){
					return correntistas.get(i).contadoCorrentista;
				}
			}
		}
		return null;
	}

}
