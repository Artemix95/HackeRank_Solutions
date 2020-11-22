// https://www.hackerrank.com/challenges/30-data-types

import java.util.Scanner;

public class DataTypes {
    

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int num1;
        double num2;
        String stringa;

        /* Read and save an integer, double, and String to your variables.*/
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextDouble();
        sc.nextLine();
        stringa = sc.nextLine();

        /* Print the sum of both integer variables on a new line. */
        int sum = num1 + (int) num2;
        System.out.println(sum);

        /* Print the sum of the double variables on a new line. */
        System.out.println(num2 + num2);

        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
        System.out.println(s + stringa);
        scan.close();
    }
}
