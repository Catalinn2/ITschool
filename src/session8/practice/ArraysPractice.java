package session8.practice;

import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {
        int[] number = {1, 5, 8, 9, 4};

        sortArray(number);
        System.out.println("Printed array: " + Arrays.toString(number));
        System.out.println("Binary search value: " + Arrays.binarySearch(number, 9));

        String[][] names = {{"Mr ", "Ms "}, {"Alice", "John"}};
        prin2DArray(names);
        int firstArrayNumber = number[0];
        System.out.println("FIrst array number: " + firstArrayNumber);
        printArraysAverage(number);
    }

    public static void sortArray(int[] array) {
        Arrays.sort(array);

    }

    public static void printArraysAverage(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        int average = sum / numbers.length;
        System.out.println("Array average" + average);
    }

    public static void prin2DArray(String[][] names) {
        for (int index = 0; index < names.length; index++) {
            for (int index2 = 0; index2 < names[index].length; index2++) {
                System.out.print(names[index][index2] + " ");
            }
            System.out.println();
        }
    }
}
