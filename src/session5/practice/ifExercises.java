package session5.practice;

public class ifExercises {
    public static void main(String[] args) {
        int number = 5;
        int numberToCompare = 10;
        printNumberComparisonInfo(number, numberToCompare);
        printMultipleNumberComparisonInfo(number
        );
    }

    private static void printNumberComparisonInfo(int number, int numberToCompare) {
        if (number > numberToCompare) {
            System.out.println("Number is greater than 10.");

        } else if (number == numberToCompare) {
            System.out.println("Number is equal with 10.");

        } else {
            System.out.println("Number is not greater than 10.");
        }
    }

    private static void printMultipleNumberComparisonInfo(int number) {
        if (number >= 0 && number < 50) {
            System.out.println("The number is between 0 & 50.");
        } else if (number >= 51 && number <= 100) {
            System.out.println("The number is between 51-100.");
        } else {
            System.out.println("The number is out of range.");
        }
    }
}
