import javax.swing.JOptionPane;

/*
 * Uppgift: Mer rekursion, alla metoder
 * 
 * En klass med alla metoder från uppgiften implementerade
 */
public class Rekursion {

	public static void main(String[] args) {
		
		//Test javium
		double jav_mass = Double.parseDouble(JOptionPane.showInputDialog("Ange massan Javium"));
		double jav_years = Double.parseDouble(JOptionPane.showInputDialog("Ange antalet år"));
		double jav_res = half(jav_mass, jav_years);
		
		JOptionPane.showMessageDialog(null,
				"Efter " + jav_years + " år återstår: " + jav_res + "kg = " + (jav_res * 1000) + "g",
				"Resultat: Javium", 0);
		
		//Test fibonacci
		int fib_n = Integer.parseInt(JOptionPane.showInputDialog("Ange ett tal (n)"));
		int fib_res = fib(fib_n);
		
		JOptionPane.showMessageDialog(null,
				fib_n + ":e talet i fibonaccis talföljd är: " + fib_res, 
				"Resultat: Fibonacci", 0);
		
		//Test upphöjt
		int pow_x = Integer.parseInt(JOptionPane.showInputDialog("Ange ett tal (x)"));
		int pow_y = Integer.parseInt(JOptionPane.showInputDialog("Ange ett tal (y)"));
		long pow_res = pow(pow_x, pow_y);
		
		JOptionPane.showMessageDialog(null, 
				"x^y=" + pow_x + "^" + pow_y + "=" + pow_res, 
				"Resultat: Upphöjt", 0);
		
		//Test invertera text
		String rev_str = JOptionPane.showInputDialog("Ange en text att invertera");
		String rev_res = reverse(rev_str);
		
		JOptionPane.showMessageDialog(null, 
				"Inverterade texten är: " + rev_res, 
				"Resultat: Invertera", 0);
	}

	/**
	 * räknar ut Javiums återstående massa efter ett antal år med hjälp av rekursion
	 * 
	 * @param massa
	 * @param antal år kvar
	 * @return återstående mass
	 */
	public static double half(double mass, double years) {
		if(years <= 0) {
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
	 * Inverterar en text
	 * 
	 * @param text att invertera
	 * @return inverterad string
	 */
	public static String reverse(String str) {
		if(str.isEmpty()) {
			return str;
		}
		
		return reverse(str.substring(1)) + str.charAt(0);
	}
}
