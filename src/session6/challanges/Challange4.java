package session6.challanges;

import java.util.Scanner;

public class Challange4 {
    public static void main(String[] args) {
        String userString;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your string : ");
        userString = in.nextLine();

        StringBuilder noVowString = new StringBuilder();
        for (int index = 0; index < userString.length(); index++) {
            char character = userString.charAt(index);
            if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' || character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U') {
                continue;
            }
        noVowString.append(character);
        }
        System.out.println(noVowString);

    }
}
