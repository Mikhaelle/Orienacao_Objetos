package aplicacao;

import javax.swing.JOptionPane;

import dadosCidadao.Cidadao;
import dadosCidadao.IRPF;

public class Principal {
	static IRPF ir = null;
	
	private static final int cadastrar_dependente = 1;
	private static final int apagar_dependente = 2;
	private static final int SAIR_DO_PROGRAMA = 3;
	
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
		menu += "\n[3] - Sair";
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
	int numDependente = Integer.parseInt(JOptionPane.showInputDialog("Quantos dependentes deseja cadastrar?"));
	
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
			JOptionPane.showMessageDialog(null, "Não há dependentes com esse nome");
		}
			else {
				JOptionPane.showMessageDialog(null, "Dependente removido");
			}
		return;
	}
	

}

