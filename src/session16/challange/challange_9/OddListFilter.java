package session16.challange.challange_9;

import java.util.ArrayList;
import java.util.List;

public class OddListFilter {

    public static void main(String[] args) {

        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(14);
        intList.add(12);
        intList.add(10);
        intList.add(15);
        intList.add(11);


        ListOddFilter oddNumberFilter = getListOddFilter();
        List<Integer> oddNumbers = oddNumberFilter.filter(intList);

        System.out.println("Original list : " + intList);
        System.out.println("Odd number list : " + oddNumbers);

    }

    private static ListOddFilter getListOddFilter() {
        ListOddFilter oddNumberFilter = numList -> {
            List<Integer> oddList = new ArrayList<>();
            for (Integer number : numList) {
                if (number % 2 != 0) {
                    oddList.add(number);
                }
            }
            return oddList;
        };
        return oddNumberFilter;
    }
}
