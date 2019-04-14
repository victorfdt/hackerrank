package greedyalgorithms.minabsdif;

public class MinimumAbsoluteDifSolution {

	// Complete the minimumAbsoluteDifference function below.
	static int minimumAbsoluteDifference(int[] arr) {
		int minDiff = Integer.MAX_VALUE, calc = 0;

		for (int i : arr) {
			for (int j : arr) {
				if(i == j) break;
				
				calc = Math.abs(i - j);
				if (calc < minDiff) {
					minDiff = calc;
				}
			}
		}

		return minDiff;

	}

	public static void main(String[] args) {

		int[] array = { -59, -36, -13, 1, -53, -92, -2, -96, -54, 75 };

		System.out.println(minimumAbsoluteDifference(array));
	}

}
