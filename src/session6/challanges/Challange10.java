package session6.challanges;

import java.util.Scanner;

public class Challange10 {
    public static void main(String[] args) {
        String str1 = "Horse is in the barn.";
        String[] morseABC = {"-", "-**", "--", "-", "*",
                "-", "--", "**", "", "---",
                "--", "-**", "--", "-", "---",
                "--", "---", "-", "**", "-",
                "-", "*-", "--", "-**-", "---",
                "--", "*----", "---", "--", "**-",
                "**", "-*", "--", "---*", "----",
                "-----", "  "};
        char[] normalABC = {'a', 'b', 'c', 'd', 'e',
                'f', 'g', 'h', 'i', 'j',
                'k', 'l', 'm', 'n', 'o',
                'p', 'q', 'r', 's', 't',
                'u', 'v', 'w', 'x', 'y',
                'z', '1', '2', '3', '4',
                '5', '6', '7', '8', '9',
                '0', ' '};

        System.out.println("The morsed string is : ");
        System.out.println(stringToMorese(str1, morseABC, normalABC));

    }

    private static String stringToMorese(String str1, String[] morseABC, char[] normalABC) {
        // chars from str1 finding index in normalAlphabet and match it with morseABC
        StringBuilder updatedString = new StringBuilder();
        for (int index = 0; index < str1.length() ; index++) {
            for (int indexABC = 0; indexABC< normalABC.length  ; indexABC++) {
                if (str1.toLowerCase().charAt(index) == normalABC[indexABC]) {
                    updatedString.append(morseABC[indexABC] + " ");

                }
            }
        }
        return updatedString.toString();
    }

}