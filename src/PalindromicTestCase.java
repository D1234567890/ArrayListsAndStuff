import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Stack;

import org.junit.Test;

public class PalindromicTestCase {

	@Test
	public void test() {
		ArrayList<String> wordList = new ArrayList<String>();
		try {
			URL list = new URL("https://raw.githubusercontent.com/eneko/data-repository/master/data/words.txt");
			try {
				BufferedReader br = new BufferedReader(new InputStreamReader(list.openStream()));
				String inputLine;
				while ((inputLine = br.readLine()) != null) {
					wordList.add(inputLine);
				}
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < wordList.size(); i++) {
			palindromeDetector(wordList.get(i));
		}
	}

	public void palindromeDetector(String find) {
		String saveThis = find;
		if (find.contains(" ")) {
			if (find.charAt(find.length() - 1) == ' ') {
				String sub = find.substring(0, find.length() - 1);
				find = sub;
			}
			int saveValue = 0;
			for (int i = 0; i < find.length(); i++) {
				if (find.charAt(i) == ' ') {
					saveValue = i;
				}
			}
			String sub1 = find.substring(0, saveValue);
			String sub2 = find.substring(saveValue + 1, find.length());
			find = sub1 + sub2;
		}
		if (find.contains("!")) {
			if (find.charAt(find.length() - 1) == '!') {
				String sub = find.substring(0, find.length() - 1);
				find = sub;
			}
			int saveValue = 0;
			for (int i = 0; i < find.length(); i++) {
				if (find.charAt(i) == '!') {
					saveValue = i;
				}
			}
			String sub1 = find.substring(0, saveValue);
			String sub2 = find.substring(saveValue + 1, find.length());
			find = sub1 + sub2;
		}

		if (find.contains(".")) {
			if (find.charAt(find.length() - 1) == '.') {
				String sub = find.substring(0, find.length() - 1);
				find = sub;
			}
			int saveValue = 0;
			for (int i = 0; i < find.length(); i++) {
				if (find.charAt(i) == '.') {
					saveValue = i;
				}
			}
			String sub1 = find.substring(0, saveValue);
			String sub2 = find.substring(saveValue + 1, find.length());
			find = sub1 + sub2;
		}

		if (find.contains("?")) {
			if (find.charAt(find.length() - 1) == '?') {
				String sub = find.substring(0, find.length() - 1);
				find = sub;
			}
			int saveValue = 0;
			for (int i = 0; i < find.length(); i++) {
				if (find.charAt(i) == '?') {
					saveValue = i;
				}
			}
			String sub1 = find.substring(0, saveValue);
			String sub2 = find.substring(saveValue + 1, find.length());
			find = sub1 + sub2;
		}

		Stack<Character> addTo = new Stack<Character>();
		String detector = "";
		for (int i = 0; i < find.length(); i++) {
			addTo.push(find.charAt(i));
		}
		for (int i = find.length(); i > 0; i--) {
			detector += addTo.pop();
		}
		if (detector.equalsIgnoreCase(find)) {
			System.out.println(saveThis);
		}
	}
}
