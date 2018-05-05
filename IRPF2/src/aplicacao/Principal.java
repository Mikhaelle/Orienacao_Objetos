package aplicacao;

import dadosCidadao.Cidadao;
import dadosCidadao.IRPF;

public class Principal {

	public static void main(String[]args) {
	// Tarefa: cadastrar Dependente
	IRPF ir = new IRPF("Mikha","Feminino","000.000.000.000");
	Cidadao c = ir.getCidadao();
	c.cadastrarDependente();
	}
}
