import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class CheckPoint {
	public static void main(String[] args) {
		String color = JOptionPane.showInputDialog("What's your favorite color?");
		JOptionPane.showMessageDialog(null, color + " is also my favorite color!");
        Robot bobby=new Robot();
        bobby.penDown();
        bobby.setSpeed(100);
        bobby.turn(120);
        bobby.move(200);
        bobby.turn(120);
        bobby.move(200);
        bobby.turn(120);
        bobby.move(200);
        bobby.turn(120);
        
	}
}
