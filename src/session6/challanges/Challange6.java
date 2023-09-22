package session6.challanges;

public class Challange6 {
    public static void main(String[] args) {
        String str = "The white whale goes into ocean";
        System.out.println(stringReplace(str, "whale", "shark"));
    }
    private static String stringReplace(String input, String target, String newValue) {

        StringBuilder updatedString = new StringBuilder();
        String[] stringArray = input.split(" ");

        for (int index = 0; index < stringArray.length; index++) {
            if (stringArray[index].equals(target)) {
                updatedString.append(newValue + " ");
                continue;
            }
            updatedString.append(stringArray[index] + " ");
        }
        return updatedString.toString();
    }
}
