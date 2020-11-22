// https://www.hackerrank.com/challenges/30-exceptions-string-to-integer

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ExceptionStringInteger {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        try {
            int num = Integer.parseInt(S);
            System.out.println(num);
        } catch (Exception e) {
            System.out.println("Bad String"); //testo da stampare nel caso si verifichi l'eccezione

        }
    }
}
