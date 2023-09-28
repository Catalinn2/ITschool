package session6.challanges;

public class Challange13 {
    public static void main(String[] args) {
        //Given a compressed string like "a3b2c4", expand it to "aaabbc", making use of the StringBuilder class.

        String userString = "a3b2c4";
        System.out.println("Compresed : " + userString + " Expanded : " + expand(userString));

    }


    private static String expand(String userString) {
        StringBuilder updatedString = new StringBuilder();
        for (int index = 0; index < userString.length(); index++) {
            if (Character.isDigit(userString.charAt(index))) {
                int counter = Character.getNumericValue(userString.charAt(index)) ;
                {
                    while (counter != 0){
                        updatedString.append(userString.charAt(index - 1));
                        counter--;
                    }
                    continue;
                }
            }
            updatedString.append(userString.charAt(index));
        }
        return updatedString.toString();
    }
}
