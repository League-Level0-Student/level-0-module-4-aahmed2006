package extra;


import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {

		// 1. Get 2 numbers from the user and convert them to integer.
String num = JOptionPane.showInputDialog("Give a number.");
String num2 = JOptionPane.showInputDialog("Give another number.");
int number = Integer.parseInt(num);
int number2 = Integer.parseInt(num2);
		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "What would you like to do with these numbers?", "Calculator", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Addition", "Subtraction", "Multiplication", "Division" },
				null);

		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.

		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	}

	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }
			static void add(int number, int number2) {
				int num3 = number + number2;
				JOptionPane.showMessageDialog(null, number + " + " + number2 + " = " + num3);
			}
	// 4. Create similar methods for subtraction, multiplication and division.
			static void subtract(int number, int number2) {
				int num3 = number - number2;
				JOptionPane.showMessageDialog(null, number + " - " + number2 + " = " + num3);
			}
			static void multiply(int number, int number2) {
				int num3 = number * number2;
				JOptionPane.showMessageDialog(null, number + " * " + number2 + " = " + num3);
			}
			static void divide(int number, int number2) {
				int num3 = number/number2;
				JOptionPane.showMessageDialog(null, number + "/" + number2 + " = " + num3);
			}
}