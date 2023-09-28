package session8.challanges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Challange7 {

    public static void main(String[] args) {

        List<String> unsortedFruits = new ArrayList<>();
        List<String> sortedFruits = new ArrayList<>();
        unsortedFruits.add("Pear");
        unsortedFruits.add("Apple");
        unsortedFruits.add("Banana");
        unsortedFruits.add("Plum");
        System.out.println("Unsorted list : " + unsortedFruits);
        Collections.sort(unsortedFruits);
        System.out.println("Alphabetical sort : " + unsortedFruits);

        while (!unsortedFruits.isEmpty()) {
            String longest = "";
            for (String fruit : unsortedFruits) {
                if (fruit.length() > longest.length()) {
                    longest = fruit;
                }
            }
            while (unsortedFruits.contains(longest)) {
                sortedFruits.add(longest);
                unsortedFruits.remove(longest);
            }
        }
        System.out.print("Final sort : ");
        System.out.print(sortedFruits);
    }
}
