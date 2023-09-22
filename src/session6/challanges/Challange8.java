package session6.challanges;

public class Challange8 {
    public static void main(String[] args) {

        String initialString = "The sky is blue and the Moon shines!";
        String insertString = ", full of stars ";
        int targetIndex = 14;
        System.out.println(insertStringAt(initialString,insertString,targetIndex));

    }

    private static String insertStringAt(String startString, String updatedString, int targetIndex) {
        StringBuilder newString = new StringBuilder();
        for (int index = 0; index < startString.length(); index++) {
            newString.append(startString.charAt(index));
            if (index == targetIndex) {
                newString.append(updatedString);
            }

        }
        return newString.toString();
    }
}