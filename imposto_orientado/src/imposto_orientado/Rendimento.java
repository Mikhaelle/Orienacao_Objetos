package imposto_orientado;

public class Rendimento {
	String descricao;
	float valor;

	public Rendimento(String desc, float val) {
		descricao = desc;
		valor= val;
	}
	String getDescricao() {
		return descricao;
	}
	float getValor() {
		return valor;
	}
	
}
