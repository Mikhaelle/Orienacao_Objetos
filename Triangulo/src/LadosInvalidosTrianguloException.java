
public class LadosInvalidosTrianguloException extends Exception {

	public LadosInvalidosTrianguloException(float l1, float l2, float l3) {
		super(l1 + "," + l2 + "," + l3 + "," + "nao atendem as condicoes de existencia de um triangulo");
	}
}
