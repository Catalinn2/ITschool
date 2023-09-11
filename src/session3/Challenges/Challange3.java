package session3.Challenges;

import java.util.Scanner;

public class Challange3 {
    public static void main(String[] args) {
        int a;
        Scanner in= new Scanner(System.in);
        System.out.print("Enter the number - ");
        a = in.nextInt();
        if(a>0){
            System.out.print("Number is positive");
        }
        if(a<0){
            System.out.print("Number is negative");
        }
    }
}
