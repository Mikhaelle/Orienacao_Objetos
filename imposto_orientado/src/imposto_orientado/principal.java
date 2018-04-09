package imposto_orientado;

import javax.swing.JOptionPane;

public class principal {
	public static void main (String[]args)
	{
		IRPF irpf = new IRPF();
		
		for(int i=0; i<3; i++)
			irpf.cadastrarRendimento();
		
		float totalRendimentos = irpf.somaRendimentos();
		String resposta = "O valor total de rendimento é igual a" + totalRendimentos;
		JOptionPane.showMessageDialog(null, resposta);
		
		String pesquisa = JOptionPane.showInputDialog("Qual o nome do rendimento a ser pesquisado?");
		Rendimento resultado = irpf.consultaRendimento(pesquisa);
		
		if(resultado == null)
			JOptionPane.showMessageDialog(null, "Nenhum rendimento encontrado");
		else 
			JOptionPane.showMessageDialog(null, "Valor do rendimento:" + resultado.getValor());
	}

}
