package session5.challanges;

import java.util.Scanner;

public class Challange7 {
    public static void main(String[] args) {
        int jokerNumber = 78;
        int userGuess;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your guess!");

        do {
            userGuess = in.nextInt();
            if (jokerNumber > userGuess) {
                System.out.println("Your number is lower!! Try again!");

            } else if (jokerNumber < userGuess) {
                System.out.println("Your number is higher!! Try again!");

            } else {
                System.out.println("You are RIGHT! The number is " + jokerNumber);

            }
        } while (jokerNumber != userGuess);
    }
}