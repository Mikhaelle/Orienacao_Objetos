package calculoImposto;

import dadosCidadao.IRPF;

public class Imposto {
	double valorImp;
	static double valorRend;
	static double valorDed;
	static double valorDep;

	
	public static double calculaImposto(IRPF irpf) {
		valorRend = irpf.somaRendimento();
		valorDed = irpf.somaDeducoes();
		valorDep = irpf.somaDep();
		
		Base base = new Base(valorRend, valorDed, valorDep);
		
		Faixa faixa = new Faixa(base.getValor());
		
		return faixa.getValor();
	}
	

	
}
