package session6.challanges;

import java.util.Scanner;

public class Challange9 {
    public static void main(String[] args) {
        String str = "This amazing statement has:";
        System.out.println(charFreq(str));

    }


    private static String charFreq(String input) {
        StringBuilder newString = new StringBuilder();
        char[] charArray = input.toCharArray();
        int[] freq = new int[charArray.length];

        for (int inputIndex = 0; inputIndex < charArray.length; inputIndex++) {
            freq[inputIndex] = 1;
            for (int freqIndex = inputIndex + 1 ; freqIndex < input.length(); freqIndex++) {

                if (charArray[inputIndex] == charArray[freqIndex]) {
                    freq[inputIndex]++;
                    charArray[freqIndex] = '*';
                }
            }
        }
        for (int index = 0; index < freq.length; index++) {
            if (charArray[index] != '*') {
                newString.append(charArray[index] + " - > " + freq[index] + "\n");
            }
        }
        return newString.toString();
    }

}