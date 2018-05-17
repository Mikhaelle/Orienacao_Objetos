package movimentacao;


public class Rendimento {
	 private String descricao;
	 private double valor;
	

	public Rendimento(String d, double v) {
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
