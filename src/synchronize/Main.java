package synchronize;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1", 900);
		MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2", 400);
		MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#3", 500);
	
		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		Thread t3 = new Thread(thread3);
		
		t1.setPriority(5);
		t2.setPriority(3);
		t3.setPriority(1);

		t1.start();
		t2.start();
		t3.start();
	
	}

}
