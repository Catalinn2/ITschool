package session6.challanges;

import java.util.Scanner;

public class Challange1 {
    public static void main(String[] args) {
        String userString;
        Scanner in = new Scanner(System.in);
        System.out.println("Inser your String to be reversed: ");
        userString = in.nextLine();
        StringBuilder stringRevers = new StringBuilder();
        for (int index = userString.length()-1; index >= 0; index--) {
            stringRevers.append(userString.charAt(index));
        }
        System.out.println("Reversed String is -> " + stringRevers);
    }
}
