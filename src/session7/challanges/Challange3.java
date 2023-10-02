package session7.challanges;

import java.time.LocalDate;
import java.time.Month;

public class Challange3 {
    public static void main(String[] args) {
        System.out.println(createSpecificDate());
    }

    static LocalDate createSpecificDate(){
        return LocalDate.of(2025, Month.AUGUST, 19);
    }
}
