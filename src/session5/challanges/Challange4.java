package session5.challanges;

import java.util.Scanner;

public class Challange4 {
    public static void main(String[] args) {
        String userString;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your string:");
        userString = in.nextLine();
        char[] stringToArray = userString.toCharArray();
        for (int index = stringToArray.length-1; index >= 0; index--) {
            System.out.print(stringToArray[index]);
        }

    }

}
