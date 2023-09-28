package session6.challanges;

public class Challange17 {
    public static void main(String[] args) {
        String string1 = "abc";
        String string2 = "123";
        System.out.println(interleavesTwoStrings(string1,string2));

    }

    private static String interleavesTwoStrings(String string1 , String string2){
        StringBuilder updatedString = new StringBuilder();
        for (int index = 0 ; index < string1.length() ; index++){
            updatedString.append(string1.charAt(index)).append(string2.charAt(index));
        }
        return updatedString.toString();
    }
}
