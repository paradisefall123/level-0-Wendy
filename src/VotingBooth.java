import javax.swing.JOptionPane;

public class VotingBooth {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Hello, how old are you?");
		int age = Integer.parseInt(input);
		if (age > 18) {
			JOptionPane.showInputDialog("Who do you think should be the next president?");
		} else {
			JOptionPane.showMessageDialog(null, "Your Opinion doesn't matter!");
		}
	}
}
