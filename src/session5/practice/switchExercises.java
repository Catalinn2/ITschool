package session5.practice;

public class switchExercises {
    public static void main(String[] args) {
        char grade = 'B';
        printGradeInformation(grade);
        enchantedSwitch('A');
        printSeasonInfo("Winter");

    }

    private static void printGradeInformation(char grade) {
        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Average");
                break;
            default:
                System.out.println("Grade not recognized.");
        }
    }

    private static void enchantedSwitch(char grade) {
        switch (grade) {
            case 'A' -> System.out.println("Excellent");
            case 'B' -> System.out.println("Good");
            case 'C' -> System.out.println("Average");
            default -> System.out.println("Grade not recognized.");
        }
    }

    private static void printSeasonInfo(String season) {
        switch (season){
            case "Winter" -> System.out.println("Its cold");
            case "Spring" -> System.out.println("Flowers bloom");
            case "Summer" -> System.out.println("Its hot");
            default -> System.out.println("Unknown season");
        }
    }
}
