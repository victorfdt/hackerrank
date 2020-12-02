package sorting.minimumswaps2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestMinimumSwaps2Solution {

    private final MinimumSwaps2Solution solution = new MinimumSwaps2Solution();
    private static int[] array;

    @BeforeAll
    static void init() {
        array = new int[]{7, 1, 3, 2, 4, 5, 6};
    }

    @Test
    void validate() {
        int qtdSwaps = solution.minimumSwaps(array);
        Assertions.assertEquals(5, qtdSwaps);
    }

}
