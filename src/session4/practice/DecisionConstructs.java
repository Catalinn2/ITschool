package session4.practice;

import java.util.Scanner;

public class DecisionConstructs {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = in.nextInt();

        if (number > 0) {
            System.out.println("The number is positive");
        } else if (number > 0) {
            System.out.println("The number is negative");

        } else {
            System.out.println("The number is zero");
        }

        char character = 'c';
        if (Character.isUpperCase(character)) {
            System.out.println("It is an uppercase letter");
        } else if (Character.isLowerCase(character)){
            System.out.println("It is an lowercase letter");
        }
        else if (Character.isDigit(character)){
            System.out.println("It is a digit");
        }
        else {
            System.out.println("It is a special character");

        }
    }
}
