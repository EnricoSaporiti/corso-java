package it.corso.java.files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Scrittura {

	public static void main(String[] args) {

		String dir = "C:\\Users\\Achille\\Documents\\CorsoJava\\test-dir";
		String testo = "Lorem imsum...";
		
		Scrittura s = new Scrittura();
		
//		s.provaFileWriter(dir + "\\test-file.txt", testo);
	
		s.esempioBufferedFileWriter(dir + "\\buffered-file.txt", "Enrico", "Saporiti");
	}
	

	public void esempioBufferedFileWriter(String filePath, String... testo )  {
		
		BufferedWriter bw = null;
		
		FileWriter fw = null;; 
		
		try {
			bw = new BufferedWriter(new FileWriter(getFile(filePath)));
			
			for (String t : testo) {
				System.out.println(t);
				bw.write(t);
				bw.newLine();
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	}

	
	
	public void provaFileWriter(String filePath, String testo )  {
		
		FileWriter fw = null; 
		
		try {
			fw = new FileWriter(getFile(filePath));
			fw.write(testo);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
		
	private File getFile(String filePath) {
			
		File f = new File(filePath);
			
		if(!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
				
		return f;				
			
	}
		
}
