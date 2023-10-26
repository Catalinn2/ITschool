package session16.challange.challange_5;

import java.util.ArrayList;
import java.util.List;

public class MaxFinderApp {

    public static void main(String[] args) {

        MaxFinder maxFinder = (numbers) -> {
            if (numbers.isEmpty()) {
                return null;
            }
            Integer max = numbers.stream()
                    .max(Integer::compare)
                    .get();
            return max;
        };
        List<Integer> intList = List.of(1, 2, 55, 6, 8, 4, 6);
        Integer max = maxFinder.maxFinder(intList);
        if (max != null) {
            System.out.println("Maximum value is :" + max);
        } else {
            System.out.println("List is empty");
        }
    }
}