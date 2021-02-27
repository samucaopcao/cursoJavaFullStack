package cursojava.thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFilaThread extends Thread {

	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_fila = new ConcurrentLinkedQueue<ObjetoFilaThread>();// Método
																														// que
																														// manipulará
																														// a
																														// fila

	public static void add(ObjetoFilaThread objetoFilaThread) {// Método para adicionar objetos na fila
		pilha_fila.add(objetoFilaThread);
	}

	public void run() {
		Iterator iteracao = pilha_fila.iterator();

		synchronized (iteracao) {//Bloqueia o acesso a esta pilha por outros processos, para que ninguém atrapalhe enquanto não acabar

			while (iteracao.hasNext()) {// Enquando houver dados na fila ele vai processar
				ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next();// Pega o objeto atual processa , e vai
																				// para o proximo

				/* Processar 10 mil notas */
				/* Gerar PDF gigante */
				
				System.out.println("-------------------------------------------------------------------");
				System.out.println(processar.getEmail());
				System.out.println(processar.getNome());

				iteracao.remove();
				try {
					Thread.sleep(100);// Devemos criar essa linha para dar uma descarga de memória entre um
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
