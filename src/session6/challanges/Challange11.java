package session6.challanges;

public class Challange11 {
    // array with abc
    // user input
    public static void main(String[] args) {
        String userString = "Zero";
        char[] normalABC = {'a', 'b', 'c', 'd', 'e',
                'f', 'g', 'h', 'i', 'j',
                'k', 'l', 'm', 'n', 'o',
                'p', 'q', 'r', 's', 't',
                'u', 'v', 'w', 'x', 'y',
                'z'};
        int modifier = 1;
        String encodedMessage = chipfer(userString, normalABC, modifier);
        System.out.println(encodedMessage);
    }

    private static String chipfer(String userString, char[] normalABC, int modifier) {
        StringBuilder updatedString = new StringBuilder();
        for (int index = 0; index < userString.length(); index++) {
            for (int indexABC = 0; indexABC < normalABC.length; indexABC++) {
                if (userString.toLowerCase().charAt(index) == normalABC[indexABC]) {
                    if (indexABC + modifier < 26) {
                        updatedString.append(normalABC[indexABC + modifier]);
                    } else {
                        int difference = (indexABC + modifier) - 26;
                        updatedString.append(normalABC[difference]);
                    }
                }
            }
        }
        return updatedString.toString();
    }
}
