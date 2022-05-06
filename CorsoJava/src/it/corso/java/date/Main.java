package it.corso.java.date;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

	public static void main(String[] args) {

		Main m = new Main();
//		m.esDate();
//		m.esCalendar();
		
		m.esSimpleDateFormat();
		
	}
	
	
	
	private void esSimpleDateFormat() {

		Calendar c = new GregorianCalendar();
		
		c.set(Calendar.YEAR, 2022);
		c.set(Calendar.MONTH, 4);
		c.set(Calendar.DATE, 29);
		c.set(Calendar.HOUR, 10);
		c.set(Calendar.MINUTE, 30);
		c.set(Calendar.SECOND, 25);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		String data = sdf.format(c.getTime());
		
		System.out.println(data);		
		
	}
	
	
	private void esLocalDate() {
		LocalDate ld = LocalDate.of(2022, 05, 04);
		
		System.out.println(ld.toString());

 			
	}
	
	private void esCalendar() {
		
		Calendar cal = new GregorianCalendar();
		
		cal.set(Calendar.YEAR, 2020);
		cal.set(Calendar.MONTH  , 12);
		
		System.out.println(cal.getTime());
		
		Calendar cal2 = new GregorianCalendar();
		
		cal2.setTime(new Date());

		System.out.println(cal2.getTime());
		
		
	}
	
	private void esDate() {
		
		Date data = new Date();
		
		System.out.println(data.toString());
		System.out.println(new Date().toString());
			
	}

}
