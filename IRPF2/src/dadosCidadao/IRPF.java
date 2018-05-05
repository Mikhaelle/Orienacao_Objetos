package dadosCidadao;

public class IRPF {
	
	String nome;
	String sexo;
	String CPF;
	private Cidadao cid;
	
public IRPF() {
	
}

public IRPF(Cidadao c){
	cid = c;
}

public IRPF(String nome, String sexo, String CPF) {
	cid = new Cidadao(nome, sexo, CPF);
	cid.nome= nome;
	cid.sexo = sexo;
	cid.CPF = CPF;
	
}

public Cidadao getCidadao() {
	return cid;
}

}