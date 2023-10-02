package session7.challanges;

import java.time.LocalDate;
import java.time.Month;

public class Challange5 {
    public static void main(String[] args) {
        System.out.println(isTodaySpecificDate());
    }
    static boolean isTodaySpecificDate (){
        LocalDate date = LocalDate.of(2019, Month.DECEMBER, 10);
        System.out.println("Date to check: " + date);
        System.out.println("Date now: " + LocalDate.now());
        return date.isEqual(LocalDate.now());
    }
}
