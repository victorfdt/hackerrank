package arrays.twod;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TwoDArraySolution {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {

        int maxV = Integer.MIN_VALUE;
        int currentSum;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                currentSum = (arr[i][j] + arr[i][j + 1] + arr[i][j + 2]) +
                        (arr[i + 1][j + 1]) +
                        (arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2]);

                System.out.println(currentSum);

                if (currentSum > maxV) {
                    maxV = currentSum;
                }

            }

        }

        return maxV;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int[][] arr = {
                {-9, -9, -9, 1, 1, 1},
                {0, -9, 0, 4, 3, 2},
                {-9, -9, -9, 1, 2, 3},
                {0, 0, 8, 6, 6, 0},
                {0, 0, 0, -2, 0, 0},
                {0, 0, 1, 2, 4, 0},
        };

        int result = hourglassSum(arr);

        System.out.println("result:" + result);
    }
}
