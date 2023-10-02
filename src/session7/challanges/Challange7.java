package session7.challanges;

import java.time.LocalDate;
import java.time.LocalTime;

public class Challange7 {
    public static void main(String[] args) {
        int weeks = 3;
        System.out.println("To current date " + LocalDate.now() + " we added " + weeks + " weeks and the result is " + addWeeksToDate(weeks));
    }
    public static LocalDate addWeeksToDate(int weeks){
        return LocalDate.now().plusWeeks(weeks);
    }
}
