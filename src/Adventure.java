import javax.swing.JOptionPane;

public class Adventure {
	public static void main(String[] args) {
		String begin = JOptionPane.showInputDialog("You are going to a field trip to Torrey Pines with your whole class. Do you want to go or not?   ");

		if (begin.equalsIgnoreCase("no")) {
			JOptionPane.showMessageDialog(null, "Then you stay home and sleep all day wondering how it would  have gone in the field trip. (The End, you are really boring.)");

		} else {
			JOptionPane.showMessageDialog(null, "You are at school ready to go in the van to go hiking!!");
			String ready = JOptionPane.showInputDialog(
					"You are separated from the boys so all the girls sit together and boys got to the other van. Do you sneak into the boy's van or stay with the girls. Put yes to go with the boys and  no to stay with girls. ");

			if (ready.equalsIgnoreCase("yes")) {
				JOptionPane.showMessageDialog(null,
						"You sneaked into the boys van but get caught by the teacher you now can't go to the field trip. You go home and do nothing for the rest of the day.(Wow! You should start doing right choices!). The End. ");
			} else {
				JOptionPane.showMessageDialog(null, "You are with the girls sitting in the back, all buckled up,ready to go!");
				String middle = JOptionPane.showInputDialog(
						"The van made it to Torrey Pines and your class starts hiking, and the teacher talks about the rules. Do you break the rules or follow them.For breaking rules put yes and for following them put no. ");
				if (middle.equalsIgnoreCase("yes")) {
					JOptionPane.showMessageDialog(null, "You and your class leave the field trip early and everyone gets mad at you.(Wow! Great move!).the End");
				} else {
						JOptionPane.showMessageDialog(null, "You follow the rules and have a great time with your friends!The End!");
				}
			}
		}
	}
}
