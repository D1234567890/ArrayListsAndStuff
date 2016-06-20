import static org.junit.Assert.*;

import org.junit.Test;

public class TestSwap {

	@Test
	public void test() {
		assertEquals("asfdg", swap("asdfg", 2, 3));
	}

	public String swap(String word, int a, int b) {
		if (a == 0 && b == word.length() - 1) {
			char char1 = word.charAt(b);
			char char2 = word.charAt(a);
			String sub = word.substring(a + 1, b);
			return char1 + sub + char2;
		} else if (a == 0) {
			char char1 = word.charAt(b);
			char char2 = word.charAt(a);
			String sub1 = word.substring(a + 1, b);
			String sub2 = word.substring(b + 1, word.length());
			return sub1 + char1 + sub2 + char2;
		} else if (b == word.length()) {
			char char1 = word.charAt(b);
			char char2 = word.charAt(a);
			String sub1 = word.substring(0, a);
			String sub2 = word.substring(a + 1, b);
			return sub1 + char1 + sub2 + char2;
		} else {
			char char1 = word.charAt(b);
			char char2 = word.charAt(a);
			String sub1 = word.substring(0, a);
			String sub2 = word.substring(a + 1, b);
			String sub3 = word.substring(b + 1, word.length());
			return sub1 + char1 + sub2 + char2 + sub3;
		}
	}
}
