package cursojava.thread;

import javax.swing.JOptionPane;

public class AulaThread {

	public static void main(String[] args) throws InterruptedException {

		new Thread() {
			public void run() {// Executa o que desejamos

				/* Código da Rotina */

				
				for (int i = 0; i < 10; i++) {

					// Quero executar esse envio com um tempo de parada, ou com um tempo determinado
					System.out.println(i + 1 + " - Executando rotina, exemplo envio de e-mail");

					try {
						Thread.sleep(1000);// Dá o tempo para executar cada comando , determinado em mili segundos
					} catch (InterruptedException e) {
						e.printStackTrace();

						// Fim do Código Paralelo
					}
				}
			}

		}.start();// Liga a Thread que fica processando paralelamente por trás

		// Código do sistema do usuário continua o fluxo de trabalho
		System.out.println("CHEGOU AO FIM DO CÓDIGO DE TESTE THREAD");
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuário");
	}

}
