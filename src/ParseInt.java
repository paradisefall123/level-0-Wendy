import javax.swing.JOptionPane;

public class ParseInt {
	public static void main(String[] args) {
		String kookie = JOptionPane.showInputDialog("how many cups of flour do you have?");
		int flour = Integer.parseInt(kookie);
		if (flour < 2) {
			JOptionPane.showMessageDialog(null,"Get more flour!");
		}String suga =JOptionPane.showInputDialog("How many people are you going to give kookies to?");
		int people=Integer.parseInt(suga);
		if(people>30){
			JOptionPane.showMessageDialog(null,"You are going to make two batches!");
		}String friends = JOptionPane.showInputDialog("How many batches of cookies did you make!");
		int batches = Integer.parseInt(friends);	
		if(batches>2){
			JOptionPane.showMessageDialog(null, "You are lucky to you have so many friends!");
		}
		}
	}
