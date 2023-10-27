package session16.challange.challange_10;

import java.util.ArrayList;
import java.util.List;

public class StringUpperCaseApp {

    public static void main(String[] args) {

        List<String> animals = new ArrayList<>();
        animals.add("dog");
        animals.add("weaseL");
        animals.add("TIGER");
        animals.add("puma");
        animals.add("CAT");


        StringUpperCaseFilter filter = getStringUpperCaseFilter();

        List<String> sortedList = filter.upperCaseList(animals);
        System.out.println(sortedList);
    }

    private static StringUpperCaseFilter getStringUpperCaseFilter() {
        StringUpperCaseFilter filter = unsortedList -> {
            List<String> sortedList = new ArrayList<>();
            for (String string : unsortedList) {
                for (int index = 0; index < string.length(); index++) {
                    char ch = string.charAt(index);
                    if (Character.isUpperCase(ch)) {
                        sortedList.add(string);
                        break;
                    }
                }
            }
            return sortedList;
        };
        return filter;
    }
}
