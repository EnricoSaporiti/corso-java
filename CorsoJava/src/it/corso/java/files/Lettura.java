package it.corso.java.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lettura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void esempioFileReader(String filePath) {

		File f = new File(filePath );
		
		if(f.exists()) {
			FileReader fr ;
			try {
				fr = new FileReader(f) ;
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
			
		}
		
		
		
	}

}
