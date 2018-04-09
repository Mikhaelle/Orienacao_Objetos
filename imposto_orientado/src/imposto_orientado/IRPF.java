package imposto_orientado;

import javax.swing.JOptionPane;

public class IRPF {
	//associar a classe IRPF com os rendimentos
	Rendimento[] rends = new Rendimento [0];
	
	
	
	// cadastrar rendimento do usuario
	Rendimento cadastrarRendimento() {
		//1o passo: ler rendimento
		String desc = JOptionPane.showInputDialog("Informe o nome do rendimento");
		float val = Float.parseFloat(
			JOptionPane.showInputDialog("Informe o valor do rendimento:")
		);
				
		//instanciacao do objeto rendimento
// 		Rendimento tem = new Rendimento();
// 		temp.descricao = desc;
// 		temp.valor = val;
		
		Rendimento temp = new Rendimento(desc, val);
		
//		2o passo: Concretizar a relacao entre IRPF e Rendimento = armazenar temp no vetor rends
		int tamanhoRends = rends.length;
		int tamanhoNovoVetor= tamanhoRends+1;
		int posicaoNovoObjeto = tamanhoRends;
		
		Rendimento[] rendsTemp = new Rendimento[tamanhoNovoVetor];
		
//		Copiar as referencias de rends para rendsTemp (= copiar vetores)
		
		for (int i = 0; i< tamanhoRends; i++) {
			rendsTemp[i]=rends[i];
//		3o passo: Incluir temp em rendsTemp;
			rendsTemp[posicaoNovoObjeto] = temp;
//		4o passo: atualizar o vetor rends
		rends = rendsTemp;
		
		}
		return rends[posicaoNovoObjeto];
	}



	public float somaRendimentos() {
		float soma = 0;
		
		//for (int i=0; i<rends.length; i++) {
		//	soma = soma+rends[i].getValor();
		//}
			for (Rendimento d: rends)
		soma += d.getValor();
		return soma;
	}
	
	Rendimento consultaRendimento(String desc) {
		Rendimento resposta = null;
		
		for(Rendimento r : rends) {
			if(r.getDescricao().equalsIgnoreCase(desc))
				resposta = r;
			
		}
		return resposta;
	}
}
