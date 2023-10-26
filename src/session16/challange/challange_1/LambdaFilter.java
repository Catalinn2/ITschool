package session16.challange.challange_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaFilter {

    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(2, 3, 5, 7, 8, 9, 12);
        List<Integer> evenList = new ArrayList<>();
        intList.forEach(number -> {
            if (number % 2 == 0) evenList.add(number);
        });
        System.out.println("Even numbers: " + evenList);
    }
}
