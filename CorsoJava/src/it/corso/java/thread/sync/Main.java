package it.corso.java.thread.sync;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		Cliente c1 = new Cliente("Mario" , 20);
		Cliente c2 = new Cliente("Lucia" , 50);
		
		// avvio i thread
		c1.start();
		c2.start();
		
		// attendo termine 
		c1.join();
		c2.join();
		
		
//		ClienteNonSync c3 = new ClienteNonSync("Mario", 20);
//		ClienteNonSync c4 = new ClienteNonSync("Lucia", 50);
		
		// avvio i thread
//		c3.start();
//		c4.start();
		
		// attendo termine 
//		c3.join();
//		c4.join();
		

	
	}

}
