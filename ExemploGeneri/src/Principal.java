import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Turma t = new Turma();
		for (int i = 0; i<3; i++) {
			String nome = JOptionPane.showInputDialog("Informe o nome do aluno");
			String strMatricula = JOptionPane.showInputDialog(" Informe a matrícula do aluno");
			String email = JOptionPane.showInputDialog("Informe o email do aluno");
			int matricula = Integer.parseInt(strMatricula);
			
			Aluno a = new Aluno(nome,matricula,email);
			
			
		}

		t.imprimirTurma();
	}

}
