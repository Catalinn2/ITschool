package session6.challanges;

public class Challange18 {
    public static void main(String[] args) {

        String userString = "Banana";
        String pattern = "an";
        if (isPattern(userString, pattern)){
            System.out.println(pattern + " is a pattern for" + userString);
        } else {
            System.out.println(pattern + " is NOT a pattern for" + userString);
        }

    }

    static boolean isPattern(String userString, String pattern) {
        int counter1 = userString.indexOf(pattern);
        if (counter1 != -1) {
            int counter2 = userString.indexOf(pattern, counter1 + 1);
            if (counter2 != -1) {
                return true;
            }
        }
        return false;
    }
}
