// https://www.hackerrank.com/challenges/30-review-loop

import java.io.*;
import java.util.*;

public class LetsReview {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int t = n.nextInt();
        n.nextLine();
        while(t>0){
            String s = n.nextLine();

            for (int i=0; i<s.length();i++) {
                if (i % 2 == 0) {
                    System.out.print(s.charAt(i));
                }
            }
            System.out.print(" ");
            for (int j=0; j<s.length();j++) {
                if (j%2!=0) {
                    System.out.print(s.charAt(j));
                }
            }
            System.out.println();
            t--;
        }
    }
}
