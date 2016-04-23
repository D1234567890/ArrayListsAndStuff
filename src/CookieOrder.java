
public class CookieOrder {
	private String variety;
	private int numBoxes;

	CookieOrder(String variety, int numBoxes) {
		this.variety = variety;
		this.numBoxes = numBoxes;
	}

	public void setVariety(String set) {
		variety = set;
	}

	public void setNumBoxes(int set) {
		numBoxes = set;
	}

	public String getVariety() {
		return variety;
	}

	public int getNumBoxes() {
		return numBoxes;
	}
}
