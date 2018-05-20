package transacoes;

import dados.ContaCorrente;

public abstract class Transacao {
	double valor;
	int taxa;
	ContaCorrente conta;
	
	public Transacao(ContaCorrente cont, double val) {
		conta = cont;
		valor = val;
	}
	
	public abstract void executar();


}
