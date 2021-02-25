package cursojava.thread;

import javax.swing.JOptionPane;

public class AulaThread {

	public static void main(String[] args) throws InterruptedException {

		Thread threadEmail = new Thread(thread1);
		threadEmail.start();

		/*****************************
		 * DIVIS�O DAS THREADS
		 ***********************************/

		Thread enviarNota = new Thread(thread2); 
		enviarNota.start();

	

		// C�digo do sistema do usu�rio continua o fluxo de trabalho
		System.out.println("CHEGOU AO FIM DO C�DIGO DE TESTE THREAD");
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usu�rio");
	}

	private static Runnable thread1 = new Runnable() {

		@Override
		public void run() {

			/* C�digo da Rotina */

			for (int i = 0; i < 10; i++) {

				// Quero executar esse envio com um tempo de parada, ou com um tempo determinado
				System.out.println("Executando rotina, exemplo envio de e-mail");

				try {
					Thread.sleep(1000);// D� o tempo para executar cada comando , determinado em mili segundos
				} catch (InterruptedException e) {
					e.printStackTrace();

					// Fim do C�digo Paralelo
				}
			}
		}
	};

	private static Runnable thread2 = new Runnable() {

		@Override
		public void run() {

			/* C�digo da Rotina */

			for (int i = 0; i < 10; i++) {

				// Quero executar esse envio com um tempo de parada, ou com um tempo determinado
				System.out.println("Executando rotina, exemplo envio de nota fiscal");

				try {
					Thread.sleep(1000);// D� o tempo para executar cada comando , determinado em mili segundos
				} catch (InterruptedException e) {
					e.printStackTrace();

					// Fim do C�digo Paralelo
				}
			}

		}
	};

}
