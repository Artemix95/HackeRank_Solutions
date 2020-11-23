package java_strings;

import java.util.Scanner;
class UsernameValidator {
    /*deve inziare con una lettera quindi nel range [a-zA-Z]
    //w indica una qualunque parola con caratteri alfanumerici
    {7, 29] indica il numero di occorrenze minime (7) e massime (29) di \\w, più la prima minimo 8 massimo 30
     */
    public static final String regularExpression = "([a-zA-Z])(\\w){7,29}";

}


public class ValidUsernameRegularExpression {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}