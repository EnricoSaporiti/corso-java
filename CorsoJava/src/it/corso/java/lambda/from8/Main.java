package it.corso.java.lambda.from8;

public class Main {

	public static void main(String[] args) {
		FormaGeometrica rettangolo = (a, b) -> a*b;
		
		System.out.println(rettangolo.calcolaArea(10, 20));
		
		FormaGeometrica quadrato = ( a, b) -> {
			if(a==b) {
				return a*b;
			} else {
//				throw new Exception("i due lati non sono uguali");
				return 0;
			}
		};
		
		try {
			Double q = quadrato.calcolaArea(5, 5) ;
			System.out.println( q );
			
		} catch ( Exception e) {
			e.printStackTrace();
		}
		
	
	}

}
