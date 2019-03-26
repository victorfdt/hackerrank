package strings.makeanagram;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MakeAnagramSolution {

	// Complete the makeAnagram function below.
	static int makeAnagram(String a, String b) {
		int qtdDeletion = 0, qtdTemp = 0;

		// maps with <letter, qtd>
		Map<String, Integer> mapCharQtdA = qtdCharsMap(a);
		Map<String, Integer> mapCharQtdB = qtdCharsMap(b);

		// check if the letter in a exists in b and compares its quantity
		for (Map.Entry<String, Integer> entry : mapCharQtdA.entrySet()) {

			if (mapCharQtdB.get(entry.getKey()) != null) {
				qtdTemp = mapCharQtdB.get(entry.getKey());
				if (qtdTemp != entry.getValue()) {
					qtdDeletion += Math.abs(qtdTemp - entry.getValue());
				}
			} else {
				qtdDeletion += entry.getValue();
			}
		}

		// check if there are letters that only exist in b
		for (Map.Entry<String, Integer> entry : mapCharQtdB.entrySet()) {
			if (mapCharQtdA.get(entry.getKey()) == null) {
				qtdDeletion += entry.getValue();
			}
		}

		return qtdDeletion;
	}

	/**
	 * Creates a Map with the letter and its quantity in the work
	 * @param text
	 * @return Map<letter, qtdLetter>
	 */
	static Map<String, Integer> qtdCharsMap(String text) {

		int qtd = 0;
		char[] array = text.toCharArray();
		Map<String, Integer> map = new HashMap<String, Integer>();

		for (char c : array) {
			for (char cc : array) {
				if (c == cc)
					qtd++;
			}
			map.put(c + "", qtd);
			qtd = 0;
		}

		return map;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		// System.out.print("String a: ");
		// String a = scanner.nextLine();

		// System.out.print("String b: ");
		// String b = scanner.nextLine();

		int res = makeAnagram("fcrxzwscanmligyxyvym", "jxwtrhvujlmrpdoqbisbwhmgpmeoke");

		System.out.println("\nNumber of deletions: " + res);

		scanner.close();
	}
}
