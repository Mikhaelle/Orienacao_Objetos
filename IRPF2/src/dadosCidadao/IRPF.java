package dadosCidadao;

public class IRPF {
	
	private Cidadao cid;
	

public IRPF(String nome, String sexo, String CPF) {
	cid = new Cidadao(nome, sexo, CPF);
}

public Cidadao getCidadao() {
	return cid;
}


}