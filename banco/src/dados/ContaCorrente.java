package dados;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import transacoes.Transacao;

public class ContaCorrente {
	private int agencia;
	private int conta;
	private double saldo = 0;
	ArrayList<Transacao> transacoes = new ArrayList<Transacao>();
	
	public void executarTransacao(Transacao t) {
		t.executar();
		transacoes.add(t);
	}
	
	public int getAgencia() {
		return agencia;
	}

	public int getConta() {
		return conta;
	}

	public ContaCorrente (int a, int c) {
		agencia = a;
		conta = c;
	}
	
	public void deduzirSaldo(double novoSaldo) {
		if(saldo >= novoSaldo) {
			
		saldo = saldo-novoSaldo;
		}
		else{
			JOptionPane.showMessageDialog(null, "Saldo insuficiente para a transação");
		}
	}
	
	public void aumentarSaldo(double novoSaldo) {
		saldo = saldo+novoSaldo;
	}
	
	public double getsaldo() {
		return saldo;
	}

}
