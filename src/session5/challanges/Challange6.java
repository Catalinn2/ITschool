package session5.challanges;

import java.util.Scanner;

public class Challange6 {
    public static void main(String[] args) {
        int sum = 0;
        int numbers = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Insert number for ADDITION or -1 for STOP");
        while (numbers != -1) {

            numbers = in.nextInt();
            sum += numbers;
        }
        System.out.println(sum);
    }
}
