package session6.challanges;

public class Challange16 {
    public static void main(String[] args) {
        String userString = "ThE HorsE IS in THE bArN";
        System.out.println(togglingCase(userString));

    }

    public static String togglingCase(String userString) {
        StringBuilder updatedString = new StringBuilder();
        for (int index =0; index <userString.length(); index++){
            if (Character.isLowerCase(userString.charAt(index))){
                updatedString.append(Character.toUpperCase(userString.charAt(index)));
            } else{
                updatedString.append(Character.toLowerCase(userString.charAt(index)));
            }
        }
        return updatedString.toString();
    }
}