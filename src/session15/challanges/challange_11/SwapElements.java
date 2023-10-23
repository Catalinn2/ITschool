package session15.challanges.challange_11;

public class SwapElements {

    public static <T> void swap(T[] array, int index1, int index2) {
        if (index1 < 0 || index1 > array.length || index2 < 0 || index2 > array.length) {
            throw new IndexOutOfBoundsException("Invalid indices for array swap.");
        }

        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {

        String[] stringArrray = {"Kevin", "Mike", "Dora", "Maria"};
        Integer[] intArray = {1, 3, 5, 6};
        printArray(intArray);
        swap(intArray, 1,3);
        printArray(intArray);
        swap(stringArrray, 0, 3);
        printArray(stringArrray);
    }

    private static <T> void printArray(T[] array) {
        for (T item : array) {
            System.out.print(item + " ");
        }
    }
}

