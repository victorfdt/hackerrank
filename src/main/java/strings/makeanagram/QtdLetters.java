package strings.makeanagram;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class QtdLetters {

	private static Scanner scanner = new Scanner(System.in);

	private static void showQtdLetters(String text) {

		int qtd = 0;
		char[] array = text.toCharArray();
		Map<String, Integer> letterMap = new HashMap<String, Integer>();

		for (char c : array) {
			for (char cc : array) {
				if (c == cc)
					qtd++;
			}
			letterMap.put(c + "", qtd);
			qtd = 0;

		}
		
		for(Map.Entry<String, Integer> entry : letterMap.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}

	public static void main(String[] args) {

		showQtdLetters("jxwtrhvujlmrpdoqbisbwhmgpmeoke");

	}

}
