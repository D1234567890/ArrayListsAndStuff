import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class ReturnNumericalValues {

	@Test
	public void test() {
		assertEquals("656667", convert("ABC"));
	}

	public String convert(String s) {
		ArrayList<Integer> addTo = new ArrayList<Integer>();
		String returnThis = "";
		for (int i = 0; i < s.length(); i++) {
			int convert = s.charAt(i);
			System.out.println(convert);
			addTo.add(convert);
		}
		for (int i = 0; i < addTo.size(); i++) {
			returnThis += addTo.get(i);
		}
		System.out.println(returnThis);
		return returnThis;
	}
}
