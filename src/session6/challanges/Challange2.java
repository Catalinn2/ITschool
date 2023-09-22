package session6.challanges;

import java.util.Scanner;

public class Challange2 {
    public static void main(String[] args) {
        String userString;
        Scanner in = new Scanner(System.in);
        System.out.println("Inser your String to check if palindrome: ");
        userString = in.nextLine();
        StringBuilder stringRevers = new StringBuilder();
        for (int index = userString.length() - 1; index >= 0; index--) {
            stringRevers.append(userString.charAt(index));
        }

        if (userString.equals(String.valueOf(stringRevers))) {
            System.out.println("Palindrome!");
        } else {
            System.out.println("Not a palindrome!");
        }

    }
}
