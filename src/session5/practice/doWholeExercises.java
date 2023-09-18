package session5.practice;

public class doWholeExercises {
    public static void main(String[] args) {
        printNumbers();
        printReversedCounter();
    }

    public static void printNumbers() {
        int number = 1;
        do {
            System.out.println(number);
            number++;
        } while (number < 11);

    }

    public static void printReversedCounter() {
        int number = 10;
        do {
            System.out.println(number);
            number--;
        } while (number > 0);
    }

}
