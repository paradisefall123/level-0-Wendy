import javax.swing.JOptionPane;

public class IfElse {
	public static void main(String[] args) {
		String hello = "yes";
		if (hello.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Happy");
		} else if (hello.equals("no")) {
			JOptionPane.showMessageDialog(null, "sad");
		} else {
			JOptionPane.showMessageDialog(null, "Wednesday");
		}
		int age = 11;
		if (age < 20) {
			JOptionPane.showMessageDialog(null, "Feels great to be young!");
		} else {
			JOptionPane.showMessageDialog(null, "Don't you wish you could be young!");
		}

	}
}