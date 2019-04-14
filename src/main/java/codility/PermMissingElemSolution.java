package codility;

import java.util.Arrays;

public class PermMissingElemSolution {

	static int solution(int[] A) {
			int missingInt = 1;
			
			// sort the array
			Arrays.sort(A);
			
			for(int i = 0; i < A.length - 1; i++) {
				if(A[i+1] - A[i] > 1) {
					missingInt = A[i]+1;
					break;
				}
			}
	
			return missingInt;
	}

	public static void main(String[] args) {
		int[] array = {2, 3, 4, 5};
		System.out.println(solution(array));

	}

}
