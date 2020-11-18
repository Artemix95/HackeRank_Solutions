package java_strings;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaSubstring {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        System.out.println(substring(S, start, end));
    }

    public static String substring(String s, int start, int end) {
        String subString = s.substring(start, end);
        return subString;
    }
}
