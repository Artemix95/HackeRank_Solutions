package java_strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaSubstringComparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        //prendo la prima sottostringa e la imposto come primo parametro di confronto
        smallest = s.substring(0, k);
        largest = s.substring(0, k);

        for (int i = 1; i < s.length() - k + 1; i++) {
            String substr = s.substring(i, i + k); //nel metodo substring è incluso il primo indice ed escluso l'ultimo

            //compareTo restituisce valore positivo se substr è minore di smallest
            if (smallest.compareTo(substr) > 0)
                smallest = substr;

            //compareTo restituisce valore negativo se substr è maggior di largest
            if (largest.compareTo(substr) < 0)
                largest = substr;
        }

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
