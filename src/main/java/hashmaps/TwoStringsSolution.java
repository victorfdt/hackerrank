package hashmaps;

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TwoStringsSolution {

	// Complete the twoStrings function below.
	static String twoStrings(String s1, String s2) {
		String answer = "NO";

		// using sets because they dont have repeated content
		Set<Character> setS1 = new HashSet<>();
		Set<Character> setS2 = new HashSet<>();

		// populating setS1
		for (char c : s1.toCharArray()) {
			setS1.add(c);
		}

		// populating setS1
		for (char c : s2.toCharArray()) {
			setS2.add(c);
		}
		
		// keeping only the common elements
		setS1.retainAll(setS2);
		
		if(setS1.size() > 0) {
			answer = "YES";
		}

		return answer;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		System.out.println(twoStrings("aaaaaa", "bbbb"));
	}
}
