package aplicacao;

import movimentacao.Rendimento;
import movimentacao.Deducao;
import javax.swing.JOptionPane;
import dadosCidadao.Cidadao;
import dadosCidadao.IRPF;


public class Principal {
	static IRPF ir = null;
	private static int numDependente; //Essa váriavel irá auxiliar na soma de deduções
	private static final int cadastrar_dependente = 1;
	private static final int apagar_dependente = 2;
	private static final int SAIR_DO_PROGRAMA = 0;
	private static final int cadastrar_rendimento = 3;
	private static final int atualizar_rendimento = 4;
	private static final int remover_rendimento = 5;
	private static final int pesquisar_rendimento = 6;
	private static final int cadastrar_deducao = 7;
	private static final int atualizar_deducao = 8;
	private static final int remover_deducao = 9;
	private static final int pesquisar_deducao = 10;
	
	
	public static void main(String[]args) {
	
	cadastrarNovoCidadao();
	
	int opcao = lerOpcaoDoMenu();
	
	while(opcao != SAIR_DO_PROGRAMA){
		switch(opcao){
		case cadastrar_dependente:
			cadastrarNovoDependente();
			break;
		case apagar_dependente:
			apagarDependente();
			break;
		case cadastrar_rendimento:
			cadastrarRendimento();
			break;
		case atualizar_rendimento:		
			atualizarRendimento(JOptionPane.showInputDialog(null, "Descrição do rendimento a ser atualizado"), 
					Double.parseDouble(
							JOptionPane.showInputDialog(null, "Novo valor ")
							));
			break;
		case remover_rendimento:
			removerRendimento(JOptionPane.showInputDialog(null, "Descrição do rendimento a ser removido"));
			break;
		case pesquisar_rendimento:
			pesquisarRendimento(
					JOptionPane.showInputDialog(null, "Descrição do rendimento"));
			break;
			
		case cadastrar_deducao:
			cadastrarDeducao();
			break;
		case atualizar_deducao:		
			atualizarDeducao(JOptionPane.showInputDialog(null, "Descrição da dedução a ser atualizado"), 
					Double.parseDouble(
							JOptionPane.showInputDialog(null, "Novo valor ")
							));
			break;
		case remover_deducao:
			removerRendimento(JOptionPane.showInputDialog(null, "Descrição da dedução a ser removido"));
			break;
		case pesquisar_deducao:
			pesquisarDeducao(
					JOptionPane.showInputDialog(null, "Descrição da deducao"));
			break;
			
		case SAIR_DO_PROGRAMA:
			JOptionPane.showMessageDialog(null,"[Programa será encerado!]");
			break;
		 default:
			 JOptionPane.showMessageDialog(null,"Opcao Invalida!");
			 break;
		}
		
		opcao = lerOpcaoDoMenu();
	}
	
}
	
	private static int lerOpcaoDoMenu(){
		String menu = "[-------- Menu ---------]";
		menu += "\n[1] - Cadastrar dependente";
		menu += "\n[2] - Apagar dependente";
		menu += "\n[3] - Cadastrar Rendimento";
		menu += "\n[4] - Atualiar Rendimento";
		menu += "\n[5] - Apagar Rendimento";
		menu += "\n[6] - Pesquisar Rendimento";
		menu += "\n[7] - Cadastrar Dedução";
		menu += "\n[8] - Atualiar Dedução";
		menu += "\n[9] - Apagar Dedução";
		menu += "\n[10] - Pesquisar Dedução";
		menu += "\n[0] - Sair";
		menu += "\n[ ------------------------- ]";
		menu += "\nInforme sua opcao: ";
		
		String strOpcao = JOptionPane.showInputDialog(null,menu);
		
		return Integer.parseInt(strOpcao);
	}
	
	
	
	private static void cadastrarNovoCidadao(){
		String nome = JOptionPane.showInputDialog("Entre com o nome do cidadao:");
		String sexo = JOptionPane.showInputDialog("Entre com o sexo do cidadao:");
		String CPF = JOptionPane.showInputDialog("Entre com o cpf do cidadao:");
		ir = new IRPF(nome, sexo, CPF);
	}
	
	private static void cadastrarNovoDependente(){
		 numDependente = Integer.parseInt(JOptionPane.showInputDialog("Quantos dependentes deseja cadastrar?"));
		
		Cidadao c = ir.getCidadao();
	
		for (int i=0; i<numDependente; i++){
		c.cadastrarDependente();
		}
	}
	
	private static void apagarDependente() {
		Cidadao c = ir.getCidadao();
		if(c.contaDependente()==0) {
			JOptionPane.showMessageDialog(null, "Não há dependentes cadastrados");
			return;
		}
		
		String nomeRemover = JOptionPane.showInputDialog("Informe o nome do dependente que deseja remover");
		
		if(c.removerDependente(nomeRemover) == 0) {
			JOptionPane.showMessageDialog(null, "Náo há dependentes com esse nome");
		}
			else {
				JOptionPane.showMessageDialog(null, "Dependente removido");
			}
		return;
	}
	
