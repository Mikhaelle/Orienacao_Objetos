package dadosCidadao;

import javax.swing.JOptionPane;

import movimentacao.Rendimento;

public class IRPF {
	
	private Cidadao cid;
	
	Rendimento[] rendimentos = new Rendimento[0];
	

	public IRPF(String nome, String sexo, String CPF) {
		cid = new Cidadao(nome, sexo, CPF);
	}

	public Cidadao getCidadao() {
		return cid;
	}

	public void cadastrarRendimento() {
		//1º parte cadastrar rendimentos.
		String tempdescricao = JOptionPane.showInputDialog(null, "Informe o tipo do rendimento:");
		double tempvalor = Double.parseDouble( JOptionPane.showInputDialog(null, "Informe o valor do rendimento:"));
		Rendimento rend = new Rendimento(tempdescricao, tempvalor);
	
		//2a parte: armazenar rend
		Rendimento[] tempRends = new Rendimento[rendimentos.length+1];
			for(int i = 0; i<rendimentos.length; i++) {
				tempRends[i] = rendimentos[i];
			}
			tempRends[rendimentos.length] = rend;
	
			rendimentos = tempRends;
	}

	public void listaRendimentos() {
		String print = "";
		for (int i=0; i<rendimentos.length; i++){
			print = print + rendimentos[i].descricao+ " : " + rendimentos[i].valor + " R$ \n" ;
		}
		JOptionPane.showMessageDialog(null, " Lista de rendimetnos: \n" + print);
	}
	
	public int removerRendimento(String remover) {
		
		int valor=0;
		Rendimento[] tempRends = new Rendimento[rendimentos.length -1];
		
		for (int i = 0; i<rendimentos.length; i++) {
			if (!rendimentos[i].descricao.equals(remover)) {
	
				tempRends[i]=rendimentos[i];	
			} else {
				valor = 1;
				for (int j=i+1; j < rendimentos.length; j++) {
					tempRends[i] = rendimentos[j];
				}
				rendimentos=tempRends;
				break;
			}
			
		}
		return valor;
	}
	public int contaRendimento() {
		return rendimentos.length;
	}

}

