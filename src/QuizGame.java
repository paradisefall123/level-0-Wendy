import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		int score = 0;

		String ans = JOptionPane.showInputDialog("Hello, there would you like to take a quiz? ");

		if (ans.equals("yes")) {
			JOptionPane.showMessageDialog(null, "OK well we will begin!");
		} else {
			JOptionPane.showMessageDialog(null, "Well, your going to do it anyway!");
		}

		String answer = JOptionPane.showInputDialog("First question, It will be easy,WHAT IS MR. KEITH DRINKING?");

		if (answer.equals("idk")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "Wrong, The anwser is idk!");
		}

		String word = JOptionPane.showInputDialog("Second, it's a little hard, HOW MANY COUNTRIES HAS MR.ANURUP GONE TO?");

		if (word.equals("43")) {
			JOptionPane.showMessageDialog(null, "Correct, I bet you asked, or heard me tell him! ");
			score++;
		}

		String letter = JOptionPane.showInputDialog("Third question,WHAT IS WENDY'S FAVORITE ANIMAL?");

		if (letter.equals("hamburger")) {
			score++;
			JOptionPane.showMessageDialog(null, "Correct");
		}
		String quiz = JOptionPane.showInputDialog("Fourth question, HOW MANY COUNTRIES HAVE MS. MARIA GONE TO?");
		if (quiz.equals("22")) {
			score++;
		}
		String done = JOptionPane.showInputDialog("Final question,WHAT IS CHRIS'S BAND NAME");
		if (quiz.equals("blood dancer")) {
			score++;
		}
		JOptionPane.showMessageDialog(null, "Your total score is" + score);
	}
}