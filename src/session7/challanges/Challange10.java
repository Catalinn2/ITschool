package session7.challanges;

import java.time.DateTimeException;
import java.time.LocalDate;

public class Challange10 {
    public static void main(String[] args) {
        String date1 = "2024-02-30";
        System.out.println(isValid(date1));
    }
    private static boolean isValid(String date1){
            try {
                LocalDate.parse(date1);
            } catch (DateTimeException exception) {
                return false;
            }
            return true;
    }
}
