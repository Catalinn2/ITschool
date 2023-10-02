package session7.challanges;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Challange6 {
    public static void main(String[] args) {
        displayCurrentTime();

    }
    static void displayCurrentTime(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println(LocalTime.now().format(formatter));
    }
}
