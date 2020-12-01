package sorting.minuminswaps2;

import java.util.Arrays;

public class MinimumSwaps2Solution {

    public int minimumSwaps(int[] array) {
        int size = array.length;
        int qtdSwap = 0;
        int temp = 0;

        for (int i = 0; i < size; i++) {
            // If true, it requires a swap
            if ((i + 1) != array[i]) {
                qtdSwap++;
                for (int j = i; j < size; j++) {
                    if (array[j] == (i + 1)) {
                        temp = array[j];
                        array[j] = array[i];
                        array[i] = temp;
                        break;
                    }
                }
            }
        }
        return qtdSwap;
    }
}
