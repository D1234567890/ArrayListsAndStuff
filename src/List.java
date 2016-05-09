import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class List implements ActionListener {
	final int size = 500;
	HashMap<String, Integer> list = new HashMap<String, Integer>();
	JFrame frame;
	JPanel panel;
	JButton button1;
	JButton button2;

	public static void main(String[] args) {
		new List();
	}

	List() {
		frame = new JFrame("List Menu");
		panel = new JPanel();
		button1 = new JButton("Add");
		button2 = new JButton("View");
		frame.setVisible(true);
		frame.setSize(size, size);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		button1.addActionListener(this);
		button2.addActionListener(this);
	}

	@SuppressWarnings("unchecked")
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button1) {
			String enter = JOptionPane.showInputDialog("Please enter the name of the item on the list.");
			int id = Integer.parseInt(JOptionPane.showInputDialog("Now enter a number for this item so that you can identify it"));
			list.put(enter, id);
		} else {
			String format = "";
			for (String s : list.keySet()) {
				format += "Name: " + list.get(s) + " ID: " + s + "\n";
			}
			JOptionPane.showMessageDialog(null, format);
		}
	}
}
