package session16.challange.challange_6;

public class MaxLenghtApp {

    public static void main(String[] args) {

        String string1 = "Sky is blue";
        String string2 = "Dragon";

        StringMaxLenght maxLenght = ((str1, str2) -> str1.length() > str2.length() ? str1.length() : str2.length());
        System.out.println("The lonest string lenght : " + maxLenght.maxStringLenght(string1, string2));
    }
}
