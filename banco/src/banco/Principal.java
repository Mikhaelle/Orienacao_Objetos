package banco;

import javax.swing.JOptionPane;

import dados.ContaCorrente;
import transacoes.Deposito;
import transacoes.Saque;
import transacoes.Transacao;
import transacoes.Transferencia;

public class Principal {

	private static final int ver_saldo = 1;
	// private static final int ver_transacoes = 2;
	private static final int fazer_saque = 3;
	private static final int fazer_deposito = 4;
	private static final int fazer_transferencia = 5;
	private static final int SAIR_DO_PROGRAMA = 6;

	static ContaCorrente c;
	static Banco banco = new Banco("Banco do Lucas");
	
	public static void main(String[] args) {
		
		
		int resposta = JOptionPane.NO_OPTION;

		while (resposta != JOptionPane.YES_OPTION) {
			resposta = JOptionPane.showConfirmDialog(null, "Deseja fazer uma operação ?", "Bem vindo",
					JOptionPane.YES_NO_OPTION);

			if (resposta == JOptionPane.YES_OPTION) {
				int agencia = Integer.parseInt(JOptionPane.showInputDialog("Entre com o numero da sua agencia: "));
				int conta = Integer.parseInt(JOptionPane.showInputDialog("Entre com o numero da conta"));
				c = banco.acharContaCorrente(agencia, conta);

				if (c == null) {
					JOptionPane.showMessageDialog(null, "Agencia ou conta incorreta");
					resposta = JOptionPane.NO_OPTION;
					continue;
				}
				int opcao = lerOpcaoDoMenu();

				while (opcao != SAIR_DO_PROGRAMA) {
					switch (opcao) {
					case ver_saldo:
						JOptionPane.showMessageDialog(null, "Seu saldo é de : " + saldoContaCorrente());
						break;
					// case ver_transacoes:
					// apagarDependente();
					// break;
					 case fazer_saque:
					 fazerSaque();
					 break;
					 case fazer_deposito:
					 fazerdeposito();
					 break;
					case fazer_transferencia:
					fazerTransferencia();
					break;
					case SAIR_DO_PROGRAMA:
						JOptionPane.showMessageDialog(null, "[Programa será encerado!]");
						break;
					default:
						JOptionPane.showMessageDialog(null, "Opcao Invalida!");
						break;
					}

					opcao = lerOpcaoDoMenu();
				}

			}

		}
	}


	private static int lerOpcaoDoMenu() {
		String menu = "[-------- Menu ---------]";
		menu += "\n[1] - Saldo";
		menu += "\n[2] - Transações";
		menu += "\n[3] - Fazer saque";
		menu += "\n[4] - Fazer deposito";
		menu += "\n[5] - Fazer transferência";
		menu += "\n[6] - Sair";
		menu += "\n[ ------------------------- ]";
		menu += "\nInforme sua opcao: ";

		String strOpcao = JOptionPane.showInputDialog(null, menu);

		return Integer.parseInt(strOpcao);
	}

	private static double saldoContaCorrente() {
		double valorSaldo = c.getsaldo();
		return valorSaldo;
	}
	
	private static void fazerdeposito() {
		double valorDep = Double.parseDouble((JOptionPane.showInputDialog("Entre com o valor do depósito")));
		Deposito dep = new Deposito(c,valorDep);
		c.executarTransacao(dep);
	}
	
	private static void fazerSaque() {
		double valorSaq = Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor do saque"));
		Saque saq = new Saque(c,valorSaq);
		c.executarTransacao(saq);
	}
	
	private static void fazerTransferencia() {
		ContaCorrente c2;
		int agencia = Integer.parseInt(JOptionPane.showInputDialog("Entre com o numero da agencia de destino: "));
		int conta = Integer.parseInt(JOptionPane.showInputDialog("Entre com o numero da conta de destino:"));
		c2 = banco.acharContaCorrente(agencia, conta);

		if (c2 == null) {
			JOptionPane.showMessageDialog(null, "Agencia ou conta incorreta");
			return;
		}
		
		double valTransfer= Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor da transferência"));
		Transferencia trans = new Transferencia(c,valTransfer,c2);
		c.executarTransacao(trans);
	}

	// int numCorrentista = Integer.parseInt(JOptionPane.showInputDialog("Quantos
	// correntistas deseja cadastrar?"));

	// for(int n=0; n <numCorrentista; n++) {
	// String nome = JOptionPane.showInputDialog("Qualo nome do correntista ?");
	// String cpf = JOptionPane.showInputDialog("Qual o cpf do correntista?");
	// banco.criarCorrentista(nome, cpf);
	// }

}
