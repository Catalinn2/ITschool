package session5.challanges;

public class Challange9 {
    public static void main(String[] args) {
        int[] myArray = {-5 , 5, 3, 2 , 16, 21 , 8};
        oddOrEven(myArray);
    }

    private static void oddOrEven(int[] myArray){
        int checker;
        for (int number : myArray){
            checker = number % 2;
            if (checker == 0){
                System.out.println(number + " - > EVEN");
            } else {
                System.out.println(number + " - > Odd");
            }
        }

    }
}
