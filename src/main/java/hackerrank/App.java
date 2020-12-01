package hackerrank;

import sorting.minuminswaps2.MinimumSwaps2Solution;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        int[] array = {7, 1, 3, 2, 4, 5, 6};

        MinimumSwaps2Solution solution = new MinimumSwaps2Solution();
        int qtdSwaps = solution.minimumSwaps(array);

        System.out.println(qtdSwaps);
    }
}
