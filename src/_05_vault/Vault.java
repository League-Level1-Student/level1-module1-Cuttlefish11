package _05_vault;

public class Vault {
	int secretCode = 2021;
	Vault (){
		this.secretCode = secretCode;
	}
	boolean tryCode (int num) {
		if (num == secretCode) {
			return true;	
		}
		else {
			return false;
		}
		
	}
}

