import java.awt.Color;
import java.util.Random;

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
paola.setWindowColor(Color.black);
  for(int i=1;i<21;i++) {
	  Random number = new Random();
		int height = number.nextInt(400);
	
			int red= number.nextInt(255);
			int green = number.nextInt(50);
			int blue = number.nextInt(255);
		  paola.setPenColor(red, green, blue);
		  if(height>=300) {
		  paola.move(height+100);
		  paola.turn(90);
		  paola.move(80);
		  paola.turn(-270);
		  paola.move(height+100);
		  paola.turn(-90);
		  paola.setPenColor(Color.GREEN);
		  paola.move(40);
		  paola.turn(-90);	
		  }else {
			  paola.move(height+100);
			  paola.turn(40);
			  paola.move(30);
			  paola.turn(90);
			  paola.move(30);
			  paola.turn(50);
			  paola.move(height+100);
			  paola.turn(-90);
			  paola.setPenColor(Color.GREEN);
			  paola.move(40);
			  paola.turn(-90);	
		  }
		
  }
}
}

