package arrayds;

public class Solution {

	// Complete the hourglassSum function below.
	public static int hourglassSum(int[][] arr) {

		// hourglassCurrentSum
		int currentSum = 0;
		int maxHourglassSum = Integer.MIN_VALUE;

		//
		for (int col = 0; col < 4; col++) {
			for (int line = 0; line < 4; line++) {
				currentSum = arr[line][col] + arr[line][col + 1] + arr[line][col + 2] 
						+ arr[line + 1][col + 1] + arr[line + 2][col] 
						+ arr[line + 2][col + 1] + arr[line + 2][col + 2];

				System.out.println("currentSum: " + currentSum);

				if (currentSum > maxHourglassSum) {
					maxHourglassSum = currentSum;
				}
			}
		}

		return maxHourglassSum;

	}

	public static void main(String[] args) {

		int[][] arr = { { 1, 1, 1, 0, 0, 0 }, { 0, 1, 0, 0, 0, 0 }, 
				{ 1, 1, 1, 0, 0, 0 }, { 0, 9, 2, -4, -4, 0 },
				{ 0, 0, 0, -2, 0, 0 }, { 0, 0, -1, -2, -4, 0 } };

		int result = hourglassSum(arr);
		
		System.out.println("The maximum hourglass is: " + result);

	}
}
