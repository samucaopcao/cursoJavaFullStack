package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Pessoa;
import cursojava.classes.Secretario;

public class TestandoClassesFilhas {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		aluno.setNome("Samuel");
		aluno.setIdade(16);

		Diretor diretor = new Diretor();
		diretor.setNome("Leticia");
		diretor.setRegistroGeral("443726859");
		diretor.setIdade(50);

		Secretario secretario = new Secretario();
		secretario.setNome("Ana");
		secretario.setExperiencia("Administração");
		secretario.setIdade(18);

		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);

		System.out.println(aluno.pessoaMaiorIdade() + "-" + aluno.msgMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());

		System.out.println("O Salário do Aluno é : " + aluno.salario());
		System.out.println("O Salário do Diretor é : " + diretor.salario());
		System.out.println("O Salário do Secretário é : " + secretario.salario());

		teste(aluno);
		teste(diretor);
		teste(secretario);
		
	}

	public static void teste(Pessoa pessoa) {
		System.out.println("Essa pessoa é demais = "+pessoa.getNome() + " e o salário de = "
				+ pessoa.salario());
		
	}
}
