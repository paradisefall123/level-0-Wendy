import javax.swing.JOptionPane;

public class BirthdayReminder {
	public static void main(String[] args) {
		
		// 1. correct the birthdays for your family below
		String paolaDadBirthday = "May 1";
		String paolaBirthday = "October 25";
		String wendyBirthday = "November 19";

		// 2. Find out which birthday the user wants and and store their response in a variable
		String chosenBirthday= JOptionPane.showInputDialog(null,"Who's birthday do you wanna know, Wendy,Paola,Paola's dad ");
		// 3. Print out what the user typed
				JOptionPane.showMessageDialog(null,chosenBirthday);
		// 4. if user asked for "Paola's dad"
			//print Paola's Dad's birthday
				if(chosenBirthday.equals("Paola's dad")){
					JOptionPane.showMessageDialog(null, paolaDadBirthday);
				}else if(chosenBirthday.equals("Wendy")){
						JOptionPane.showMessageDialog(null, wendyBirthday);
				}else if(chosenBirthday.equals("Paola")){
					JOptionPane.showMessageDialog(null, paolaBirthday);
					}else{
						
						JOptionPane.showMessageDialog(null,"Sorry,I don't remember that person's birthday!");
					}
				
		// 5. if user asked for "Wendy"
				
			// print Wendy's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}


