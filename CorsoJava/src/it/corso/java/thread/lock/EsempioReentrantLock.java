package it.corso.java.thread.lock;

import java.util.concurrent.locks.ReentrantLock;

public class EsempioReentrantLock {
	private ReentrantLock lock = new ReentrantLock();
	private int contatore = 0;
	private int somma = 0;
	
	public int conta() {
		System.out.println("Il Thread " + Thread.currentThread().getName() + " incrementa il contatore che ora è " + contatore);
		
		lock.lock();

		System.out.println("Il Thread " + Thread.currentThread().getName() + " incrementa il contatore che ora è " + contatore);

		try {
			contatore ++;
			System.out.println("Il Thread " + Thread.currentThread().getName() + " contatore incrementato " + contatore );
			return contatore;
		} finally {
			lock.unlock();
		}
		
	}

	public void somma() {
		System.out.println("Il Thread " + Thread.currentThread().getName() + " visualizza somma " + somma + " visualizza contatore " + contatore);
		
		if(lock.tryLock()) {
			try {
				somma += contatore;
				System.out.println("Il Thread " + Thread.currentThread().getName() + " la somma vale " + somma + " visualizza contatore " + contatore );
				
			} finally {
			lock.unlock();
			}
		
			
		} else {
			System.out.println("Il Thread " + Thread.currentThread().getName() + " ha il lock" );
			
		}
		
	}
}
