package session4.practice;

public class StringMemoryReference {

    public static void main(String[] args) {
        String greeting = "Hello";
        String greetingOne = "Hello";
        String greetingTwo = "Hello";

        System.out.println(greetingTwo == greetingOne);
        System.out.println(greetingTwo.equals(greetingOne));


    }
}
