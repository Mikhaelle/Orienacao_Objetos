package movimentacao;

public class Deducao {
	private String descricao;
	private double valor;
	 
	 public Deducao(String d, double v) {
		 descricao = d;
		 valor = v;
	 }
	 
	 public String getDescricao() {
		 return descricao;
	 }
	 
	 public double getValor() {
		 return valor;
	 }
}
