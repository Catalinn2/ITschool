package session5.challanges;

import java.util.Scanner;

public class Challange11 {
    public static void main(String[] args) {

        double sum = 0;
        double numbers;
        double counter = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Insert numbers for calculating their average or 0 for STOP");
        for (int index = 0; index >= 0; index++) {
            numbers = in.nextDouble();
            if(numbers != 0){
                counter++;
                sum += numbers;
                continue;
            }
            System.out.println("The average is " + sum / counter);
            break;
        }

    }
}