package session3.Challenges;

import java.util.Scanner;

public class BinaryArithmeticOperators1 {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.print("Choose first number - ");
        int num1 = in.nextInt();
        System.out.print("Choose second number - ");
        int num2 = in.nextInt();
        System.out.println( num1 + "+" + num2 + "= " + (num1+num2));
        System.out.println( num1 + "-" + num2 + "= " + (num1-num2));
        System.out.println( num1 + "x" + num2 + "= " + (num1*num2));
        System.out.println( num1 + "/" + num2 + "= " + (num1/num2));
        System.out.println( num1 + "%" + num2 + "= " + (num1%num2));


    }

}
