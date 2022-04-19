package it.corso.java.thread;

import it.corso.java.thread.concorrenza.GetSitePage;

public class Main {

	public static void main(String[] args) {
		
		Main m = new Main();
		
		try {
			m.esempioConcorrenzaThread();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
 	}
	
	private void esempioConcorrenzaThread() throws InterruptedException {
		
		GetSitePage s1 = new GetSitePage("http://www.paolopreite.it");
		GetSitePage s2 = new GetSitePage("http://www.google.it");
		
		s1.start();
		s2.start();
		
		s1.join();
		s2.join();
		
		System.out.println(" PAOLO PREITE ");
		System.out.println(s1.getContent());
		System.out.println(" GOOGLE ");
		System.out.println(s2.getContent());
		
		
	}

	private void esempioThread() {
		EsempioThread et = new EsempioThread();
		et.start();
		
		Thread t = new Thread(new EsempioRunnable());
		t.start();
	}
	
	
	private void esempioMultiThread() {
		
		EsempioThread et1 = new EsempioThread();
		et1.setName("Thread 1");
		EsempioThread et2 = new EsempioThread();
		et2.setName("Thread 2");
		EsempioThread et3 = new EsempioThread();
		et3.setName("Thread 3");
		EsempioThread et4 = new EsempioThread();
		et4.setName("Thread 4");
		EsempioThread et5 = new EsempioThread();
		et5.setName("Thread 5");
		
		et1.start();
		et2.start();
		et3.start();
		et4.start();
		et5.start();

	}
}
