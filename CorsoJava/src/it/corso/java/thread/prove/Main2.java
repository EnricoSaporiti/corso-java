package it.corso.java.thread.prove;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main2 {

	public static void main(String[] args) {
		
		Main2 m = new Main2();
		m.concorrenza();

}

	private void concorrenza() {
		
		int coreCount = Runtime.getRuntime().availableProcessors();
		ExecutorService service = Executors.newFixedThreadPool(coreCount);
		
		for( int i =0 ; i<100; i++) {
			service.execute(new Task());
		}

		System.out.println( " Processori " + coreCount );
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
