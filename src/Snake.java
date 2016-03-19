
public class Snake {
	private int viscousness;
	private boolean venomous;

	Snake(int viscousness, boolean venomous) {
		this.viscousness = viscousness;
		this.venomous = venomous;
	}

	int getViscousness() {
		return viscousness;
	}

	boolean getVenomous() {
		return venomous;
	}
}
