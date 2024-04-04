package _04_practice._1_skill_practice;

import java.util.Iterator;

import javax.swing.JOptionPane;

public class SkillPractice {
	public static void main(String[] args) {

		SkillPractice skills = new SkillPractice();
		skills.skill1();
		skills.skill2();
		skills.skill3();
		skills.skill4();
		skills.skill5();
	}

	void skill1() {
		// Use pop-ups for the following.
		// Ask the user how many dimes they have
		String dimes = JOptionPane.showInputDialog("How many dimes do you have");
		int dimesInt = Integer.parseInt(dimes);


		// Tell them how many cents they have (hint multiply by 10)
		JOptionPane.showMessageDialog(null, "You have " +dimesInt*10 + " cents");



		// Ask the user how tall they are (inches)
		String inches = JOptionPane.showInputDialog("How tall are you in inches?");
		int inchesInt = Integer.parseInt(inches);
		if (inchesInt<=36) {
			JOptionPane.showMessageDialog(null, "Go eat your wheaties");
		}
		else {
			JOptionPane.showMessageDialog(null, "Great! you're not short!");
		}
		// If they are shorter than 36 inches, tell them to eat their Wheaties




	}

	void skill2() { // Write a loop to print every third number between 1 and 30 to the console
		for (int i = 1; i < 30; i+=3) {
			System.out.println(i);
		}






	}

	void skill3() { // Get a random number that is less than 20 and print it to the console


		String giveNumba1 = JOptionPane.showInputDialog("Type a number that is less than 20");
		int numba1 = Integer.parseInt(giveNumba1);
		// Get another random number that is less than 10 and print it to the console
		String giveNumba2 = JOptionPane.showInputDialog("Type a number that is less than 10");
		int numba2 = Integer.parseInt(giveNumba2);


		// Using a pop-up, tell the user the difference between the numbers // Hint: use subtraction
		JOptionPane.showMessageDialog(null, "The difference is " + (numba1 -= numba2) + "" );


	}

	void skill4() { // In a pop-up, ask the user for the city they live in



		// If they answered "San Diego", tell them they live in America's Finest City
		String giveCity = JOptionPane.showInputDialog("Which city do you live in");
		if(giveCity.equals("San Diego")) {
JOptionPane.showMessageDialog(null, "You live in america's finest city.");
		}
		else {
			JOptionPane.showMessageDialog(null, "Move to San Diego.");
		}

		// Otherwise, tell them to move to San Diego



		// Create a variable - cars - and initialize it to the number of cars your family has. // If there are 0 cars, use a pop-up to display, "I bet you use public transportation."
int cars = 3;
if (cars==3) {
	System.out.println("You have " + (cars*=4) + " wheels on your cars");
}

		// If there is 1 car, use a pop-up to display the make/model of the car



		// If there is more than 1 car, use a pop-up to display how many wheels the // cars have between them.



	}

	void skill5() { // In a pop-up, ask the user for the name of their school


String getSchool = JOptionPane.showInputDialog("Which school do you go to?");
JOptionPane.showMessageDialog(null, getSchool + " is an amazing school");
		// In another pop-up, tell the user, that their school is a fantastic school. // You must include the name of the school in the message.



	}
}
