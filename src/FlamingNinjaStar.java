import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class FlamingNinjaStar {
public static void main(String[] args) {
	Robot n= new Robot();
	int baseSize=300;
	int flameSize=200;
	n.setSpeed(10);
	n.penDown();
	for(int i= 1;i<25;i++) {
	n.turn(45);
	n.move(64);
	n.turn(-40);
	n.setPenColor(Color.ORANGE);
	n.move(flameSize);
	n.turn(170);
	n.move(flameSize);
	n.turn(64);
	n.setPenColor(0, 0, 0);
	n.move(baseSize);
}
}
}
