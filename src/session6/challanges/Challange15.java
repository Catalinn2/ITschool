package session6.challanges;

import com.sun.source.tree.IfTree;

public class Challange15 {
    public static void main(String[] args) {


        String string1 = "horse";
        String string2 = "shore";
        if (isAnagram(string1, string2) == true){
            System.out.println(string2 + " and " + string1 + " are anagrams!");
        } else
            System.out.println(string2 + " " + string1 + " are Not anagrams!");
    }

    private static boolean isAnagram(String string1, String string2) {
        if (string2.length() != string1.length()) {
            return false;
        }
        StringBuilder updatedString = new StringBuilder();
        int counter = string2.length();
        for (int index = 0; index < string2.length(); index++) {
            for (int indexCheck = 0; indexCheck < string2.length(); indexCheck++) {
                if (string1.charAt(index) == string2.charAt(indexCheck)) {
                    counter--;
                    updatedString.replace(index, index+1, "*");
                }
            }
        }
        return counter == 0 ? true : false;
    }
}