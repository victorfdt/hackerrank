package hashmaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RansomNoteSolution {

	// Complete the checkMagazine function below.
	static void checkMagazine(String[] magazine, String[] note) {
		boolean foundAllWords = true;

		Map<String, Integer> mapNote = new HashMap<>();
		Map<String, Integer> mapMagazine = new HashMap<>();

		// quantity of words in the magazine
		for (String word : magazine) {
			if (!mapMagazine.containsKey(word)) {
				mapMagazine.put(word, 1);
			} else {
				mapMagazine.put(word, mapMagazine.get(word) + 1);
			}
		}

		// quantity of words in the note
		for (String word : note) {
			if (!mapNote.containsKey(word)) {
				mapNote.put(word, 1);
			} else {
				mapNote.put(word, mapNote.get(word) + 1);
			}
		}

		// comparing if the magazine has all words
		for (String noteWord : mapNote.keySet()) {

			if (mapMagazine.get(noteWord) != null) {
				if (mapMagazine.get(noteWord) < mapNote.get(noteWord)) {
					foundAllWords = false;
					break;
				}

			} else {
				foundAllWords = false;
				break;
			}
		}

		System.out.println(foundAllWords ? "Yes" : "No");
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		/*
		 * String[] mn = scanner.nextLine().split(" ");
		 * 
		 * int m = Integer.parseInt(mn[0]);
		 * 
		 * int n = Integer.parseInt(mn[1]);
		 * 
		 * String[] magazine = new String[m];
		 * 
		 * String[] magazineItems = scanner.nextLine().split(" ");
		 * scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		 * 
		 * for (int i = 0; i < m; i++) { String magazineItem = magazineItems[i];
		 * magazine[i] = magazineItem; }
		 * 
		 * String[] note = new String[n];
		 * 
		 * String[] noteItems = scanner.nextLine().split(" ");
		 * scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		 * 
		 * for (int i = 0; i < n; i++) { String noteItem = noteItems[i]; note[i] =
		 * noteItem; }
		 */

		String[] magazineV = { "give", "me", "one", "grand", "night", "today" };
		String[] noteV = { "give", "me", "one", "grand", "night" };

		checkMagazine(magazineV, noteV);

		scanner.close();
	}
}
