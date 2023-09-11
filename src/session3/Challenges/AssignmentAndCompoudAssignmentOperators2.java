package session3.Challenges;

import java.util.Scanner;

public class AssignmentAndCompoudAssignmentOperators2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Full Price - ");
        double pretIntreg = in.nextDouble();
        System.out.print("Discount percentege - ");
        double discount = in.nextDouble();
        double reducere = (pretIntreg*discount)/100;
        System.out.println("Discount =" + reducere);
        double finalPrice = pretIntreg - reducere;
        System.out.print("Final price = " + finalPrice);


    }
}
