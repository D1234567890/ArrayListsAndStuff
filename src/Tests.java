import static org.junit.Assert.*;

import org.junit.Test;

public class Tests {

	@Test
	public void test() {
		assertEquals(Math.sin(60), parseTrigFunction("sin(60)"), 0);
		assertEquals(Math.cos(6789), parseTrigFunction("cos(6789)"), 0);
		assertEquals(Math.tan(60), parseTrigFunction("tan(60)"), 0);
	}

	public double parseTrigFunction(String s) {
		if (s.contains("sin")) {
			String blah = "";
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == '1' || s.charAt(i) == '2' || s.charAt(i) == '3' || s.charAt(i) == '4' || s.charAt(i) == '5' || s.charAt(i) == '6' || s.charAt(i) == '7'
						|| s.charAt(i) == '8' || s.charAt(i) == '9' || s.charAt(i) == '0') {
					blah += s.charAt(i);
				}
			}
			return Math.sin(Integer.parseInt(blah));
		} else if (s.contains("cos")) {
			String blah = "";
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == '1' || s.charAt(i) == '2' || s.charAt(i) == '3' || s.charAt(i) == '4' || s.charAt(i) == '5' || s.charAt(i) == '6' || s.charAt(i) == '7'
						|| s.charAt(i) == '8' || s.charAt(i) == '9' || s.charAt(i) == '0') {
					blah += s.charAt(i);
				}
			}
			return Math.cos(Integer.parseInt(blah));
		} else {
			String blah = "";
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == '1' || s.charAt(i) == '2' || s.charAt(i) == '3' || s.charAt(i) == '4' || s.charAt(i) == '5' || s.charAt(i) == '6' || s.charAt(i) == '7'
						|| s.charAt(i) == '8' || s.charAt(i) == '9' || s.charAt(i) == '0') {
					blah += s.charAt(i);
				}
			}
			return Math.tan(Integer.parseInt(blah));
		}
	}

}
