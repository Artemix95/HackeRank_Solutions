// https://www.hackerrank.com/challenges/30-binary-numbers

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BinaryNumbers {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();

        String binary = Integer.toBinaryString(n);
        int count = 0;
        int max = 0;
        for (int i = 0; i < binary.length(); i++) {

            if ((binary.charAt(i) == '1')) {
                count++;
                if (count > max) {
                    max = count;
                }
            }
            if (binary.charAt(i) == '0') {
                count = 0;
            }
        }
        System.out.println(max);
    }
}
