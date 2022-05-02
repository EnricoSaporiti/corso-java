package it.corso.java.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;



public class Main {

	public static void main(String[] args) {
	
		Main m = new Main();
		
		List<Utente> utenti = m.elencoUtenti();
		
//		List<Utente> trovati = new ArrayList<Utente>();
				
//		trovati = m.cercaUtenti( utenti, utente ->  utente.getNome().equals("Paolo")  );
		
//		System.out.println(trovati.toString());
		
		Consumer<Utente> consumer = utente -> System.out.println(utente.toString());
			
		utenti.forEach(consumer);
		
		for (Utente utente2 : utenti) {
			consumer.accept(utente2);
		}
		
		for (Utente utente2 : utenti) {
			m.stampaDatiUtente(() -> utente2);
		}
		
		m.calcolaOperazione(12, (operando) -> {return operando * operando;} );
		
		// UnaruOperator 
		
		UnaryOperator<String> minuscolo = str -> str.toLowerCase();
		UnaryOperator<Long> quadrato = x -> x*x;
		
		System.out.println(minuscolo.apply("STRINGA MAIUSCOLA"));
		
		Long num = new Long(12);
		System.out.println(quadrato.apply(num));
		
		
		
		
		
		

	}
	
	private List<Utente> elencoUtenti() {
		
		List<Utente> utenti = new ArrayList<Utente>();
	
		utenti.add(new Utente("Paolo", "Preite", 39));
		utenti.add(new Utente("Paolo", "Secondo", 39));
		utenti.add(new Utente("Giovanni", "Preite", 39));
		utenti.add(new Utente("Michele", "Preite", 39));
		utenti.add(new Utente("Stefano", "Preite", 39));
		utenti.add(new Utente("Luca", "Preite", 39));
		utenti.add(new Utente("Paolo", "Temistocle", 39));
		utenti.add(new Utente("Marco", "Lopresti", 39));
		
		return utenti;
		
	}
	
	private List<Utente> cercaUtenti(List<Utente> utenti, Predicate<Utente> p){
		
		List<Utente> filtro = new ArrayList<Utente>();
		
		for( Utente u : utenti) {
			if(p.test(u)) {
				filtro.add(u);
			}
		}
		
		return filtro;
	}
	
	
	private void stampaDatiUtente(Supplier<Utente> u) {
		System.out.println(u.get().toString());
	}
	
	private void calcolaOperazione(double operando, Function<Double, Double> funzione ) {
		System.out.println( "risultato " + funzione.apply(operando) );
	}

}
