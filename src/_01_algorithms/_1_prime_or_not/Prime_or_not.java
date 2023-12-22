package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class Prime_or_not {
public static void main(String[] args) {
	String numba = JOptionPane.showInputDialog("Input a number");
	int numbaInt = Integer.parseInt(numba);
	for (int i = 2; i < numbaInt; i++) {
		if (numbaInt%i==0) {
			System.out.println("Your number is not prime");
			System.exit(0);
		}
		
	}
	System.out.println("Your number, " + numba + "is prime");
}
}
