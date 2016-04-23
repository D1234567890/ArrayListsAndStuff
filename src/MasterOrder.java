import java.util.ArrayList;

public class MasterOrder {
	private ArrayList<CookieOrder> a;

	MasterOrder() {
		a = new ArrayList<CookieOrder>();
	}

	public ArrayList<CookieOrder> getA() {
		return a;
	}

	public void setA(ArrayList<CookieOrder> a) {
		this.a = a;
	}

	public void addA(CookieOrder c) {
		a.add(c);
	}

	public int removeVariety(String compare) {
		int getWhere = 0;
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i).getVariety().equals(compare)) {
				a.remove(i);
				getWhere = i + 2;
			}
		}
		return getWhere;
	}

	public int getTotalBoxes() {
		int addTo = 0;
		if (a == null) {
			return 0;
		} else {
			for (int i = 0; i < a.size(); i++) {
				addTo += a.get(i).getNumBoxes();
			}
			return addTo;
		}
	}
}
