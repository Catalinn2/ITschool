package session5.challanges;

import java.util.Scanner;

public class Challange5 {
    public static void main(String[] args) {
        int nreps;
        Scanner in = new Scanner(System.in);
        System.out.print("Insert how many numbers yours Fibonacci series have: ");
        nreps = in.nextInt();
        int nr1, nr2;
        nr1 = 0;
        nr2 = 1;
        for (int index = 0; index <= nreps; index++) {
            System.out.print(nr2 + "  ");
            nr2 += nr1;
            nr1 = nr2 - nr1;

        }
    }
}
