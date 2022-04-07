package it.corso.java.classianonime;

public class Main {

	public static void main(String[] args) {
		
		Main m = new Main();
		
		Azione a1 = m.eseguiAzione1();
		a1.eseguiAzione();
		
		Azione a2 = m.eseguiAzione2();
		a2.eseguiAzione();
	}
	
	public Azione eseguiAzione1() {
		return new AzioneImp();
	}
	
	
	public Azione eseguiAzione2() {
		return new Azione() {

			public void eseguiAzione() {
				
				System.out.println("Sono in esegui Azione 2");
				
			}
			
		};
	}
}
