import java.util.HashMap;

import javax.swing.JOptionPane;

public class HashMapp {
	public static void main(String[] args) {
		HashMap<Integer, String> mapp = new HashMap<Integer, String>();
		mapp.put(568, "YUMMY PAPERRR");
		mapp.put(568, "YUMMY PAPERR");
		JOptionPane.showMessageDialog(null, mapp.get(568));
	}
}
