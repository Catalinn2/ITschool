package session4.challanges;

import java.util.Scanner;

public class Challange19 {
    public static void main(String[] args) {
        int age;
        Scanner in = new Scanner(System.in);
        System.out.print("Insert subject age : ");
        age = in.nextInt();
        if (age >=1 && age < 12) {
            System.out.println("Child");
        } else if (12 <= age && age <= 17) {
            System.out.println("Teenager");
        } else if (17 < age && age <= 64) {
            System.out.println("Adult");
        } else if ( age >= 65) {
            System.out.println("Senior");
        }
        else {
            System.out.println("Invalid age inserted!");
        }
    }
}
