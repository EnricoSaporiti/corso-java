package it.corso.java.files;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		Main m = new Main();
		
		String dir = "C:\\\\Users\\\\Achille\\\\Documents\\\\CorsoJava\\\\test-dir";
		m.creaDirectory(dir);
		m.creaFile(dir +  "\\test-file.txt");
			
	}
	
	public void creaFile(String path) {
		File f = new File(path);
		
		if(!f.exists()) {
			
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public void creaDirectory(String path) {
		File d = new File(path);
		
		if(!d.exists()) {
			d.mkdir();
		}
		
	}

}
