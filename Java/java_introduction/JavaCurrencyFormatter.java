package java_introduction;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaCurrencyFormatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat objus = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat objin = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        NumberFormat objch = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat objfr = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        String us = objus.format(payment);
        String india = objin.format(payment);
        String china = objch.format(payment);
        String france = objfr.format(payment);


        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}