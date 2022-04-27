package it.corso.java.thread.prodcons;

import java.util.List;

public class Consumer implements Runnable {
	
	private final List<Integer> bufferCondiviso;
	private final int SIZE; 
	
	public Consumer(List<Integer> bufferCondiviso, int size) {
		this.bufferCondiviso = bufferCondiviso;
		this.SIZE = size;

	}

	@Override
	public void run() {
		while(true) {
			try {
				System.out.println("Il thread Consumer sta leggendo il buffer...");
				consume();
				Thread.sleep(SIZE * 500 - bufferCondiviso.size() * 500 );
			} catch (InterruptedException ex){
				ex.printStackTrace();
			}
		}
	}
	
	
	private void consume() throws InterruptedException {
		// wait se il buffer è vuoto
		while(bufferCondiviso.isEmpty() ) {
			synchronized (bufferCondiviso) {
				System.out.println("il buffer è vuoto di dimensione " + bufferCondiviso.size());
				bufferCondiviso.wait();
			}
		}
	
		synchronized (bufferCondiviso) {
			System.out.println("elimino il seguente elemento " + bufferCondiviso.remove(0) + " ora dimensione " + bufferCondiviso.size());
		
			bufferCondiviso.notifyAll();
		}
	}

}
