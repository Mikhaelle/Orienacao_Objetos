package transacoes;

import dados.ContaCorrente;

public class Deposito extends Transacao{

	public Deposito(ContaCorrente c, double val) {
		super(c,val);
		taxa = 0;
	}

	@Override
	public void executar() {
		conta.aumentarSaldo(valor);
		
	}
}
