package session7.challanges;

import java.time.LocalDate;

public class Challange8 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2023, 10, 2);
        dayOfWeek(date);
    }

    private static void dayOfWeek(LocalDate date) {
        System.out.println(date.getDayOfWeek());
    }
}
