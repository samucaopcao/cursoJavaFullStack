package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArrayVetor {

	public static void main(String[] args) {

		double[] notas = { 10, 20, 30, 100 };
		double[] notasC = { 10.5, 20.5, 30.4, 100.3 };

		Aluno aluno = new Aluno();

		aluno.setNome("Samuel");
		aluno.setNomeEscola("JavaDev");

		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Java");
		disciplina.setNota(notas);
		aluno.getDisciplinas().add(disciplina);

		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("C#");
		disciplina2.setNota(notasC);
		aluno.getDisciplinas().add(disciplina2);
		
		System.out.println("Nome do aluno é = " + aluno.getNome() + " e está Inscrito no Curso: "+ aluno.getNomeEscola());
		
		System.out.println(" ----------- Disciplinas do Aluno -----------\n");
		for (Disciplina disc : aluno.getDisciplinas()) {
			System.out.println("Disciplina :"+ disc.getDisciplina());
			System.out.println("As notas das disciplinas são: ");
			for (int i = 0; i < disc.getNota().length; i++) {
				System.out.println(i+1+ "° Notas: "+ disc.getNota()[i]);
				
			}
		}

	}

}
