import java.util.Random;

public class Randomness {
	public boolean returnRandomBoolean() {
		int randomNum = new Random().nextInt(2);
		if (randomNum == 0) {
			return true;
		} else {
			return false;
		}
	}

	public int returnRandomNumber() {
		int randomNum = new Random().nextInt(10);
		return randomNum + 1;
	}
}