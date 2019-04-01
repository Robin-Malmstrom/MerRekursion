package fibonacci;

import javax.swing.JOptionPane;

/*
 * Uppgift: Mer rekursion, Fibonacci
 * 
 * räknar ut och skriver ut det n:te talet i fibonaccis talföld
 */
public class Fibonacci {

	public static void main(String[] args) {
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Ange ett tal"));
		if(n <= 2) {
			JOptionPane.showMessageDialog(null, "Talet måste vara större än 2");
			System.exit(0);
		}
		JOptionPane.showMessageDialog(null, n + ":e talet i fibonaccis talföljd är: " + fib(n));
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

}
