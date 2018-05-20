package main;

import javax.swing.JOptionPane;

import calculos.CalculoCoef;
import calculos.CalculoJuros;
import calculos.CalculoParcela;

public class Cidadao {
	String nome;
	String cpf;
	
	public Cidadao(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public double calculoCoef(double numJu, int numMes) {	
		CalculoCoef calc = new CalculoCoef(numJu,numMes);
		return calc.getCoef();
		
	}
	
	public double calculoJuros(double parc, int meses, double valorfin) {
		return CalculoJuros.getValorDoJuros(parc, meses, valorfin);
	}
}
