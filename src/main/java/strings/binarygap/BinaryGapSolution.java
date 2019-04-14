package strings.binarygap;

public class BinaryGapSolution {

	static int solution(int N) {
		int biggestGap = -1, qtd = 0;

		boolean startCounting = false;

		// get the number and turn into binary
		char[] numberChar = Integer.toBinaryString(N).toCharArray();

		// check the gaps
		for (char c : numberChar) {
			if (qtd == 0 && c == '1') {
				startCounting = true;
			}

			if (startCounting) {
				if (c == '0') {
					qtd++;
				} else {
					if (qtd > biggestGap) {
						biggestGap = qtd;
						qtd = 0;
					}
				}
			}
		}

		return biggestGap;

	}

	public static void main(String[] args) {
		int num = 15;

		System.out.println(solution(num));
	}

}
