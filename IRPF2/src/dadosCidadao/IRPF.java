package dadosCidadao;

import javax.swing.JOptionPane;

import calculoImposto.Imposto;
import movimentacao.Deducao;
import movimentacao.Rendimento;

public class IRPF {
	
	private Cidadao cid;
	
	Rendimento[] rendimentos = new Rendimento[0];
	Deducao[] deducoes = new Deducao[0];

	
	public IRPF(String nome, String sexo, String CPF) {
		cid = new Cidadao(nome, sexo, CPF);
	}

	public Cidadao getCidadao() {
		return cid;
	}

	public void cadastrarRendimento() {
		//1� parte cadastrar rendimentos.
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

	
	public double somaRendimento() {
		double somaRendimentos=0;
		for (int i =0; i< rendimentos.length; i++) {
			somaRendimentos += rendimentos[i].getValor();
		}
		return somaRendimentos;
	}

	public void listaRendimentos() {
		String print = "";
		for (int i=0; i<rendimentos.length; i++){
			print = print + rendimentos[i].getDescricao()+ " : " + rendimentos[i].getValor() + " R$ \n" ;
		}
		JOptionPane.showMessageDialog(null, "O rendimento total foi de : " + somaRendimento() + " R$ \n" + " Lista de rendimentos: \n" + print );
	}
	
	public int removerRendimento(String remover) {
		
		int valor=0;
		Rendimento[] tempRends = new Rendimento[rendimentos.length -1];
		
		for (int i = 0; i<rendimentos.length; i++) {
			if (!rendimentos[i].getDescricao().equals(remover)) {
	
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
	
	public void cadastrarDeducao() {
		//1a parte cadastrar rendimentos.
		String tempdescricao = JOptionPane.showInputDialog(null, "Informe o tipo da deducão:");
		double tempvalor = Double.parseDouble( JOptionPane.showInputDialog(null, "Informe o valor da dedução:"));
		Deducao ded = new Deducao(tempdescricao, tempvalor);
	
		//2a parte: armazenar rend
		Deducao[] tempDed = new Deducao[deducoes.length+1];
			for(int i = 0; i<deducoes.length; i++) {
				tempDed[i] = deducoes[i];
			}
			tempDed[deducoes.length] = ded;
	
			deducoes = tempDed;
	}
	
	
	public double somaDeducoes() {
		double somaDeducao =0;
		for (int i =0; i< deducoes.length; i++) {
			somaDeducao += deducoes[i].getValor();
		}
		return somaDeducao;
	}

	public void listaDeducao() {
		String print = "";
		for (int i=0; i<deducoes.length; i++){
			print = print + deducoes[i].getDescricao()+ " : " + deducoes[i].getValor() + " R$ \n" ;
		}
		JOptionPane.showMessageDialog(null, "A dedução total foi de : " + somaDeducoes() + " R$ \n" + " Lista de deduções: \n" + print );
	}
	
	public int removerDed(String remover) {
		
		int valor=0;
		Deducao[] tempDed = new Deducao[deducoes.length -1];
		
		for (int i = 0; i<deducoes.length; i++) {
			if (!deducoes[i].getDescricao().equals(remover)) {
	
				tempDed[i]=deducoes[i];	
			} else {
				valor = 1;
				for (int j=i+1; j < deducoes.length; j++) {
					tempDed[i] = deducoes[j];
				}
				deducoes=tempDed;
				break;
			}
			
		}
		return valor;
	}
	
	public int contaDed() {
		return deducoes.length;
	}
	
	public double somaDep() {
		return cid.somaDependente();
	}
	
	public double calculaImposto() {
		
		return Imposto.calculaImposto(this);
		
	}
}

