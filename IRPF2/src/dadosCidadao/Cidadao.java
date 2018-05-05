package dadosCidadao;

import javax.swing.JOptionPane;

public class Cidadao {
	String nome;
	String sexo;
	String CPF;
	
	Dependente[] deps = new Dependente[0];
	
	public Cidadao(String n, String s, String c) {
		nome = n;
		sexo = s;
		CPF = c;
	}
	public void cadastrarDependente() {
		
		// 1a parte: criar objeto de dependente
		Dependente d = new Dependente();
		String tempNome = JOptionPane.showInputDialog(null, "Informe o nome do dependente:");
		String tempSexo = JOptionPane.showInputDialog(null, "Informe o sexo do dependente:");
		d.nome = tempNome;
		d.sexo = tempSexo;
		
		//2a parte: armazenar d em deos
		Dependente[] tempDeps = new Dependente[deps.length+1];
				for(int i = 0; i<deps.length; i++) {
					tempDeps[i] = deps[i];
				}
		tempDeps[deps.length] = d;
		
		deps = tempDeps;

	}
	
	Dependente pesquisarDependente(String nome) {
		
		Dependente resposta = null;
		for (Dependente d: deps) {
			if ( d.nome.equalsIgnoreCase(nome)) {
				resposta = d;
			}
		}
		return resposta;
	}
	
	public int removerDependente(String remover) {
		int valor=0;
		Dependente[] tempDeps = new Dependente[deps.length -1];
		
		for (int i = 0; i<tempDeps.length; i++) {
			if (!deps[i].nome.equals(remover)) {
				
				tempDeps[i]=deps[i];	
			} else {
				valor = 1;
				for (int j=i+1; j < deps.length; j++) {
					tempDeps[i] = deps[j];
				}
				deps=tempDeps;
				break;
			}
			
		}
		return valor;
	}
	
	public int contaDependente() {
		return deps.length;
	}
}
