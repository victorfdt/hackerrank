package strings.alternatingcharacters;

public class AlternatingCharactersSolution {

	static int alternatingCharacters(String s) {
		int qtdDeletion = 0;
		char currentChar = 'a', nextChar = 'a';
		char[] array = s.toCharArray();

		for (int i = 0; i < array.length - 1; i++) {
			currentChar = array[i];
			nextChar = array[i + 1];
			
			if(currentChar == nextChar) {
				qtdDeletion++;
			}
		}

		return qtdDeletion;

	}

	public static void main(String[] args) {
		System.out.println("Quantity of deletions: " + alternatingCharacters("AABAAB"));

	}

}
