import java.util.Random;

import javax.swing.JOptionPane;

public class TastyEgg {
	public static void main(String[] args) {
		KinderSurprise myKinderSurprise = new KinderSurprise(new Egg(new Toy()));
		// Your mission: Find out what toy is inside your KinderSurprise.
		JOptionPane.showMessageDialog(null, myKinderSurprise.getKinderSurpriseContents().getEggContents().getToyName());
	}
}

class KinderSurprise {
	private Egg egg;

	public KinderSurprise(Egg egg) {
		this.egg = egg;
	}

	Egg getKinderSurpriseContents() {
		return egg;
	}
}

class Egg {

	private Toy toy;

	public Egg(Toy toy) {
		this.toy = toy;
	}

	Toy getEggContents() {
		return toy;
	}

}

class Toy {
	String getToyName() {
		int randomToySelector = new Random().nextInt(3);
		if (randomToySelector == 0)
			return "play doh";
		else if (randomToySelector == 1)
			return "train";
		else
			return "spongebob";
	}

}

