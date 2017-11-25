import javax.swing.JOptionPane;

public class VampireDetector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String  vamps=JOptionPane.showInputDialog("Hello,I would like to get to know you, so here is a simple question, do you love going to the beach in a sunny day?");
		if (vamps.equals("yes")){
			JOptionPane.showMessageDialog(null,"That's great me too!");
		}else{
			JOptionPane.showMessageDialog(null, "OK");
		}
		String   blood=JOptionPane.showInputDialog("Thanks, ok next question, Do you love garlic because I do!");
		String  garlic=JOptionPane.showInputDialog("This must be a little personal but how old are you?");
		
		
		
		
	}

}
