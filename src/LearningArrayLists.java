import java.util.ArrayList;

public class LearningArrayLists {
	public static ArrayList createArrayList() {
		ArrayList<String> newArray = new ArrayList<String>();
		return newArray;
	}

	public static void addToArrayList(ArrayList a, String what) {
		a.add(what);
	}

	public static String getItem(ArrayList a, int whatPlace) {
		return (String) a.get(whatPlace);
	}

	public static int getNumberOfItems(ArrayList a) {
		return a.size();
	}

	public static String iterateOver(ArrayList a) {
		return (String) a.get(0) + a.get(1) + a.get(2);
	}

	public static int findItemOnList(ArrayList a, String whatItem) {
		int ifItemEquals = 0;
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i).equals(whatItem)) {
				ifItemEquals = i;
			}
		}
		return ifItemEquals;
	}

	public static ArrayList replaceItem(ArrayList a, int place, String replace) {
		for (int i = 0; i < a.size(); i++) {
			if (place == i) {
				a.set(i, replace);
			}
		}
		return a;
	}

	public static ArrayList insertItem(ArrayList a, int place, String add) {
		a.add(place, add);
		return a;
	}

	public static ArrayList createTypedArrayList() {
		ArrayList<Integer> a = new ArrayList<Integer>();
		return a;
	}

	public static int addAllInteger(ArrayList<Integer> a) {
		return a.get(0) + a.get(1) + a.get(2);
	}
}
