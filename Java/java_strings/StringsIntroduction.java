package java_strings;

import java.io.*;
import java.util.*;

public class StringsIntroduction {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        int length;
        int sumA = 0;
        int sumB = 0;

        length = a.length() + b.length();

        System.out.println(length);

        for (int i = 0; i < a.length(); i++) {

            if (a.charAt(i) > b.charAt(i)) {
                System.out.println("Yes");
                break;
            } else {
                System.out.println("No");
                break;
            }

        }

        String[] arrayA = a.split("");
        String[] arrayB = b.split("");

        arrayA[0] = arrayA[0].toUpperCase();
        arrayB[0] = arrayB[0].toUpperCase();

        for (int i = 0; i < arrayA.length; i++) {
            System.out.print(arrayA[i]);
        }
        System.out.print(" ");
        for (int i = 0; i < arrayB.length; i++) {
            System.out.print(arrayB[i]);
        }


    }
}




