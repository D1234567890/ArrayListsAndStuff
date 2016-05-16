import java.util.ArrayList;
import java.util.HashMap;

public class AnimalHipsters {
	ArrayList<String> findAnimalHipsters(HashMap<String, ArrayList<String>> network, HashMap<String, String> favoriteAnimals) {
		ArrayList<String> values1 = new ArrayList<String>();
		ArrayList<String> values2 = new ArrayList<String>();
		ArrayList<String> values3 = new ArrayList<String>();
		ArrayList<String> values4 = new ArrayList<String>();
		ArrayList<String> values5 = new ArrayList<String>();
		ArrayList<String> values6 = new ArrayList<String>();
		ArrayList<String> values7 = new ArrayList<String>();
		ArrayList<String> values8 = new ArrayList<String>();
		ArrayList<String> values9 = new ArrayList<String>();
		ArrayList<String> values0 = new ArrayList<String>();
		ArrayList<ArrayList<String>> condensed = new ArrayList<ArrayList<String>>();
		condensed.add(values1);
		condensed.add(values2);
		condensed.add(values3);
		condensed.add(values4);
		condensed.add(values5);
		condensed.add(values6);
		condensed.add(values7);
		condensed.add(values8);
		condensed.add(values9);
		condensed.add(values0);
		String animal1 = "";
		String animal2 = "";
		String animal3 = "";
		String animal4 = "";
		String animal5 = "";
		String animal6 = "";
		String animal7 = "";
		String animal8 = "";
		String animal9 = "";
		String animal0 = "";
		ArrayList<String> group = new ArrayList<String>();
		group.add(animal1);
		group.add(animal2);
		group.add(animal3);
		group.add(animal4);
		group.add(animal5);
		group.add(animal6);
		group.add(animal7);
		group.add(animal8);
		group.add(animal9);
		group.add(animal0);

		int i = 0;
		for (ArrayList<String> a : network.values()) {
			switch (i) {
			case 0:
				values1 = a;
				break;
			case 1:
				values2 = a;
				break;
			case 2:
				values3 = a;
				break;
			case 3:
				values4 = a;
				break;
			case 4:
				values5 = a;
				break;
			case 5:
				values6 = a;
				break;
			case 6:
				values7 = a;
				break;
			case 7:
				values8 = a;
				break;
			case 8:
				values9 = a;
				break;
			case 9:
				values0 = a;
				break;
			}
		}
		int q = 0;
		for (String a : favoriteAnimals.values()) {
			switch (q) {
			case 0:
				animal1 = a;
				break;
			case 1:
				animal2 = a;
				break;
			case 2:
				animal3 = a;
				break;
			case 3:
				animal4 = a;
				break;
			case 4:
				animal5 = a;
				break;
			case 5:
				animal6 = a;
				break;
			case 6:
				animal7 = a;
				break;
			case 7:
				animal8 = a;
				break;
			case 8:
				animal9 = a;
				break;
			case 9:
				animal0 = a;
				break;
			}
		}
		for (ArrayList<String> a : condensed) {
			if (a != null) {
				String animal;
				String person = network.get(a);
			}
		}
	}
}
