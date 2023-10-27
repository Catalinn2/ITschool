package session16.challange.challange_12;

public class StringJunctionApp {

    public static void main(String[] args) {

        String string1 = "The dragon is sleeping";
        String string2 = "on a huge pile of gold.";

        StringJunction updatedString = (str1, str2) -> {
            String newString = str1 + " " + str2;
            return newString;
        };

        String newString = updatedString.stringJunction(string1, string2);
        System.out.println(newString);
    }
}
