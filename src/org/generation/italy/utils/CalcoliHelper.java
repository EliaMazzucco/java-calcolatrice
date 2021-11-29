package org.generation.italy.utils;

public class CalcoliHelper {
	
	 private CalcoliHelper() {}
	 
	 ///////SOMMA///////
	
	public static int somma (int a, int b) {
		return a + b;
	}
	
	public static double somma(double a, double b) {
		return a + b;
	}
	
	///////DIVISIONE///////
	
	public static int divisione(int a, int b) {
		return a / b;
	}
	
	public static double divisione(double a, double b) {
		return a / b;
	}
	
	
	///////MOLTIPLICAZIONE///////
	
	public static int moltiplicazione(int a, int b) {
		return a * b;
	}
	public static double moltiplicazione(double a, double b) {
		return a * b;
	}
	
	
	///////VALORE ASSOLUTO///////
	
	public static int valoreAssoluto(int a) {
		 if(a < 0) {
			 a = a *-1;			 
		 } return a;
			
    }
	
	
	public static double valoreAssoluto(double a) {
		 if(a < 0) {
			 a = a *-1;			 
		 } return a;
			
    }
				
	
	
	///////VALORE MINIMO///////
	public static int valoreMinimo(int a, int b) {
		if (a < b) {
			return a;			
		} else return b;
		
	}
	public static double valoreMinimo(double a, double b) {
		if (a < b) {
			return a;			
		} else return b;
		
	}
	
	
	///////VALRE MASSIMO///////
	
	public static int valoreMassimo(int a, int b) {
		if (a > b) {
			return a;			
		} else return b;
		
	}
	public static double valoreMassimo(double a, double b) {
		if (a > b) {
			return a;			
		} else return b;
		
	}
	
	
	///////BONUS POTENZA///////
	
	public static int potenza(int a, int b) {
		int risultato = 1;
		if(a > 0 && b <=0) {
			return risultato;
		}else if(a <= 0 && b >=1) {
			return 0;
		}else {
			for(int i = 1; i <= b; i++) {
				risultato = risultato * a;		
			}
			return risultato;
		}
		
	}
	
	
}
