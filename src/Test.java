import static org.junit.Assert.*;

import java.util.ArrayList;

public class Test {

	@org.junit.Test
	public void test() {
		ArrayList<Integer> check = new ArrayList<Integer>();
		check.add(0);
		check.add(1);
		check.add(1);
		check.add(2);
		check.add(3);
		check.add(5);
		check.add(8);
		check.add(13);
		assertEquals(check, fibonacci(8));
		check.add(21);
		assertEquals(check, fibonacci(9));
	}

	public ArrayList<Integer> fibonacci(int num) {
		ArrayList<Integer> addTo = new ArrayList<Integer>();
		addTo.add(0);
		addTo.add(1);
		int num1 = 0;
		int num2 = 1;
		int num3;
		for (int i = 0; i < num - 2; i++) {
			num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
			addTo.add(num3);
		}
		return addTo;
	}

}
