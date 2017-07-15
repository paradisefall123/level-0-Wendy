import javax.swing.JOptionPane;

public class GreetSomething {
public static void main(String[] args) {
	JOptionPane.showMessageDialog(null, "Tacos are my favorite");
	String name=JOptionPane.showInputDialog("What's your favorite thing to eat ");
	JOptionPane.showMessageDialog(null,name+" are good");
}
}
