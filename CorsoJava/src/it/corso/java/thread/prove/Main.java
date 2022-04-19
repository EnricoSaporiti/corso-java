package it.corso.java.thread.prove;

public class Main {

	public static void main(String[] args) {
		
		Main m = new Main();
		m.concorrenza();
		
		
	}
	
	private void concorrenza() {
		
		for( int i = 0 ; i< 10; i++) {
			Thread p = new Thread(new Task());
			p.start();
			
		}
		
		System.out.println( " Thread in esecuzione " + Thread.currentThread().getName());
		System.out.println( " Thread in esecuzione " + Thread.activeCount() );

	}
	
	private class Task implements Runnable {

		@Override
		public void run() {

			System.out.println("In esecuzione il Task " + Thread.currentThread().getName() + " in stato " +Thread.currentThread().getState() );
			
		}
		
	}

}
