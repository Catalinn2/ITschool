package session7.challanges;

import java.time.LocalDate;

public class Challange1 {
    public static void main(String[] args) {
        System.out.println("Todays date is : " + todayDate());

    }

    private static LocalDate todayDate() {
        return LocalDate.now();
    }
}
