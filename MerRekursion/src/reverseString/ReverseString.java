package reverseString;

import javax.swing.JOptionPane;

/*
 * Uppgift: Mer rekursion, string invertering
 * 
 * Programmet läser in ev string av användaren och returnerar samma string fast bak och fram
 */
public class ReverseString {
	
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Ange en text");
		
		JOptionPane.showMessageDialog(null, "Inverterad string: " + reverse(input));
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
