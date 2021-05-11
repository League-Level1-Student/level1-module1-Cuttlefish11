package _06_duck;

import javax.swing.JOptionPane;

public class Duck {
	int numberOfFriends;
	String favoriteFood;
	Duck(String favoriteFood, int numberOfFriends) {
	       this.favoriteFood = favoriteFood;
	       this.numberOfFriends = numberOfFriends;
	}
void quack () {
JOptionPane.showMessageDialog(null, "QUACK!");	
JOptionPane.showMessageDialog(null, "The duck eats a " + favoriteFood + " with " + numberOfFriends + " friends.");
}

void waddle() {
	JOptionPane.showMessageDialog(null, "The duck waddles around.");
}

}
