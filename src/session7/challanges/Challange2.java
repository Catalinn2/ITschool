package session7.challanges;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Challange2 {
    public static void main(String[] args) {
        displayDateComponents(LocalDate.now());
    }

    private static void displayDateComponents(LocalDate inputDate) {
        System.out.println("Year : " + inputDate.getYear());
        System.out.println("Mounth : " + inputDate.getMonthValue());
        System.out.println("Day : " + inputDate.getDayOfMonth());
    }
}
