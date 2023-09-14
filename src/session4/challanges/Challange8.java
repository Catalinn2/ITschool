package session4.challanges;

public class Challange8 {
    public static void main(String[] args) {

        int number = 5;
        int numberFactorial = 1;

        for (int a = number; a > 0; a--) {
            numberFactorial *= a;

        }
        System.out.println("Factorial of " + number + " = " + numberFactorial);
    }
}
