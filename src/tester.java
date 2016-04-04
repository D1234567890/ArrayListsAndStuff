import static org.junit.Assert.*;

import org.junit.Test;

public class tester {

	@Test
	public void test() {
		assertEquals(3, add(1, 2));
	}

	public int add(int x, int y) {
		return x + y;
	}

}
