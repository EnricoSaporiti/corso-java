package it.corso.java.thread.lock;

public class Contatore extends Thread {
	private EsempioReentrantLock counter;
	private int limite;
	private int sleep;
	
	public Contatore(EsempioReentrantLock counter, int limite, int sleep) {
		super();
		this.counter = counter;
		this.limite = limite;
		this.sleep = sleep;
	}
	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {

		while (counter.conta() < limite) {
			try {
				counter.somma();
				Thread.sleep(sleep);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}
}
