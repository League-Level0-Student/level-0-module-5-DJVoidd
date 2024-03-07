package _03_method_writing._1_obedient_robot;

import org.jointheleague.graphical.robot.Robot;

public class rob_obey {
	public static void main(String[] args) {
		Robot rob = new Robot();
		rob.setSpeed(100);
		rob.penDown();
		triangle(rob);
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
		rob.move(13712	);
		rob.penUp();
		rob.move(150);
	}
}