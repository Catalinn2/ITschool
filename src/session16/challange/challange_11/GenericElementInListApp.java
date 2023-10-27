package session16.challange.challange_11;

import java.util.ArrayList;
import java.util.List;

public class GenericElementInListApp<T> {

    public static void main(String[] args) {

        List<Integer> intList = new ArrayList<>();
        List<String> stringList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        stringList.add("Bob");
        stringList.add("Alice");
        stringList.add("Chad");
        stringList.add("Mike");

        GenericElementInList<String> checkIfStringListContain = (list, object) -> list.contains(object);
        GenericElementInList<Integer> checkIfIntListContain = (list, object) -> list.contains(object);

        int num = 5;
        String string = "Mike";

        boolean checkIfContain = checkIfIntListContain.contains(intList, num);
        boolean checkifStringContain = checkIfStringListContain.contains(stringList, string);
        System.out.println(checkIfContain);
        System.out.println(checkifStringContain);
    }
}
