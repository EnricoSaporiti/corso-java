package it.corso.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Utils {

	
	public static String getString(InputStream is) {
		BufferedReader br = null;
		StringBuilder sb = new StringBuilder();
		
		br = new BufferedReader(new InputStreamReader(is));		
 		
		String line;
		try {
			while ((line = br.readLine()) != null) {
				sb.append(line);
			}
		} catch (IOException e) {
		
			e.printStackTrace();
		} finally {
			
			if(br != null) {				
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		return sb.toString();
	}
}
			
			
			
			
			