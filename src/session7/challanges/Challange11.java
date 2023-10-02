package session7.challanges;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Challange11 {
    public static void main(String[] args) {
        LocalTime time1 = LocalTime.parse("16:00:00");
        duration(time1);
    }

    private static void duration(LocalTime time1) {
        Duration duration = Duration.between(time1, LocalTime.now());
        long durationTimeInMillis = duration.toMillis();
        DateFormat durationFormat = new SimpleDateFormat("HH:mm:ss");
        System.out.println(durationFormat.format(durationTimeInMillis));


    }
}
