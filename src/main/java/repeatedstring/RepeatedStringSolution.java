package repeatedstring;

import java.io.IOException;
import java.util.Scanner;

public class RepeatedStringSolution {

	// Complete the repeatedString function below.
	static long repeatedString(String s, long n) {

		long qtdAsInS = 0;
		long qtdAsToAdd = 0;
		char[] charsOfS = s.toCharArray();

		// quantity to repeat s
		long qtdRepeat = n / s.length();

		// quantity of remaining chars to check
		long qtdToCheck = n - s.length() * qtdRepeat;

		// Counting qtd of As in S
		for (char c : charsOfS) {
			if (c == 'a')
				qtdAsInS++;
		}

		// counting qtd of As in the remaining chars
		for (int i = 0; i < qtdToCheck; i++) {
			if (charsOfS[i] == 'a')
				qtdAsToAdd++;
		}

		return (qtdRepeat * qtdAsInS) + qtdAsToAdd;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		long result = repeatedString("aba", 10);

		System.out.println(result);

		scanner.close();
	}
}
