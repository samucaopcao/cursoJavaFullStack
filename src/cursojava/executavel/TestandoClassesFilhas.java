package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Secretario;

public class TestandoClassesFilhas {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Samuel");
		
		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("443726859");
		
		Secretario secretario = new Secretario();
		secretario.setExperiencia("Administração");
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);

	}

}
