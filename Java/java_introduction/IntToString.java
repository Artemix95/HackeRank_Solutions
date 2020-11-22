// https://www.hackerrank.com/challenges/java-int-to-string

package java_introduction;

import java.util.Scanner;

public class IntToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int i = sc.nextInt();
        String s = Integer.toString(i);
        System.out.println(s.getClass());
    }
}
