import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
public static void main(String[] args) {
  Robot paola = new Robot();
  paola.setSpeed(20);
  paola.turn(-90);
  paola.move(840);
  paola.turn(-90);
  paola.move(400);
  paola.turn(-180);
  paola.penDown();
  paola.setPenColor(Color.MAGENTA);
  paola.move(100);
  paola.turn(90);
  paola.move(80);
  paola.turn(-270);
  paola.move(100);
  paola.turn(-90);
  paola.setPenColor(Color.GREEN);
  paola.move(40);
  for(int i=1;i<10;i++) {
	paola.turn(-90);
  }
}
}

