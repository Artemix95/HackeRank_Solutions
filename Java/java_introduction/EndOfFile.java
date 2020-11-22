// https://www.hackerrank.com/challenges/java-end-of-file

package java_introduction;

import java.util.Scanner;

public class EndOfFile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (sc.hasNextLine()) {
            System.out.println(++i + " " + sc.nextLine());
        }


    }
}
