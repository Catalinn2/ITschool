package session3.Challenges;

import java.util.Scanner;

public class BinaryRelationalOperation2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number - ");
        int num1 = in.nextInt();
        if (num1 < 0) {
            System.out.println("The number range -> -infinte to 0");
        }
        if (num1 < 666) {
            System.out.println("The number range -> 1 to 666");
        }
        if (num1 >= 666) {
            System.out.println("The number range -> 666 to infinte");
        }
    }
}
