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
		String NomeMae = JOptionPane.showInputDialog("Qual o nome da m�e do Aluno?");
		String NomePai = JOptionPane.showInputDialog("Qual o nome do pai do Aluno?");
		String DataMatricula = JOptionPane.showInputDialog("Qual a data de matr�cula do Aluno?");
		String NomeEscola = JOptionPane.showInputDialog("Qual o nome da Escola do Aluno?");
		String SerieMatriculado = JOptionPane.showInputDialog("Qual a s�rie  do Aluno?");

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

		for(int pos = 1;pos <=4;pos++) {
			String nomeDisciplina = JOptionPane.showInputDialog("Qual o nome da disciplina "+pos+" ?");
			double  notaDisciplina = Double.parseDouble(JOptionPane.showInputDialog("Qual a nota da disciplina "+pos+" ?"));
			
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(notaDisciplina);
			
			aluno1.getDisciplinas().add(disciplina);
		}
		
		System.out.println(aluno1);
		System.out.println();
		System.out.println("M�dia do Aluno 1 = " + aluno1.getMediaNota());
		System.out.println();
		System.out.println("Resultado = " + (aluno1.getAlunoAprovado() ? "APROVADO" : "REPROVADO"));
	

	}

}
