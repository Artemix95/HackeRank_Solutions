import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MakingAnagrams {

    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {
        //creo due mappe che hanno come chiavi tutte le lettere (26) e come valore
        //il numero di volte che vengono trovate nelle stringhe date.
        //per calcolare il minimo di cancellazioni non faccio altro che fare
        //la differenza fra questi valori
        Map<Character, Integer> aFrequency = new HashMap<>();
        Map<Character, Integer> bFrequency = new HashMap<>();
        int canc = 0;

        //riempio le chiavi delle mappe con le lettere e inizializzo i valori a 0
        for (int i = 'a'; i <= 'z'; i++) {
            aFrequency.put((char) i, 0);
            bFrequency.put((char) i, 0);
        }

        //scorro tutte le lettere delle stringhe
        //per ogni lettera trovata aggiungo 1 al valore corrispondente a quella lettera
        for (char c : a.toCharArray()) {
            aFrequency.put(c, aFrequency.get(c) + 1);
        }
        for (char c : b.toCharArray()) {
            bFrequency.put(c, bFrequency.get(c) + 1);
        }

        //ora scorro tutte le lettere di una delle due mappe (hanno chiavi uguali)
        //per ogni chiave confronto i valori e li sottraggo (valore assoluto)
        //e sommo tutti i risultati di questa sottrazione
        for (char letter : aFrequency.keySet()) {
            int a1 = aFrequency.get(letter);
            int b1 = bFrequency.get(letter);

            canc += Math.abs(a1 - b1);
        }
        //così facendo gli unici valori che non vengono aggiunti sono quelli in cui
        //la sottrazione da 0, e quindi le lettere che le due stringhe hanno in comune


        return canc;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String a = scanner.nextLine();

        String b = scanner.nextLine();

        int res = makeAnagram(a, b);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
