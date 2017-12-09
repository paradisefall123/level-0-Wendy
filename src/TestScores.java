import javax.swing.JOptionPane;

public class TestScores {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("What is your test score out of 100?");
		int score = Integer.parseInt(input);
		if (score > 61) {
			JOptionPane.showMessageDialog(null, "Your grounded for a week!");
		} else if (score > 70) {
			JOptionPane.showMessageDialog(null, "No phone for two days. ");
		
		}else if(score>80){
			JOptionPane.showMessageDialog(null, "You should  stop playing video games to study more! ");
			
		}else if(score>90){
			JOptionPane.showMessageDialog(null, "You should study a little more! But it is great!");
		}else if(score>100){
			JOptionPane.showMessageDialog(null, "Wow! You must have studies hard!");
		}
	}
}
