package _03_method_writing._1_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class RobObey {
	public static void main(String[] args) {
		Robot rob = new Robot();
		rob.setSpeed(100);
		rob.penDown();
		String ask = JOptionPane.showInputDialog("Which shape do you want the robot to draw?\n(square, triangle, circle)");
		if (ask.equals("square")) {
			square(rob);
		}
		if (ask.equals("triangle")) {
			triangle(rob);
		}
		if (ask.equals("circle")) {
			circle(rob);	
		}
	}
	public static void square(Robot rob) {
		for (int i = 0; i < 4; i++) {
			rob.move(100);
			rob.turn(90);
		}
		rob.penUp();
		rob.move(150);
	}
	public static void triangle(Robot rob) {
		rob.turn(45);
		rob.move(100);
		rob.turn(90);
		rob.move(100);
		rob.turn(135);
		rob.move(139);
		rob.penUp();
		rob.move(150);
	}
	public static void circle(Robot rob) {
		for (int i =0; i <36; i++) {
			rob.move(10);
			rob.turn(10);
		}
		rob.penUp();
		rob.move(150);	
	}
}