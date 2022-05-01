package it.corso.java.lambda;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		
	}

	private List<Utente> elencoUtenti() {
		List<Utente> utenti = new ArrayList<Utente>();
		
		utenti.add(new Utente("Paolo" , "Preite", 38));
		utenti.add(new Utente("Giovanni" , "Preite", 38));
		utenti.add(new Utente("Antonio" , "Preite", 38));
		utenti.add(new Utente("Michele" , "Preite", 38));
		utenti.add(new Utente("Stefano" , "Preite", 38));
		utenti.add(new Utente("Giovanni" , "Xxxxxx", 38));
		
		return utenti;
	}
	
	
	
//	public List<Utente> cercaUtenti(List<Utente> , Predicate<Utente> p) {
		
//	}
	
}
