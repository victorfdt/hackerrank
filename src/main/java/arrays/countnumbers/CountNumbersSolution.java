package arrays.countnumbers;

import java.util.ArrayList;
import java.util.Arrays;

/*
    Implement function countNumbers that accepts a sorted array of unique integers and,
    efficiently with respect to time used, counts the number of array elements that are
    less than the parameter lessThan.

    For example, SortedSearch.countNumbers(new int[] { 1, 3, 5, 7 }, 4) should return
    2 because there are two array elements less than 4.
 */
public class CountNumbersSolution {

    public int countNumbers(int[] sortedArray, int lessThan) {
        var listNumbers = new ArrayList<Integer>();
        var currentNumber = 0;

        for (int i = 0; i < sortedArray.length; i++) {
            currentNumber = sortedArray[i];
            if (currentNumber >= lessThan) {
                break;
            } else if (!listNumbers.contains(currentNumber)) {
                listNumbers.add(currentNumber);
            }
        }

        return listNumbers.size();
    }

    public int countNumbersBinarySearch(int[] sortedArray, int lessThan) {
        int previous = 0, index = 0, qtdNumbers = 0;

        for (int number : sortedArray) {
            if (number >= lessThan) {
                break;
            } else {
                index = Arrays.binarySearch(sortedArray, number);
                if (sortedArray[index] != previous) {
                    qtdNumbers++;
                    previous = sortedArray[index];
                }
            }
        }
        return qtdNumbers;
    }

}
