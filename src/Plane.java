import java.util.ArrayList;

public class Plane {
	int numberOfPassengers;
	ArrayList<Snake> evilSnakes = new ArrayList<Snake>();
	int probabilityOfDeathAddOn = 0;

	Plane(int numberOfPassengers) {
		this.numberOfPassengers = numberOfPassengers;
	}

	public static void main(String[] args) {
		Plane p = new Plane(100);
		int numberOfVenomousSnakes = 0;
		int totalViscousness = 0;
		for (int i = 0; i < 100; i++) {
			Randomness r = new Randomness();
			Snake s = new Snake(r.returnRandomNumber(), r.returnRandomBoolean());
			p.evilSnakes.add(s);
		}
		for (Snake s : p.evilSnakes) {
			if (s.getVenomous()) {
				numberOfVenomousSnakes++;
				totalViscousness += s.getViscousness();
			}
		}
		int probability = numberOfVenomousSnakes * totalViscousness / p.numberOfPassengers;
		System.out.println(probability);
	}
}
