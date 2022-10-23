package synchronize;


public class MinhaThreadRunnable implements Runnable {

	private String nome;
	private int tempo;

	public MinhaThreadRunnable(String nome, int tempo) {
		this.nome = nome;
		this.tempo = tempo;
	}

	@Override
	public void run() {

		for (int i = 0; i < 6; i++) {
			System.out.println(nome + " contador " + i);
			try {
				Thread.sleep(tempo);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		System.out.println("Thread " + nome + " finalizada");

	}

}