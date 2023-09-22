package session7.practice;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        printConsoleSum(in);
        printConsoleAverage(in);
    }

    public static void printConsoleSum(Scanner in) {
        System.out.println("Enter the first number: ");
        int num1 = in.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);

    }
    public static void printConsoleAverage(Scanner in) {
        double sum = 0;
        for (int index = 0; index <5; index++){
            System.out.println("enter your number: ");
            sum += in.nextInt();
        }
        double average = sum /5;
        System.out.println("The average is: " + average);
    }
}
