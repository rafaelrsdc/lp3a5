package concorrenciaeparalelismo;


public class HelloWorldRunnable implements Runnable {

	@Override
	public void run() {
	System.out.println("Aqui quem fala é a " + Thread.currentThread().getName());
	}
	public static void main(String[] args) {
	System.out.println("Estamos na : " + Thread.currentThread().getName());
	Runnable runnable = new HelloWorldRunnable();
	
	Thread thread = new Thread(runnable);
	thread.start();

	}

}
