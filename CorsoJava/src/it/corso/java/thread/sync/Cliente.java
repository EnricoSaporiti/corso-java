/**
 * 
 */
package it.corso.java.thread.sync;

/**
 * @author Achille
 *
 */
public class Cliente extends Thread {
	private double sommaDaPrelevare;

	public Cliente(String nomeCliente, double sommaDaPrelevare) {
		super();
		this.sommaDaPrelevare = sommaDaPrelevare;
		this.setName(nomeCliente);
	}

	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getName() + " Arriva al bancomat" );
		System.out.println("Quando arriva " + Thread.currentThread().getName() + " Il saldo è " + ContoCorrente.getInstance().getSaldo());
		System.out.println("La somma da prelevare è " + sommaDaPrelevare);
		
		try {
			ContoCorrente.getInstance().prelievo(sommaDaPrelevare);
			System.out.println(Thread.currentThread().getName() + "TUTTO OK PRELIEVO EFFETTUALO");
		} catch (Exception e) {
				
			System.out.println(Thread.currentThread().getName() + " SALDO INDISPONIBILE ");
			e.printStackTrace();
		}
		
		super.run();
	}
	
	
	
	
	
}
