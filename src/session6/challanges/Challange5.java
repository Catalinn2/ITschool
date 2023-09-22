package session6.challanges;

import java.util.Locale;
import java.util.Scanner;

public class Challange5 {
    public static void main(String[] args) {
        String userString;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your string: ");
        userString = in.nextLine();
        String[] stringArray = userString.split(" ");
        for (String element : stringArray) {
            String firstLetterToUppercase = String.valueOf(element.charAt(0)).toUpperCase();
            String restOfWords = element.substring(1);
            String word = firstLetterToUppercase + restOfWords;
            System.out.print(word + " ");
        }
    }


}