	//CRUD para rendimentos
	//create
	
	static Rendimento[] rends = new Rendimento[0];
	
	public static void cadastrarRendimento() {
		Rendimento r = new Rendimento();
		r.rendimentoDesc = JOptionPane.showInputDialog(null, "Descrição do Rendimento");
		r.valor = Double.parseDouble(
				JOptionPane.showInputDialog(null, "Valor do Rendimento")
				);
		Rendimento[] tempRends = new Rendimento[rends.length +1];
		for(int i = 0 ; i < rends.length ; i++) {
			tempRends[i] = rends[i];
		}
		tempRends[rends.length] = r;
		rends = tempRends;
	}
	//update
	
	public static void atualizarRendimento(String nome, double valor) {
		for(int i = 0 ; i < rends.length ;i++) {
			if(rends[i].rendimentoDesc == nome) {
				rends[i].valor = valor;
			}else {
				JOptionPane.showMessageDialog(null, "Não há rendimento com esse nome");
			}
		}
	}
	//Read
	public static void pesquisarRendimento(String nome) {
		for(Rendimento r: rends) {
			if(r.rendimentoDesc.equalsIgnoreCase(nome)) {
				JOptionPane.showMessageDialog(null, "Descrição:" + r.rendimentoDesc + "\n" +
							"Valor: " + r.valor
						);
				
			}else {
				JOptionPane.showMessageDialog(null, "Não existe rendimentos com esse nome");
			}
				
		}
		
	}
	
	
	//Delete
	
	public static void removerRendimento(String remover) {
		Rendimento[] tempRends = new Rendimento[rends.length -1];
		for(int i = 0 ; i < tempRends.length ; i++) {
			if(!rends[i].rendimentoDesc.equals(remover)) {
				tempRends[i] = rends[i];
			}else {
				for(int j = i+1 ; j < rends.length ; j++) {
					tempRends[i] = rends[j];
				}
				rends = tempRends;
				break;
			}
		}
		
	}
	
	public static double somarRendimento() {
		double somaRends = 0;
		for(int i = 0 ; i <= rends.length; i++) {
			somaRends += rends[i].valor;
		}
		return somaRends;
	}
	
	//CRUD deduções
	//create
	static Deducao[] deds = new Deducao[0];
	
	public static void cadastrarDeducao() {
		Deducao ded = new Deducao();
		ded.desc = JOptionPane.showInputDialog(null, "Descrição da deduçao");
		ded.valor = Double.parseDouble(
				JOptionPane.showInputDialog(null, "Valor da dedução")
				);
		Deducao[] tempdeds = new Deducao[deds.length +1];
		for(int i = 0 ; i < deds.length ; i++) {
			tempdeds[i] = deds[i];
		}
		tempdeds[deds.length] = ded;
		deds = tempdeds;
	}
	
	//atualizar
	public static void atualizarDeducao(String nome, double valor) {
		for(int i = 0 ; i < deds.length ;i++) {
			if(deds[i].desc == nome) {
				deds[i].valor = valor;
			}else {
				JOptionPane.showMessageDialog(null, "Não há Deduções com esse nome");
			}
		}
	}
	
	//Read
	public static void pesquisarDeducao(String nome) {
		for(Deducao d: deds) {
			if(d.desc.equalsIgnoreCase(nome)) {
				JOptionPane.showMessageDialog(null, "Descrição:" + d.desc + "\n" +
							"Valor: " + d.valor
						);
				
			}else {
				JOptionPane.showMessageDialog(null, "Não existe rendimentos com esse nome");
			}
				
		}
		
	}
	
	//Delete	
		public static void removerDeducao(String remover) {
			Deducao[] tempdeds = new Deducao[deds.length -1];
			for(int i = 0 ; i < tempdeds.length ; i++) {
				if(!deds[i].desc.equals(remover)) {
					tempdeds[i] = deds[i];
				}else {
					for(int j = i+1 ; j < rends.length ; j++) {
						tempdeds[i] = deds[j];
					}
					deds = tempdeds;
					break;
				}
			}
			
		}
	//somar total de deduções
		
	//Como utilizar o "valosdeps" armazenado na classe Dependente ao invés de usar 189.89 diretamete no cálculo? 	
		public static double somarDeducao() {
			double somadeds = 0;
			for(int i = 0 ; i <= deds.length; i++) {
				somadeds += deds[i].valor;
			}
			if(numDependente > 0) {
				somadeds += 189.89 * numDependente;
			}
			return somadeds;
		}	
	
	
	

}

