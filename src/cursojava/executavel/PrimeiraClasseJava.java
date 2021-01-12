package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class PrimeiraClasseJava {

	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog("Qual o nome do Aluno?");
		String idade = JOptionPane.showInputDialog("Qual a idade do Aluno?");
		String dataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento do Aluno?");
		String RegistroGeral = JOptionPane.showInputDialog("Qual o RG do Aluno?");
		String NumeroCpf = JOptionPane.showInputDialog("Qual o CPF do Aluno?");
		String NomeMae = JOptionPane.showInputDialog("Qual o nome da mãe do Aluno?");
		String NomePai = JOptionPane.showInputDialog("Qual o nome do pai do Aluno?");
		String DataMatricula = JOptionPane.showInputDialog("Qual a data de matrícula do Aluno?");
		String NomeEscola = JOptionPane.showInputDialog("Qual o nome da Escola do Aluno?");
		String SerieMatriculado = JOptionPane.showInputDialog("Qual a série  do Aluno?");

		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		Aluno aluno3 = new Aluno("Samuel");

		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(RegistroGeral);
		aluno1.setNumeroCpf(NumeroCpf);
		aluno1.setNomeMae(NomeMae);
		aluno1.setNomePai(NomePai);
		aluno1.setDataMatricula(DataMatricula);
		aluno1.setNomeEscola(NomeEscola);
		aluno1.setSerieMatriculado(SerieMatriculado);

		Disciplina disciplinaAluno1 = new Disciplina();
		disciplinaAluno1.setDisciplina("Banco de Dados");
		disciplinaAluno1.setNota(90);
		
		aluno1.getDisciplinas().add(disciplinaAluno1);

		Disciplina disciplinaAluno2 = new Disciplina();
		disciplinaAluno2.setDisciplina("Matemática");
		disciplinaAluno2.setNota(80);

		aluno1.getDisciplinas().add(disciplinaAluno2);

		Disciplina disciplinaAluno3 = new Disciplina();
		disciplinaAluno3.setDisciplina("Geografia");
		disciplinaAluno3.setNota(97);
		
		aluno1.getDisciplinas().add(disciplinaAluno3);
				
		Disciplina disciplinaAluno4 = new Disciplina();
		disciplinaAluno3.setDisciplina("java Web");
		disciplinaAluno3.setNota(70);
		
		aluno1.getDisciplinas().add(disciplinaAluno4);
		
		System.out.println(aluno1);
		System.out.println();
		System.out.println("Média do Aluno 1 = " + aluno1.getMediaNota());
		System.out.println();
		System.out.println("Resultado = " + (aluno1.getAlunoAprovado() ? "APROVADO" : "REPROVADO"));
	

	}

}
