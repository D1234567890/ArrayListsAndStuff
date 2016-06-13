import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WordScramble implements ActionListener {

	final int SIZE = 500;

	ArrayList<String> words = new ArrayList<String>();

	JFrame frame;
	JPanel panel;
	JButton add;
	JButton view;
	JButton play;

	public static void main(String[] args) {
		new WordScramble();
	}

	WordScramble() {
		frame = new JFrame("Menu");
		panel = new JPanel();
		add = new JButton("Add a Word");
		view = new JButton("View Words");
		play = new JButton("Play Game");
		frame.setVisible(true);
		frame.setSize(SIZE, SIZE);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.add(add);
		panel.add(view);
		panel.add(play);
		add.addActionListener(this);
		view.addActionListener(this);
		play.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == add) {
			String word = JOptionPane.showInputDialog("Please enter your word!");
			words.add(word);
		} else if (e.getSource() == view) {
			String addTo = "";
			for (int i = 1; i < words.size() + 1; i++) {
				addTo += i + ". " + words.get(i - 1) + "\n";
			}
			JOptionPane.showMessageDialog(null, addTo);
		} else {
			int random = new Random().nextInt(words.size());
			String randomWord = words.get(random);
			String preserve = randomWord;
			for (int i = 0; i < 100; i++) {
				int randomChar = new Random().nextInt(randomWord.length());
				String thing = randomWord.substring(randomChar, randomChar + 1);
				String sub1 = randomWord.substring(0, randomChar);
				String sub2 = randomWord.substring(randomChar + 1, randomWord.length());
				String theString = sub1 + sub2 + thing;
				randomWord = theString;
			}
			String correct = JOptionPane.showInputDialog(randomWord);
			if (correct.equals(preserve)) {
				JOptionPane.showMessageDialog(null, "CORRECT!");
			}
		}
	}
}
