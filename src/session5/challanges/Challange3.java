package session5.challanges;

public class Challange3 {
    public static void main(String[] args) {
        int[] numberArray = {2, 5, -3, -2, 6};
        negativeCounter(numberArray);
    }


    private static void negativeCounter(int[] numberArray) {
        int countedNumbers = 0;
        for (int number : numberArray) {
            if (number < 0) {
                countedNumbers++;
            }
        }
        System.out.println("There are " + countedNumbers + " negative numbers");

    }
}