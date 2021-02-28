package cursojava.thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFilaThread extends Thread {

	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_fila = new ConcurrentLinkedQueue<ObjetoFilaThread>();

	public static void add(ObjetoFilaThread objetoFilaThread) {// Método para adicionar objetos na fila
		pilha_fila.add(objetoFilaThread);
	}

	@Override
	public void run() {

		System.out.println("Fila Rodando");

		while (true) {

			Iterator iteracao = pilha_fila.iterator();

			synchronized (iteracao) {// Bloqueia o acesso a esta pilha por outros processos, para que ninguém
										// atrapalhe enquanto não acabar

				while (iteracao.hasNext()) {// Enquando houver dados na fila ele vai processar
					ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next();// Pega o objeto atual processa , e
																					// vai
																					// para o proximo

					/* Processar 10 mil notas */
					/* Gerar PDF gigante */

					System.out.println("-------------------------------------------------------------------");
					System.out.println(processar.getNome());
					System.out.println(processar.getEmail());

					iteracao.remove();
					try {
						Thread.sleep(1000);// Devemos criar essa linha para dar uma descarga de memória entre um
											// processamento e outro
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}

	}

}
