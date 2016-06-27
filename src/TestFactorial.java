import static org.junit.Assert.*;

import org.junit.Test;

public class TestFactorial {

	@Test
	public void test() {
		assertEquals(2, factorial(2));
		assertEquals(6, factorial(3));
		assertEquals(24, factorial(4));
		assertEquals(120, factorial(5));

		assertEquals(0, fibonacci(0));
		assertEquals(1, fibonacci(1));
		assertEquals(1, fibonacci(2));
		assertEquals(2, fibonacci(3));
		assertEquals(3, fibonacci(4));
		assertEquals(5, fibonacci(5));
		assertEquals(8, fibonacci(6));
		assertEquals(13, fibonacci(7));
	}

	public int factorial(int num) {
		if (num == 1) {
			return 1;
		} else {
			return num * factorial(num - 1);
		}
	}

	public int fibonacci(int num) {
		if (num > -1 && num < 2) {
			return num;
		}
		int a = fibonacci(num - 1);
		int b = fibonacci(num - 2);
		return a + b;
	}
}
