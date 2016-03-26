import java.util.Stack;

import javax.swing.JOptionPane;

public class StackStringBackwards {
	public static void main(String[] args) {
		String back = JOptionPane.showInputDialog("Input a String to print backwards!");
		JOptionPane.showMessageDialog(null, backwardsString(back));
	}

	public static String backwardsString(String s) {
		Stack<Character> stringStack = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			stringStack.push(s.charAt(i));
		}
		int size = stringStack.size();
		String reverse = "";
		for (int i = 0; i < size; i++) {
			reverse += stringStack.pop();
		}
		return reverse;
	}
}
