import java.util.Stack;

import javax.swing.JOptionPane;

public class ReverseInt {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Enter a number so I can return it backwards:");
		long i = Long.parseLong(input);
		JOptionPane.showMessageDialog(null, "That number backwards is " + reverseInteger(i) + "!");
	}

	public static long reverseInteger(long i) {
		Stack<Character> reversingInt = new Stack<Character>();
		String reverse = "" + i;
		String reversed = "";
		for (int ii = 0; ii < reverse.length(); ii++) {
			reversingInt.push(reverse.charAt(ii));
		}
		for (int ii = 0; ii < reverse.length(); ii++) {
			reversed += reversingInt.pop();
		}
		return Integer.parseInt(reversed);
	}
}
