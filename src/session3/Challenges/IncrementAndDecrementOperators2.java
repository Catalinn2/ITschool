package session3.Challenges;

import java.util.Scanner;

public class IncrementAndDecrementOperators2 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.print("Enter your integer - ");
        int num1 = in.nextInt();
        System.out.println("Incremented number is " + ++num1);
        System.out.println("Decremented number is " + --num1);
    }
}
