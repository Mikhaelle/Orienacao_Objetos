
public class Aluno {
	private String nome;
	private int matricula;
	private String email;

	public Aluno() {

	}

	public Aluno(String n, int m, String e) {
		nome = n;
		matricula = m;
		email = e;
	}

	public String getNome() {
		// TODO Auto-generated method stub
		return nome;
	}

	public String toString() {
		String resposta = "";
		resposta += "NOME: " + nome + '\n';
		resposta += "Matricula: " + matricula + '\n';
		resposta += "EMAIL: " + email + '\n';
		resposta += "-------------------------------";
		return resposta;
	}

}
