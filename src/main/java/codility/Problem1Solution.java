package codility;

import java.util.HashMap;
import java.util.Map;

public class Problem1Solution {

	static int solution(int N, String S) {
		
		long start = System.nanoTime();
		
		String[] occupiedSeats = S.split(" ");
		Map<String, String> occupiedSeatsMap = new HashMap<>();
		String row = "", seatLetter = "", seatsOccupied = "";
		int qtdFamilies = 0;

		if (!S.equals("")) {

			// getting the occupied seats
			for (String seat : occupiedSeats) {
				row = String.valueOf(seat.toCharArray()[0]);
				seatLetter = String.valueOf(seat.toCharArray()[1]);

				// check if the row exist in the map
				if (occupiedSeatsMap.get(row) == null) {
					occupiedSeatsMap.put(row, seatLetter);
				} else {
					occupiedSeatsMap.put(row, occupiedSeatsMap.get(row) + seatLetter);
				}
			}

			// checking how many 3 person family
			for (Map.Entry<String, String> entry : occupiedSeatsMap.entrySet()) {
				seatsOccupied = entry.getValue();

				// check first block (Seats A, B, C)
				if (!seatsOccupied.contains("A") && !seatsOccupied.contains("B") && !seatsOccupied.contains("C")) {
					qtdFamilies++;
				}
				// check second block (Seats D, E, F, G)
				if ((!seatsOccupied.contains("D") && !seatsOccupied.contains("E") && !seatsOccupied.contains("F"))
						|| (!seatsOccupied.contains("E") && !seatsOccupied.contains("F")
								&& !seatsOccupied.contains("G"))) {
					qtdFamilies++;
				}

				// check third block (Seats H, J, K)
				if (!seatsOccupied.contains("H") && !seatsOccupied.contains("J") && !seatsOccupied.contains("K")) {
					qtdFamilies++;
				}
			}

		} else {
			qtdFamilies = N * 3;
		}
		
		long time = System.nanoTime() - start;

		System.out.println(occupiedSeatsMap.toString());
		
		System.out.println("The program took " + time);
		
		

		return qtdFamilies;

	}

	public static void main(String[] args) {

		System.out.println(solution(50000000, "1A 1B 1C 1D 1E 1F 1G 1H 1J 1G 2A 5B 4C"));

	}

}
