package session5.challanges;

import java.util.Scanner;

public class Challange12 {
    public static void main(String[] args) {
        int numbers;
        int sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Insert your 10 numbers. This will add only numbers greater than 5.");
        for (int index = 0; index < 10; index++) {
            System.out.print("#" + (index + 1) + " number = ");
            numbers = in.nextInt();
            if (numbers < 6) {
                continue;
            } else if (numbers > 5) {
                sum += numbers;
            }
        }
        System.out.println("Sum = " + sum);
    }
}
