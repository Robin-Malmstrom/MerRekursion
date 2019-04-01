package main;

/*
 * Uppgift: mer rekursion, Alla metoder
 * 
 * Innehåller alla metoder från uppgiften
 */
public class Rekursiv {

	public static void main(String[] args) {

	}
	
	/**
	 * räknar ut Javiums återstående massa efter ett antal år med hjälp av rekursion
	 * 
	 * @param massa
	 * @param antal år kvar
	 * @return återstående mass
	 */
	public static double half(double mass, double years) {
		if(years < 0) {
			return mass;
		}
		double newMass = mass / 2;
		double newYears = years - 1;
		return half(newMass, newYears);
	}
	
	/**
	 * Räknar ut vilket tal som är på plats n i fibonaccis talföljd med hjälp av rekursion
	 * 
	 * @param n
	 * @return talet på plats n
	 */
	public static int fib(int n) {
		if(n <= 2) {
			return 1;
		}
		return fib(n - 1) + fib(n - 2);
	}
	
	/**
	 * Räknar ut x^y med hjälp av rekursion
	 * 
	 * @param x
	 * @param y
	 * @return x^y
	 */
	public static long pow(int x, int y) {
		if(y == 0) {
			return 1;
		}
		return x * pow(x, y - 1);
	}
	
	/**
	 * Inverterar en string
	 * 
	 * @param string att invertera
	 * @return inverterad string
	 */
	public static String reverse(String str) {
		if(str.isEmpty()) {
			return str;
		}
		
		return reverse(str.substring(1)) + str.charAt(0);
	}

}
