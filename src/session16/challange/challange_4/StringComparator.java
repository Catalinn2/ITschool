package session16.challange.challange_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringComparator {

    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();
        fruits.add("Pear");
        fruits.add("Apple");
        fruits.add("Greph");
        fruits.add("Lemon");
        StringSorter sorter = (str1, str2) -> str1.compareToIgnoreCase(str2);
        Collections.sort(fruits, (str1, str2) -> sorter.StringSorted(str1, str2));
        Collections.reverse(fruits);
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
