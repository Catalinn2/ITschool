package session4.challanges;

import java.util.Scanner;

public class Challange20 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number - ");
        a = in.nextInt();
        System.out.print("Enter second number - ");
        b = in.nextInt();
        System.out.print("Enter third number - ");
        c = in.nextInt();
        if(a>b && a>c){
            System.out.println("The largest number is -" + a);
        } else if(b>a && b>c){
            System.out.println("The largest number is -" + b);
        } else if (c>a && c>b){
            System.out.println("The largest number is -" + c);
        }
    }
}
