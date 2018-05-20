package dados;

import javax.swing.JOptionPane;

public class Correntista {
	public String nome;
	String CPF;
	
	public ContaCorrente contadoCorrentista;
	
	public Correntista(String n, String cpf, int agencia, int conta) {
		nome = n;
		CPF = cpf;
		contadoCorrentista = new ContaCorrente(agencia, conta);
	}
	

}
