package session4.challanges;

import java.util.Scanner;

public class Challange21 {
    public static void main(String[] args) {
        double grade;
        Scanner in = new Scanner(System.in);
        System.out.print("Insert subject score : ");
        grade = in.nextDouble();
        if (grade >= 1 && grade < 60) {
            System.out.println("Grade: f");
        } else if (60 <= grade && grade <= 69) {
            System.out.println("Grade D");
        } else if (70 <= grade && grade <= 79) {
            System.out.println("Grade C");
        } else if (79 < grade && grade <= 89) {
            System.out.println("Grade B");
        } else if (grade >= 90 && grade <= 100) {
            System.out.println("Grade A");
        } else {
            System.out.println("Invalid score inserted!");
        }

    }
}
