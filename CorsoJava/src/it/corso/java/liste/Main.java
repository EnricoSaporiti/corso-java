package it.corso.java.liste;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

import it.corso.java.Smartphone;

public class Main {

	public static void main(String[] args) {
		
		Main m = new Main();

		m. getConfig();
		
	}
	
	
	public void getConfig() {
		Properties p = new Properties();
		
		InputStream is;
		try {
			is = new FileInputStream(new File("C:\\Users\\Achille\\Documents\\config.properties"));
			p.load(is);
			
			System.out.println(p.getProperty("db-name"));
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void esempioArrayList() {
		List<String> lista = new ArrayList<String>();
	}
	
	
	public void esempioHashMap( ) {
		
		Map<String, Smartphone> mappa = new HashMap<String, Smartphone>();
		
		Smartphone sm = new Smartphone(",Applle", "Iphone");
		
		mappa.put(sm.getModello(), sm);
		
		
	}
 	
}
