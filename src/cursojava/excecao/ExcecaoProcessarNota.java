package cursojava.excecao;

public class ExcecaoProcessarNota extends Exception {

	public ExcecaoProcessarNota(String erro) {

		super("Vixe um erro no processamento do arquivo ao processar as notas do aluno" + erro);
	}

}
