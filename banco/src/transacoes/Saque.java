package transacoes;

import dados.ContaCorrente;

public class Saque extends Transacao {
	
	public Saque (ContaCorrente c, double val) {
		super(c,val);
		taxa = 4;
	}

	public void executar() {
		conta.deduzirSaldo(valor + taxa);
		
	}
	
}
