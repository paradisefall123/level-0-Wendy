import javax.swing.JOptionPane;

public class SimpleSorter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int biggest;
		int middle;
		int littlest;
		String num1 = JOptionPane.showInputDialog("Please give me one number!");
		int number = Integer.parseInt(num1);
		String num2 = JOptionPane.showInputDialog("Another number please!");
		int number2 = Integer.parseInt(num2);
		String num3 = JOptionPane.showInputDialog("One more number!!");
		int number3 = Integer.parseInt(num3);
		if (number > number2) {
			biggest = number;
			middle = number2;
			littlest = number3;
		} else {
			biggest = number2;
			middle = number;
			littlest = number3;
		}
		if (number3 > biggest) {
			littlest = middle;
			middle = biggest;
			biggest = number3;
		} else if (number3 > middle) {
			littlest = middle;
			middle = number3;

		}
		System.out.println("The ascending order is...");
		System.out.println(littlest);
		System.out.println(middle);
		System.out.println(biggest);
		System.out.println("The descending order...");
		System.out.println(biggest);
		System.out.println(middle);
		System.out.println(littlest);
	}
}
