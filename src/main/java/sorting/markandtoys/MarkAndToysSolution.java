package sorting.markandtoys;

import java.util.Arrays;

public class MarkAndToysSolution {

	static int maximumToys(int[] prices, int k) {
		int qtdToys = 0, toPay = 0;

		Arrays.sort(prices);

		for (int price : prices) {
			if (toPay + price < k) {
				toPay += price;
				qtdToys++;
			} else {
				break;
			}
		}
		return qtdToys;
	}

	public static void main(String[] args) {

		int[] prices = { 1, 12, 5, 111, 200, 1000, 10 };

		System.out.println(maximumToys(prices, 50));

	}

}
