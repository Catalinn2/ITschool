package session16.challange.challange_7;

public class FirstNLettersApp {

    public static void main(String[] args) {

        FirstNLetters selector = (input, n) -> {
            if (n >= input.length()) {
                return input;
            } else {
                return input.substring(0, n);
            }
        };

        String string = "The dragon is sleeping in the hearth of the mountain.";
        int n = 15;
        String updatedString = selector.nLetters(string, n);
        System.out.println("New string : " + updatedString);
    }
}
