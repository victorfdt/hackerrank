package arrays.leftrotation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeftRotationSolution {

	// Complete the rotLeft function below.
	static int[] rotLeft(int[] a, int d) {

		int[] newArray = new int[a.length];
		int newIndex = 0;

		for (int i = 0; i < a.length; i++) {

			newIndex = i - d;
			// checking if after the rotation the index will be negative
			// if so, put the element in the proper position inside the new array
			if (newIndex < 0) {
				newArray[a.length - (Math.abs(newIndex))] = a[i];
			} else {
				newArray[newIndex] = a[i];
			}
		}

		return newArray;

	}

	public static void main(String[] args) {

		int[] intArray = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(rotLeft(intArray, 2)));
	}

}
