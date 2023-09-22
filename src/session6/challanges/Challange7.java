package session6.challanges;

public class Challange7 {
    public static void main(String[] args) {
        String userString = "Hell is full.";
        System.out.println(duplicateCharRemover(userString));
    }

    private static String duplicateCharRemover(String input) {


        StringBuilder newString = new StringBuilder();
        char[] charArr = input.toCharArray();


        for (int index = 0; index < charArr.length; index++) {

            if (index < charArr.length - 1 && charArr[index] == charArr[index + 1]) {
                continue;
            }
            newString.append(charArr[index]);
        }
        return newString.toString();
    }
}
