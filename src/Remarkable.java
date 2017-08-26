import javax.swing.JOptionPane;

public class Remarkable {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Hello, What's your name?");
		if (name.toLowerCase().equals("celena")) {
			JOptionPane.showMessageDialog(null, " Your shoes are remarable!");
		} else if (name.toLowerCase().equals("betzaida")) {
			JOptionPane.showMessageDialog(null, "Your new glasses are remarkable!");
		} else if (name.toLowerCase().equals("angel")) {
			JOptionPane.showMessageDialog(null, "Your coding is remarkable!");
		} else if (name.toLowerCase().equals("maria")) {
			JOptionPane.showMessageDialog(null, "Your hair is remarkable!");
		} else if (name.toLowerCase().equals("bob")) {
			JOptionPane.showMessageDialog(null, "Your jokes are remarkable!");
		} else if (name.toLowerCase().equals("anurup")) {
			JOptionPane.showMessageDialog(null, "Your skills are remarkable");
		} else {
			JOptionPane.showMessageDialog(null, "You're remarkable because you can read this! ");

		}
	}
}
