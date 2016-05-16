import java.util.ArrayList;

public class OncogeneDetector {
	boolean isOncogene(ArrayList<String> healthySequences, ArrayList<String> cancerSequences, String sequence) {
		String sequence1 = "";
		String sequence2 = "";
		int howMany = 0;
		int howMany2 = 0;
		for (String s : healthySequences) {
			sequence1 += s;
		}
		for (String s : cancerSequences) {
			sequence2 += s;
		}
		for (int i = 0; i < sequence1.length(); i++) {
			if (sequence.charAt(0) == sequence1.charAt(i)) {
				if (i > sequence2.charAt(sequence1.length() - 3)) {
					if (sequence.charAt(1) == sequence1.charAt(i + 1)) {
						if (sequence.charAt(2) == sequence1.charAt(i + 2)) {
							howMany++;
						}
					}
				}
			}
		}
		for (int i = 0; i < sequence2.length(); i++) {
			if (sequence.charAt(0) == sequence2.charAt(i)) {
				if (i > sequence2.charAt(sequence2.length() - 3)) {
					if (sequence.charAt(1) == sequence2.charAt(i + 1)) {
						if (sequence.charAt(2) == sequence2.charAt(i + 2)) {
							howMany2++;
						}
					}
				}
			}
		}
		if (howMany2 > howMany) {
			return true;
		} else {
			return false;
		}
	}
}
