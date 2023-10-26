package session16.challange.challange_3;

import java.util.Arrays;
import java.util.List;

public class LambdaIntSum {

    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 4, 5, 7, 11);

        int total = intList.stream().mapToInt(Integer::intValue).sum();
        System.out.println(total);
    }
}
