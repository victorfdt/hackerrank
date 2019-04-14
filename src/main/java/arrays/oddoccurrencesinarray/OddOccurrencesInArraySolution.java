package arrays.oddoccurrencesinarray;

import java.util.HashMap;
import java.util.Map;

public class OddOccurrencesInArraySolution {

	/**
	 * @param A
	 * @return
	 */
	static int solution(int[] A) {
		int unpairNumber = 0;
		Map<Integer, Integer> mapNumberQtd = new HashMap<>();
		
		// counting the numbers
		for(int number : A) {
			if(!mapNumberQtd.containsKey(number)) {
				mapNumberQtd.put(number, 1);
			} else {
				mapNumberQtd.put(number, mapNumberQtd.get(number) + 1);
			}
		}
		
		for(Map.Entry<Integer, Integer> entry : mapNumberQtd.entrySet()) {
			if(entry.getValue() % 2 != 0) {
				unpairNumber = entry.getKey();
			}
		}
		
		
		return unpairNumber;
	}

	public static void main(String args[]) {
		int[] array = {3,2,3,9,9};

		System.out.println(solution(array));

	}
}
