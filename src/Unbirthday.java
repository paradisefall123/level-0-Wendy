import javax.swing.JOptionPane;

public class Unbirthday {
	public static void main(String[] args) {
		String birthday = JOptionPane.showInputDialog("Howdy, when is your bi"+ "rthday?");
		if (birthday.toLowerCase().equals("august 26")) {
			JOptionPane.showMessageDialog(null, "Happy Birthday!");
		} else {
			JOptionPane.showMessageDialog(null, "Happy UnBirthday!");
		
		}
	}
}
 