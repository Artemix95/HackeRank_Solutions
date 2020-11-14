import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Arrays2D {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        scanner.close();

        int sum = Integer.MIN_VALUE;
        int maxSum = Integer.MIN_VALUE;
        for (int x = 0; x < arr.length - 2; x++) {
            for (int y = 0; y < arr.length - 2; y++) {
                sum = sumSingleHourglass(arr, x, x + 2, y, y + 2);
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        System.out.println(maxSum);
    }

    public static int sumSingleHourglass(int[][] matrix, int xStart, int xFinish, int yStart, int yFinish) {
        int sum = 0;
        int sumD1 = 0;
        int sumD2 = 0;

        for (int row = xStart, col = yStart; row <= xFinish && col <= yFinish; row++, col++) {
            sumD1 += matrix[row][col];
            //   System.out.println("Diagonale 1: " + sumD1);
        }
        sum = sumD1 - matrix[xStart][yStart] - matrix[xFinish][yFinish];
        //   System.out.println("Valore centrale: " + sum);

        //  System.out.println("Somma diagonali tolti i vertici " + sum);
        for (int col = yStart; col <= yFinish; col++) {
            sum += matrix[xStart][col];
            sum += matrix[xFinish][col];

        }

        return sum;
    }
}
