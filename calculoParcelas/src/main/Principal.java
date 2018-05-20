package main;

import javax.swing.JOptionPane;

import calculos.CalculoJuros;
import calculos.CalculoParcela;

public class Principal {

	public static void main(String[] args) {

		String cidnome = JOptionPane.showInputDialog("Entre com o seu nome");
		String cidcpf = JOptionPane.showInputDialog("Entre com o seu cpf");

		int resposta = JOptionPane.NO_OPTION;

		while (resposta != JOptionPane.YES_OPTION) {
			resposta = JOptionPane.showConfirmDialog(null, "Deseja fazer uma simula��o ?", "Bem vindo",
					JOptionPane.YES_NO_OPTION);

			if (resposta == JOptionPane.YES_OPTION) {

				Cidadao cid = new Cidadao(cidnome, cidcpf);
				double numJu = Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor da taxa de Juros"));
				int numMes = Integer.parseInt(JOptionPane.showInputDialog("Entre com a quantidade de meses"));

				double coef = cid.calculoCoef(numJu, numMes);
				JOptionPane.showMessageDialog(null, "O coeficiente de financiamento � : " + coef);

				double valor = Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor a ser financiado"));

				double parc = CalculoParcela.getvalorParc(coef, valor);
				JOptionPane.showMessageDialog(null, "O valor da parcela � de : " + parc);

				double juros = CalculoJuros.getValorDoJuros(parc, numMes, valor);
				JOptionPane.showMessageDialog(null, "O valor acrescentado em decorrencia do juros � de : " + juros);
				resposta = JOptionPane.NO_OPTION;
			}
			

		}
	}
}
