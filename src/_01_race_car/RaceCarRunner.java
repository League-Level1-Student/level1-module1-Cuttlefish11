package _01_race_car;

import javax.swing.JOptionPane;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */



public class RaceCarRunner {
	public static void main(String[] args) {
		/* Do the following things without changing the RaceCar class */
		
		// 1. Create a RaceCar and place it in 5th position
String rb = JOptionPane.showInputDialog("What is your racecar's brand?");
		RaceCar rc = new RaceCar(rb, 5);
		// 2. Print the RaceCar's position in the race
		rc.crash();
		
		if (rc.damaged) {
			rc.pit();
		}
		for (int i = 0; i < args.length; i++) {
		System.out.println("Awesome race car is in" + rc.getPositionInRace());
		String rd = JOptionPane.showInputDialog("What is your racecar's brand?");
		}
	
	rc.crash();
		
if (rc.damaged) {
	rc.pit();
}
while (true) {
	String rd = JOptionPane.showInputDialog("Where will you drive? Down the steep hill, up the mountain, or through the swamp");
if (rc.getPositionInRace() == 1) {
	JOptionPane.showMessageDialog(null, "You won!");
	return;
}
	else if (rd.equals("hill") || rd.equals("steep hill") || rd.equals("Down the steep hill") || rd.equals("down the steep hill")) {
JOptionPane.showMessageDialog(null, "You doom down the hill at exteme speeds but soon hit a rock!");
rc.crash();
if (rc.damaged) {
	rc.pit();
}
}
else if (rd.equals("mountain") || rd.equals("Mountain") || rd.equals("Up the mountain") || rd.equals("up the mountain")) {
JOptionPane.showMessageDialog(null, "You climb up the massive mountain but you run out of gas. You find a gas station and restraunt so you take a pit stop.");
rc.pit();
}
else if (rd.equals("swamp") || rd.equals("Swamp") || rd.equals("through the swamp") || rd.equals("Through the swamp")) {
JOptionPane.showMessageDialog(null, "You begin slowly going through the murk but then you find a shortcut. Yay!");
rc.overtake();
}

		// 5. Help the car move into first place.


	}
	}
	}
