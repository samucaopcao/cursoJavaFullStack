package cursojava.executavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cursojava.classes.Secretario;
import cursojava.constantes.StatusAluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {

		String login = JOptionPane.showInputDialog("Informe o Login: ");
		String senha = JOptionPane.showInputDialog("Informe a Senha: ");

		Secretario secretario = new Secretario();
		secretario.setLogin(login);
		secretario.setSenha(senha);

		if (secretario.autenticar()) {// Se True entra no IF caso contrario nao

			if (login.equalsIgnoreCase("admin") && senha.equalsIgnoreCase("admin")) {

				List<Aluno> alunos = new ArrayList<Aluno>();

				// É uma lista que dentro dela temos uma chave que identifica uma sequencia de
				// valores também
				HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

				for (int qnt = 1; qnt <= 5; qnt++) {

					String nome = JOptionPane.showInputDialog("Qual o nome do Aluno " + qnt + " ?");
					/*
					 * String idade = JOptionPane.showInputDialog("Qual a idade do Aluno?"); String
					 * dataNascimento =
					 * JOptionPane.showInputDialog("Qual a data de nascimento do Aluno?"); String
					 * RegistroGeral = JOptionPane.showInputDialog("Qual o RG do Aluno?"); String
					 * NumeroCpf = JOptionPane.showInputDialog("Qual o CPF do Aluno?"); String
					 * NomeMae = JOptionPane.showInputDialog("Qual o nome da mãe do Aluno?"); String
					 * NomePai = JOptionPane.showInputDialog("Qual o nome do pai do Aluno?"); String
					 * DataMatricula =
					 * JOptionPane.showInputDialog("Qual a data de matrícula do Aluno?"); String
					 * NomeEscola = JOptionPane.showInputDialog("Qual o nome da Escola do Aluno?");
					 * String SerieMatriculado =
					 * JOptionPane.showInputDialog("Qual a série  do Aluno?");
					 */

					Aluno aluno1 = new Aluno();
					Aluno aluno2 = new Aluno();
					Aluno aluno3 = new Aluno("Samuel");

					aluno1.setNome(nome);
					/*
					 * aluno1.setIdade(Integer.valueOf(idade));
					 * aluno1.setDataNascimento(dataNascimento);
					 * aluno1.setRegistroGeral(RegistroGeral); aluno1.setNumeroCpf(NumeroCpf);
					 * aluno1.setNomeMae(NomeMae); aluno1.setNomePai(NomePai);
					 * aluno1.setDataMatricula(DataMatricula); aluno1.setNomeEscola(NomeEscola);
					 * aluno1.setSerieMatriculado(SerieMatriculado);
					 */

					for (int pos = 1; pos <= 1; pos++) {

						String nomeDisciplina = JOptionPane.showInputDialog("Qual o nome da disciplina " + pos + " ?");
						double notaDisciplina = Double
								.parseDouble(JOptionPane.showInputDialog("Qual a nota da disciplina " + pos + " ?"));

						Disciplina disciplina = new Disciplina();
						disciplina.setDisciplina(nomeDisciplina);
						disciplina.setNota(notaDisciplina);

						aluno1.getDisciplinas().add(disciplina);
					}

					int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");

					if (escolha == 0) {

						int continuarRemover = 0;
						int posicao = 1;

						while (continuarRemover == 0) {
							String disciplinaRemover = JOptionPane.showInputDialog("Qual a Disciplina? (1,2,3 ou 4)");
							aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
							posicao++;
							continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover disciplinas?");
						}
					}
					alunos.add(aluno1);
				}

				maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
				maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
				maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());

				for (Aluno aluno : alunos) {

					if (aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.APROVADO)) {
						maps.get(StatusAluno.APROVADO).add(aluno);
					} else {
						if (aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
							maps.get(StatusAluno.RECUPERACAO).add(aluno);
						} else {
							maps.get(StatusAluno.REPROVADO).add(aluno);
						}
					}
				}

				System.out.println("Alunos Aprovados");
				for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
					System.out.println(
							"Resultado = " + aluno.getAlunoAprovado() + " com média de : " + aluno.getMediaNota());
				}
				System.out.println("Alunos Reprovados");
				for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
					System.out.println(
							"Resultado = " + aluno.getAlunoAprovado() + " com média de : " + aluno.getMediaNota());
				}
				System.out.println("Alunos Recuperação");
				for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
					System.out.println(
							"Resultado = " + aluno.getAlunoAprovado() + " com média de : " + aluno.getMediaNota());
				}
			}

		} else {
			JOptionPane.showMessageDialog(null, "Acesso não permitido");
		}
	}
}
