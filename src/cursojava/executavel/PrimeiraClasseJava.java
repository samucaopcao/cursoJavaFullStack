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
		String disciplina1 = JOptionPane.showInputDialog("Qual o nome da disciplina 1 do Aluno?");

		double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1:"));
		String disciplina2 = JOptionPane.showInputDialog("Qual o nome da disciplina 2 do Aluno?");
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2:"));
		String disciplina3 = JOptionPane.showInputDialog("Qual o nome da disciplina 3 do Aluno?");
		double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 3:"));
		String disciplina4 = JOptionPane.showInputDialog("Qual o nome da disciplina 4 do Aluno?");
		double nota4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 4:"));
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

		Disciplina disciplinaAluno = new Disciplina();
		
		
		System.out.println(aluno1);
		System.out.println();
		System.out.println("Média do Aluno 1 = " + aluno1.getMediaNota());
		System.out.println();
		System.out.println("Resultado = " + (aluno1.getAlunoAprovado() ? "APROVADO" : "REPROVADO"));
	

	}

}
