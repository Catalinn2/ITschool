package session5.challanges;

import java.util.Scanner;

public class Challange8 {
    public static void main(String[] args) {
        int nreps = 9;

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
