package session16.challange.challange_2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class LambdaSort {

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        stringList.add("Bianca");
        stringList.add("Gabriela");
        stringList.add("Sam");
        stringList.add("Dan");
        stringList.add("Alex");

        CompareString comparator = (str1, str2) -> str1.compareToIgnoreCase(str2);
        Collections.sort(stringList, (str1, str2) -> comparator.compareString(str1, str2));

        for (String string : stringList) {
            System.out.println(string);
        }
    }
}
