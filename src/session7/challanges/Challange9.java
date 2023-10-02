package session7.challanges;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Challange9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first date : ");
        LocalDate  date1 = LocalDate.parse(in.nextLine());
        System.out.println("Enter second date : ");
        LocalDate date2 = LocalDate.parse(in.nextLine());
        in.close();
        System.out.println("Difference between " + date1 + " and " + date2 + "in days is " + betweenDates(date1,date2));

    }
    private static int betweenDates (LocalDate date1, LocalDate date2){
        return (int) ChronoUnit.DAYS.between(date1, date2);
    }
}
