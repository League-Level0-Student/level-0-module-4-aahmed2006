package doubles_and_booleans;

import javax.swing.JOptionPane;

public class TestScores {
	public static void main(String[] args) {
		String test = JOptionPane.showInputDialog("What is your test score?");
		double score = Double.parseDouble(test);
		if (score > 90) {
			JOptionPane.showMessageDialog(null, "Wow! You must have studied really hard for that test!");
		} else if (score > 70 && score < 90) {
			JOptionPane.showMessageDialog(null, "You did pretty well on that test! Good job!");
		} else if (score > 60 && score < 70) {
			JOptionPane.showMessageDialog(null, "It's a passing score, but study more next time.");
		} else if (score < 60) {
			JOptionPane.showMessageDialog(null, "u need help lol");
		}
	}
}
