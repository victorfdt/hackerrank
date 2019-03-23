package sorting.bubblesorting;

import java.util.Scanner;

public class BubbleSortingSolution {

	// Complete the countSwaps function below.
	static void countSwaps(int[] a) {
		int qtdSwap = 0, aux = 0;

		// bubble sort technique
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j + 1]) {
					aux = a[j];
					a[j] = a[j + 1];
					a[j + 1] = aux;

					qtdSwap++;
				}
			}

		}

		System.out.println("Array is sorted in " + qtdSwap + " swaps.");
		System.out.println("First Element: " + a[0]);
		System.out.println("Last Element: " + a[a.length - 1]);

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		// get the n (size of the array)
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		// get the sequence of numbers
		int[] a = new int[n];

		String[] aItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		// converting the array of strings to array of ints
		for (int i = 0; i < n; i++) {
			int aItem = Integer.parseInt(aItems[i]);
			a[i] = aItem;
		}

		countSwaps(a);

		scanner.close();
	}
}
