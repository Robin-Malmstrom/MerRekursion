package javium;

import javax.swing.JOptionPane;

/*
 * Uppgift: mer rekursion, Javium 
 * 
 * Program som räknar ut återstående massa av Javium som har halverings tid på exakt ett år
 */
public class Javium {

	public static void main(String[] args) {
		double mass = Double.parseDouble(JOptionPane.showInputDialog("Ange massan av javium (kg)"));
		double years = Double.parseDouble(JOptionPane.showInputDialog("Ange antalet år"));
		String result = "Efter " + Math.floor(years) + " år, återstår " + half(mass, years) * 1000 + "g javium";
		JOptionPane.showMessageDialog(null, result);
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
}
