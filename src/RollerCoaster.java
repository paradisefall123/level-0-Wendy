import javax.swing.JOptionPane;

public class RollerCoaster {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Hello,what's your height?");
		int height = Integer.parseInt(input);
		if (height < 48) {
			JOptionPane.showMessageDialog(null, "You need to grow a little more to ride.");
		} else {
			JOptionPane.showMessageDialog(null, "Welcome to the ride!");
		}
	}
}
