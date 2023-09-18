package session5.challanges;

import java.util.Arrays;
import java.util.Scanner;

public class Challange10 {
    public static void main(String[] args) {
        int userInput;

        for (int index = 0; index >= 0; index++) {
            System.out.println(" [1]Print 'Hello world'.");
            System.out.println(" [2]Print the user`s name.");
            System.out.println(" [3]Exit.");
            Scanner in = new Scanner(System.in);
            userInput = in.nextInt();
            if (userInput == 1) {
                System.out.println("Hello world");
            } else if (userInput == 2) {
                System.out.println("Catalin Nemes");
            } else if (userInput == 3) {
                break;
            }
        }
    }
}

