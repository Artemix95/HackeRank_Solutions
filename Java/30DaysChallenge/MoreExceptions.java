// https://www.hackerrank.com/challenges/30-more-exceptions

import java.util.*;
import java.io.*;


class MoreExceptions{

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {

            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }

     static class Calculator {
        public int power(int n, int p) throws Exception { //sto creando una nuova eccezione che potrebbe verificarsi
          if (n>=0 && p>=0) {
              return (int)Math.pow(n, p);
          } else {
              throw new Exception("n and p should be non-negative");
          }
        }
    }
}
