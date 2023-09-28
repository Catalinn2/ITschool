package session6.challanges;

public class Challange19 {
    public static void main(String[] args) {
        String userString = "AAaAaBBBbbbcccccC";
        System.out.println(encodeString(userString));

    }

    private static String encodeString(String userString) {
        StringBuilder updatedString = new StringBuilder();
        for (int index = 0; index < userString.length(); index++) {
            int counter = 1;
            while (index < userString.length() - 1 && userString.toLowerCase().charAt(index) == userString.toLowerCase().charAt(index + 1)){
                counter++;
                index++;
            }
            updatedString.append(counter).append(userString.charAt(index));
        }
        return updatedString.toString();
    }
}
