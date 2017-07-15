import javax.swing.JOptionPane;

public class Creeper {
	public static void main(String[] args) {
		String name=JOptionPane.showInputDialog("Hello, I'm wondering what's your name? ");
		JOptionPane.showMessageDialog(null, "I'm calling from Amc theaters to see if you are intersted in 5 free tickets to any movie");
		String phonenumber=JOptionPane.showInputDialog("But first, we need your phone number");
		String address=JOptionPane.showInputDialog("Now we need is your address");
		JOptionPane.showMessageDialog(null, "So your name is "+name+" And you live at "+address+" Also your phone number is "+phonenumber);
		JOptionPane.showMessageDialog(null, "Thank you, but didn't your parents teach you to not tell your info?");
		
	}

}
