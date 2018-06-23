import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	static Robot charlie = new Robot();

	public static void main(String[] args) {
		String color = JOptionPane.showInputDialog("What color do you want black, blue,or a random?");
		if (color.equalsIgnoreCase("black")) {
			charlie.setPenColor(255, 0, 0);
		} else if (color.equalsIgnoreCase("random")) {
			charlie.setRandomPenColor();

		} else if (color.equalsIgnoreCase("blue")) {

			charlie.setPenColor(0, 0, 255);

		}

		String shape = JOptionPane.showInputDialog("What shape would you like square, triangle, and circle?");
		if (shape.equalsIgnoreCase("square")) {
			drawSquare();
		} else if (shape.equalsIgnoreCase("triangle")) {
			drawTriangle();
		} else if (shape.equalsIgnoreCase("circle")) {
			drawCircle();

		} else {

			JOptionPane.showMessageDialog(null, "Sorry, can't make that?");
		}
	}

	private static void drawSquare() {
		charlie.penDown();
		for(int i=0;i<5;i++) {
			charlie.move(100);
			charlie.turn(90);
		}

	}

	private static void drawTriangle() {

		charlie.setSpeed(30);
		charlie.penUp();
		charlie.move(300);
		charlie.penDown();
		charlie.move(200);
		charlie.turn(130);
		charlie.move(200);
		charlie.turn(100);
		charlie.move(200);
		charlie.turn(130);
		charlie.move(100);
	}

	private static void drawCircle() {
		charlie.setSpeed(30);
		charlie.penUp();
		charlie.turn(-90);
		charlie.move(200);
		charlie.penDown();
		for (int i = 1; i < 80; i++) {
			charlie.turn(5);
			charlie.move(10);

		}
	}

}
