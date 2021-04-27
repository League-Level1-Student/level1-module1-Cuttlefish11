package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornRunner {
public static void main(String[] args) {
	String FLAVOR = JOptionPane.showInputDialog("Choose a flavor for your popcorn. Any flavor. Even eyeballs!");
	Popcorn pop = new Popcorn (FLAVOR);
	String TIMER = JOptionPane.showInputDialog("Choose how many minutes to cook your popcorn (no decimals)!");
	int COOK = Integer.parseInt(TIMER);
	Microwave mic = new Microwave ();
mic.putInMicrowave(pop);
mic.setTime(COOK);
mic.startMicrowave();
}
}
