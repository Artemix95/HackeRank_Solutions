// https://www.hackerrank.com/challenges/java-static-initializer-block

package java_introduction;

import java.util.Scanner;

public class StaticInitializerBlock {
    static Scanner scan = new Scanner(System.in);
    static int B = scan.nextInt();
    static int H = scan.nextInt();
    private static boolean flag = true;

    static {
        try {
            if (B <= 0 || H <= 0) {
                flag = false;
                throw new Exception("Breadth and height must be positive");
            }
        } catch (Exception e) {
            System.out.println(e);
        }


    }

    public static void main(String[] args) {
        if (flag == true) {
            int area = B * H;
            System.out.print(area);
        }
    }


}//end of class




