package arrays.countnumbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestCountNumbers {

    private CountNumbersSolution solution = new CountNumbersSolution();
    private static int[] sortedArray;
    private static int lessThan;

    @BeforeAll
    static void init(){
        sortedArray = new int[] { 1, 3, 5, 7 };
        lessThan = 4;
    }

    @Test
    void validate(){
        int qtdDifferentNumbers = solution.countNumbers(sortedArray, lessThan);
        Assertions.assertEquals(2, qtdDifferentNumbers);
    }


    @Test
    void validateBinarySearch(){
        int qtdDifferentNumbers = solution.countNumbersBinarySearch(sortedArray, lessThan);
        Assertions.assertEquals(2, qtdDifferentNumbers);
    }

}
