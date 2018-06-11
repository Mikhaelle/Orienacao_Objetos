
public class Triangulos {

	float a, b, c;

	public Triangulos(float l1, float l2, float l3) {
		a = l1;
		b = l2;
		c = l3;
	}

	public static Triangulos obterTriangulo(float l1, float l2, float l3) throws LadosInvalidosTrianguloException {
		Triangulos resposta = null;

		if ((Math.abs(l1 - l2) <= l3) && ((l1 + l2) >= l3))

			if ((Math.abs(l2 - l3) <= l1) && ((l2 + l3) >= l1))
				if ((Math.abs(l1 - l3) <= l2) && ((l1 + l3) >= l2))
					return new Triangulos(l1, l2, l3);

		throw new LadosInvalidosTrianguloException(l1, l2, l3);

	}

}
