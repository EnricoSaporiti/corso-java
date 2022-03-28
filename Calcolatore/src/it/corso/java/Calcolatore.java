package it.corso.java;

public class Calcolatore {

	public static void main(String[] args) {

		Calcolatrice c = new Calcolatrice();
		
		double a = 10;
		double b = 5;
	
		System.out.println(c.somma(a , b));
		System.out.println(c.sottrazione(a , b));
		System.out.println(c.moltiplicazione(a , b));
		System.out.println(c.divisione(a , b));
		
	}

}
