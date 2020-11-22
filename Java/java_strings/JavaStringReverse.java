// https://www.hackerrank.com/challenges/java-string-reverse

package java_strings;

import java.io.*;
import java.util.*;

public class JavaStringReverse {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        boolean flag=true;
        for (int i=0, j=A.length()-1; i<=A.length()/2 && j>=A.length()/2; i++, j-- ){
            if (A.charAt(i)!=A.charAt(j)) {
                flag=false;
            }
        }
        if (flag==true) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
