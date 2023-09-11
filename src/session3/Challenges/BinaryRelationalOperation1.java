package session3.Challenges;

import java.util.Scanner;

public class BinaryRelationalOperation1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number - ");
        int stNumber = in.nextInt();
        System.out.print("Enter the second number - ");
        int ndumber = in.nextInt();
        if (stNumber > ndumber) {
            System.out.println("First number is higher than second.");
        }
        if (stNumber < ndumber) {
            System.out.println("First number is lesser than second.");
        }
        if (stNumber == ndumber) {
            System.out.println("First number is equal with second.");
        }
    }
}
