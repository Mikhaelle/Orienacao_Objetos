package movimentacao;

public class Deducao {
	public String desc;
	public double valor;
	
	private final int cp = 1000; //Contribuição previdenciária
	private final int ps = 300;  //Plano de saúde 
	private final int pa = 600;  //Penção alimentícia
	private final double dp = 189.59; //valor por Dependente
	double totalDeducoes = 0;
	
	
}
