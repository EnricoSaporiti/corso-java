package it.corso.java.lambda;

import java.util.concurrent.Callable;

public class EssempioLambdaExpression {

	public static void main(String[] args) {
		
		
		Thread t4 = new Thread(() -> {	
			System.out.println("sono nel thread 4");
		});
		
		t4.start();
		
			
			
			
		

	}

	private static void saluta(String nome, String cognome) {
		
		Callable<String> callMe = () -> {
			if ( nome == null) {
				throw new Exception("nome null");
			} else if( cognome == null ) {
				throw new Exception("cognome null");
				
			} else {
				return "Ciao " + nome + " " + cognome;
			}
				
		};	
		
		try {
			callMe.call();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}