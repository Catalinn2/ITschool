package session4.practice;

public class LoopPractice {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        int [] myArray = {1, 5, 6, 11 , 27};
        printArray(myArray);
        printEvenNumbersUpTo(100);
    }

    public static void printArray(int[] numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }
    public  static void printEvenNumbersUpTo(int limitValue) {
        for(int i = 0; i <= limitValue; i++) {
            if( i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
