package session7.challanges;

import java.time.LocalDate;
import java.util.Scanner;

public class Challange4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first date: ");
        LocalDate date1 =  LocalDate.parse(in.nextLine());
        System.out.println("Enter second date: ");
        LocalDate date2 =  LocalDate.parse(in.nextLine());
        System.out.println(areDatesEqual(date1, date2));
    }

    static boolean areDatesEqual(LocalDate date1, LocalDate date2){
        return date2.isEqual(date1);
    }
}
