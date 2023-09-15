package session4.challanges;

import java.util.ArrayList;
import java.util.Arrays;

public class Challange10 {
    public static void main(String[] args) {
        ArrayList<String> listOne = new ArrayList<>(Arrays.asList("Bayern Munchen", "Paris Saint-Germain", "Manchester United"));
        listOne.add("Gloria Bistrita");
        ArrayList<String> listTwo = listOne;
        listOne.add("Otelul Galati");
        System.out.println(listOne);
        System.out.println(listTwo);



    }
}
