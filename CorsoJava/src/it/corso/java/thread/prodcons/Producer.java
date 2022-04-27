package it.corso.java.thread.prodcons;

import java.util.List;

public class Producer implements Runnable {
	
	private final List<Integer> bufferCondiviso;
	private final int SIZE;
	private int i = 1;
	
	public Producer(List<Integer> bufferCondiviso, int size) {
		this.bufferCondiviso = bufferCondiviso;
		this.SIZE = size;
	}


	@Override
	public void run() {

		while(true) {
			try {
				System.out.println("Il thread Produer sta scrivendo il buffer...");
				producer();
				i++;
				Thread.sleep(bufferCondiviso.size() * 500 );
			} catch (InterruptedException ex){
				ex.printStackTrace();
			}
			
		}
		
	}

	private void producer() throws InterruptedException {
		// wait se il buffer è pieno
		while(bufferCondiviso.size() == SIZE ) {
			synchronized (bufferCondiviso) {
				System.out.println("il buffer è pieno di dimensione " + bufferCondiviso.size());
				bufferCondiviso.wait();
			}
		}
		
	
		synchronized (bufferCondiviso) {
		
			bufferCondiviso.add(i);
			System.out.println("aggiunto l' elemento " + i + " ora dimensione " + bufferCondiviso.size());
			bufferCondiviso.notifyAll();
		}
	}
}
