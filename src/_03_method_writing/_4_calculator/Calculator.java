package _03_method_writing._4_calculator;

import javax.swing.JOptionPane;

public class Calculator {

	//GOAL: MAKE A CALCULATOR
	public static void main(String[] args) {
		String input1 = JOptionPane.showInputDialog("Enter a number");
		String input2 = JOptionPane.showInputDialog("Enter another number");
		double number1 = Double.parseDouble(input1);
		double number2 = Double.parseDouble(input2);
		int task = JOptionPane.showOptionDialog(null, "What do you choose?", "Calculator", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "divide", "multiply", "subtract", "add" }, null);
		// 3) Call the correct method depending on what option the user chooses
if (task == 0) {
	JOptionPane.showMessageDialog(null, result(divide(number1,number2)));
}
if (task == 1) {
	JOptionPane.showMessageDialog(null, result(multiply(number1,number2)));
}
if (task == 2) {
	JOptionPane.showMessageDialog(null, result(subtract(number1,number2)));
}
if (task == 3) {
	JOptionPane.showMessageDialog(null, result(add(number1,number2)));
}

		// 4) Call the result() method and put the answer in a pop-up
	}

	// 1) Make 4 static methods (add, subtract, multiply, divide)
	//		They should each take 2 numbers as parameters
	//		and return the answer.
	public static double add(double number1, double number2) {
		return number1 + number2;
	}
	public static double subtract(double number1, double number2) {
		return number1 - number2;
	}
	public static double multiply(double number1, double number2) {
		return number1 * number2;
	}
	public static double divide(double number1, double number2) {
		return number1 / number2;
	}
	// 2) Make a static method called " result" that takes a number
	//		as a parameter and returns the number in a string
	//		EX: "Your answer is " + number;
public static String result(double number) {
	return "Your answer is " + number;
}

}
