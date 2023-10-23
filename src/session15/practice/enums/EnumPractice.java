package session15.practice.enums;

public class EnumPractice {

    public static void main(String[] args) {
        printEnumValues();
        printDayMessage(Day.MONDAY);
    }

    private static void printDayMessage(Day day) {
        switch (day) {
            case MONDAY -> System.out.println("Start the week in force, champ!");
            case TUESDAY -> System.out.println("Kepp going champ!");
            default -> System.out.println("Invalid day.");
        }
    }

    private static void printEnumValues() {
        for (Day day : Day.values()) {
            System.out.println(day + " is a weekday : " + day.isWeekDay());
        }
    }
}
