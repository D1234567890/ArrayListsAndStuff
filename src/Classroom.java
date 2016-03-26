import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Classroom {
	static ArrayList<Student> nerds = new ArrayList<Student>();

	public static void main(String[] args) {
		nerds.add(new Student(114, "Creepy"));
		nerds.add(new Student(123, "Skooty"));
		nerds.add(new Student(98, "Herpy"));
		nerds.add(new Student(105, "Niketeketiky"));
		nerds.add(new Student(138, "Ferkshy"));
		JOptionPane.showMessageDialog(null, getAverageIQ(nerds));
	}

	public static float getAverageIQ(ArrayList<Student> a) {
		float totalIQ = 0;
		for (Student s : a) {
			totalIQ += s.getIQ();
		}
		return totalIQ /= a.size();
	}
}
