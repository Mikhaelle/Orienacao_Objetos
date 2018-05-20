package transacoes;

import dados.ContaCorrente;

public class Transferencia extends Transacao{
	
	ContaCorrente contaDestino;
	public Transferencia(ContaCorrente c, double valor, ContaCorrente c2) {
		super(c,valor);
		contaDestino = c2;
		taxa = 8;
	}

	@Override
	public void executar() {
		conta.deduzirSaldo(valor + taxa);
	}


}
