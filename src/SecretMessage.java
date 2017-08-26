import javax.swing.JOptionPane;

public class SecretMessage {
	public static void main(String[] args) {
		String secret = JOptionPane.showInputDialog(
				"What is the PASSCODE! If you get it right I'll tell you the lottery numbers!(HINT: What is Wendy's favorite animal)");
		if (secret.toLowerCase().equals("fox")) {
			JOptionPane.showMessageDialog(null, " The lottery number is 12345");
		} else {
			JOptionPane.showMessageDialog(null, "INTRUDER!!YOU'RE NOT WORTHY!");
		}
	}
}
