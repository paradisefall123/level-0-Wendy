import javax.swing.JOptionPane;

public class AreYouHappy {

	public static void main(String[] args) {
		String happy = JOptionPane.showInputDialog(" Are you happy?");
		if (happy.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");

		} else {
			String input = JOptionPane.showInputDialog("Do you want to be happy? ");
			if (input.equalsIgnoreCase("yes")) {
				JOptionPane.showMessageDialog(null, "Change something.");
			} else {
				JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
			}
		}
	}
}