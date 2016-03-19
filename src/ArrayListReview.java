import java.util.ArrayList;

public class ArrayListReview {
	public static void main(String[] args) {
		ArrayList<String> yay = new ArrayList<String>();
		yay.add("BLAH");
		yay.add("BLEE");
		yay.add("BLIX");
		yay.add("BLOO");
		for (String printOut : yay) {
			System.out.println(printOut);
		}
	}
}