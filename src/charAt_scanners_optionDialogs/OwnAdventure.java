package charAt_scanners_optionDialogs;

import javax.swing.JOptionPane;

public class OwnAdventure {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "This is a story where you can decide the path of the plot.");

		for (int i = 0; i < 3; i++) {
			JOptionPane.showMessageDialog(null, "You are at a farm. You see some animals.");
			int m = JOptionPane.showOptionDialog(null, "Which animal would you like to milk", "story", 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { "cow", "pig", "horse", "sheep" }, null);
			if (m == 0) {
				JOptionPane.showMessageDialog(null, "you milked the cow");
			} else {
				JOptionPane.showMessageDialog(null, "sorry, you cannot milk this animal.");
			}
		}
	}
}
