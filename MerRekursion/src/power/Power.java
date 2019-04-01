package power;

import javax.swing.JOptionPane;

/*
 * Uppgift: Mer rekursion, x^y
 * 
 * Programmet tar in heltalen x och y och skriver ut resultatet av x^y
 */
public class Power {

	public static void main(String[] args) {
		
		int x = Integer.parseInt(JOptionPane.showInputDialog("Ange heltalet x"));
		int y = Integer.parseInt(JOptionPane.showInputDialog("Ange heltalet y"));
		
		JOptionPane.showMessageDialog(null, "x^y=" + x + "^" + y + "=" + pow(x, y));
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

}
