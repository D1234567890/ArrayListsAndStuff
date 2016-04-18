import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Stack;

import org.junit.Test;

public class StackStringBackwardsTest {

	@Test
	public void test() {
		ArrayList<Integer> testing = new ArrayList<Integer>();
		testing.add(0);
		testing.add(1);
		testing.add(2);
		testing.add(3);
		assertEquals("tset", backwardsString("test"));
		assertEquals(565789, reverseInteger(987565));
		assertEquals(40, getSquarePerimeter(10));
		assertEquals(true, isWeekend("Saturday"));
		assertEquals(false, isWeekend("blah"));
		assertEquals(false, isWeekend("Tuesday"));
		assertEquals(testing, createArrayList(4));
	}

	public String backwardsString(String s) {
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

	public long reverseInteger(long i) {
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

	public int getSquarePerimeter(int p) {
		return p * 4;
	}

	public boolean isWeekend(String day) {
		if (!day.contains("day")) {
			return false;
		} else {
			if (day.equalsIgnoreCase("Sunday") || day.equalsIgnoreCase("Saturday")) {
				return true;
			} else {
				return false;
			}
		}
	}

	public ArrayList<Integer> createArrayList(int num) {
		ArrayList<Integer> returnType = new ArrayList<Integer>();
		for (int i = 0; i < num; i++) {
			returnType.add(i);
		}
		return returnType;
	}
}
