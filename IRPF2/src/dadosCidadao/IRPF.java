package dadosCidadao;

import javax.swing.JOptionPane;

import movimentacao.Deducao;
import movimentacao.Rendimento;
import dadosCidadao.IRPF;

public class IRPF {
	static IRPF ir = null;
	private static int numDependente; //Essa váriavel irá auxiliar na soma de deduções
	
	private Cidadao cid;
	

	public IRPF(String nome, String sexo, String CPF) {
		cid = new Cidadao(nome, sexo, CPF);
	}

	public Cidadao getCidadao() {
		return cid;
	}
}