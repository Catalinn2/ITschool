package session6.challanges;

public class Challange14 {
    public static void main(String[] args) {
        //need to refactor checking for /* */
        String userCode = "//generic comment" +
                "\nint num1 = 5 {" +
                "\n/* Comment */" +
                "\nint num 2 = num1 + 5;" +
                "\nsum = num1 + num2; //comment after code" +
                "\n/* big comment" +
                "\n commeeeent  */" +
                "\n}";
        System.out.println("Commented Code :" + userCode);
        System.out.println("---------------------");
        System.out.println("Cleaned Code");
        System.out.println(cleanCode(userCode));
    }

    private static String cleanCode(String input) {
        StringBuilder cleanStr = new StringBuilder();
        boolean spot = true;
        String[] inputArr = input.split("\n");

        for (String row : inputArr) {

            for (int index = 0; index < row.length(); index++) {
                if (row.charAt(0) == '/' && row.charAt(1) == '/') {
                    continue;
                }
                if (index + 1 < row.length() - 1) {
                    if (row.charAt(index) == '/' && row.charAt(index + 1) == '/') {
                        break;
                    }
                }
                if (index + 1 < row.length()) {
                    if (row.charAt(0) == '/' && row.charAt(1) == '*') {
                        spot = false;
//                        break;
                    }
                    if (row.charAt(index) == '*' && row.charAt(index + 1) == '/') {
                        spot = true;
                        index++;
                        continue;
                    }
                }

                if (spot) {
                    cleanStr.append(row.charAt(index));
                }
            }
            cleanStr.append("\n");
        }
        return cleanStr.toString();
    }
}