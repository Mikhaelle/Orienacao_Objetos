import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Turma {
	String nome;
	int codigo;

	// Aluno[] alunos;

	List<Aluno> alunos;

	public Turma() {
		alunos = new LinkedList<Aluno>();
		// alunos = new Aluno[0];

	}

	public boolean matricular(Aluno a) {
		boolean resposta = alunos.add(a);
		return resposta;
		// algoritimo para matricular aluno
	}

	public boolean desmatricular(Aluno a) {
		boolean resposta = alunos.remove(a);
		return resposta;
		// algoritimo para desmatricular o aluno
	}

	public Aluno pesquisarAluno(String nome) {
		Aluno resposta = null;
		for (Aluno a : alunos) {
			if (a.getNome().equalsIgnoreCase(nome)) {
				resposta = a;
			}

		}
		// pesquisar o aluno
		return resposta;
	}

	public void imprimirTurma() {
		Iterator<Aluno> it = alunos.iterator();
		
		while (it.hasNext()) {
			Aluno a = it.next(); 
			System.out.println(a);
		}
		
	}
}
