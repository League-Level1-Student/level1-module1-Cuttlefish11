package _05_vault;

import javax.swing.JOptionPane;

public class JamesBond {
	JamesBond () {
		
	}
	void findCode (Vault V){
		for (int i = 0; i < 1000001; i++) {
			if (i == V.secretCode) {
				JOptionPane.showMessageDialog(null, "The code is " + i);
			}
		}
	}
	
}
