package _05_vault;

import javax.swing.JOptionPane;

public class VaultRunner {
public static void main(String[] args) {

	Vault V = new Vault ();
	String NUM = JOptionPane.showInputDialog("Enter a four digit integer.");
	int NuM = Integer.parseInt (NUM);
	V.tryCode(NuM);
	boolean x = V.tryCode(NuM);
if (x == true) {
	JOptionPane.showMessageDialog(null, "Access granted");
}
if (x == false) {
	JOptionPane.showMessageDialog(null, "WRONG!");	
}

}
}

