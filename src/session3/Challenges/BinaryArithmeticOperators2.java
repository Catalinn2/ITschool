package session3.Challenges;

import java.util.Scanner;

public class BinaryArithmeticOperators2 {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.print("The rectangle lenght - ");
        int lenght = in.nextInt();
        System.out.print("The rectangle breadth - ");
        int breadth  = in.nextInt();
        int area = lenght*breadth;
        System.out.println("Rectangle area = "+ area+" um^2");
    }
}
