import javax.swing.JOptionPane;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String number = JOptionPane.showInputDialog("Please give me a number.");

		int x = Integer.parseInt(number);
		boolean isprime = true;

		for (int i = 2; i < x; i++) {
			if (x % i == 0) {
				isprime = false;
		     
			}
			
		}
		if(isprime) {
			JOptionPane.showMessageDialog(null, x+" is prime");
			
			
		}else {
			JOptionPane.showMessageDialog(null, x+" is composite");
		}
	}
}