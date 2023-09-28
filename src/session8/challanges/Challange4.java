package session8.challanges;

public class Challange4 {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        evenNumbers(intArray);
        oddnNumbers(intArray);
    }

    private static void evenNumbers(int[] intArray) {
        System.out.println("The even numbers are: ");
        for (int index = 0; index < intArray.length; index++) {
            if (intArray[index] % 2 == 0) {
                System.out.print(intArray[index] + " ");
            }
        }

    }

    private static void oddnNumbers(int[] intArray) {
        System.out.println("");
        System.out.println("The odd numbers are: ");
        for (int index = 0; index < intArray.length; index++) {
            if (intArray[index] % 2 != 0) {
                System.out.print(intArray[index] + " ");
            }
        }

    }
}
