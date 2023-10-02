package session7.challanges;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Challange12 {
    public static void main(String[] args) {

        System.out.println("Please enter the time in yyyy-MM-dd HH:mm:ss format :");
        Scanner in = new Scanner(System.in);
        String userInput = in.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime time = LocalDateTime.parse(userInput, formatter);
        System.out.println("Enter the timezone you want to jump : ");
        String zone = in.nextLine();
        System.out.println("Your time in " + zone + " zone is : " + convertToTimeZone(time, zone));

    }

    private static LocalDateTime convertToTimeZone(LocalDateTime time, String zone) {
        ZoneId zoneId = ZoneId.of(ZoneId.SHORT_IDS.get(zone));
        ZonedDateTime local = time.atZone(ZoneId.systemDefault());
        ZonedDateTime other = local.withZoneSameInstant(zoneId);
        return other.toLocalDateTime();
    }
}
