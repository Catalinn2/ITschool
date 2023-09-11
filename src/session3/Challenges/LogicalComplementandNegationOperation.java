package session3.Challenges;

import javax.xml.transform.Source;
import java.util.Scanner;

public class LogicalComplementandNegationOperation {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter your number (0 is nor positive or negative) - ");
        int num1 = in.nextInt();
        if (num1 > 0) {
            System.out.println("Number is positive.");

        }
        if (num1 < 0) {

            System.out.println("Number is negative.");
        }



    }
}
