package greedyalgorithms.smallestpositiveint;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * This is a demo task.

Write a function:

class Solution { public int solution(int[] A); }

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

Given A = [1, 2, 3], the function should return 4.

Given A = [−1, −3], the function should return 1.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000].
 */
public class SmallestPositiveIntSolution {

	static int solution(int[] A) {
		int smallestInt = 1;
		List<Integer> list = new ArrayList<Integer>();

		// add only positive values
		for (int num : A) {
			if (num > 0) {
				list.add(num);
			}
		}
		if (!list.isEmpty()) {
			// sort the list
			Collections.sort(list);

			// new array with integers
			int[] newArray = new int[list.size()];

			for (int i = 0; i < newArray.length; i++) {
				newArray[i] = list.get(i);
			}

			// looking for the missing integer
			for (int i = 0; i < newArray.length - 1; i++) {
				if (newArray[i + 1] - newArray[i] > 1) {
					smallestInt = newArray[i] + 1;
				}
			}

			if (smallestInt == 1 && newArray[0] == 1) {
				smallestInt = newArray[newArray.length - 1] + 1;
			}

		}

		return smallestInt;
	}

	public static void main(String[] args) {
		int[] array = { 1, 3 };
		System.out.println(solution(array));
	}

}
