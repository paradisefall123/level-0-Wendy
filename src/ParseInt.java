import javax.swing.JOptionPane;

public class ParseInt {
	public static void main(String[] args) {
		String kookie = JOptionPane.showInputDialog("how many cups of flour do you have?");
		int flour = Integer.parseInt(kookie);
		if (flour < 2) {
			JOptionPane.showMessageDialog(null,"Get more flour!");
		}String suga =JOptionPane.showInputDialog("How many people are you going to give kookies to?");
		int people=Integer.parseInt(suga);
		if(people<30){
			JOptionPane.showMessageDialog(null,"You are going to make two batches!");
		}
	}
}