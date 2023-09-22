package session6.challanges;

public class Challange3 {
    public static void main(String[] args) {
        String string1 = "12345";
        String string2 = "Cars";
        String string3 = "hello world!";
        StringBuilder stringConcatenate = new StringBuilder();
        stringConcatenate.append(string1).append(string2).append(string3);
        System.out.println(stringConcatenate);
    }
}
