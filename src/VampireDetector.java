import javax.swing.JOptionPane;

public class VampireDetector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean vamps;
		String  vampire=JOptionPane.showInputDialog("Hello,I would like to get to know you, so here is a simple question, do you love going to the beach in a sunny day?");
		
		String   garlic=JOptionPane.showInputDialog("Thanks, ok next question, Do you love garlic because I do!");
		
		String  age=JOptionPane.showInputDialog("This must be a little personal but how old are you?");
		int number= Integer.parseInt(age);
	if (vampire.equals("no")&&  (garlic.equals("no")) && (number>100)){
		vamps = true;
	}else	
	
	}
		
		
	}

}
