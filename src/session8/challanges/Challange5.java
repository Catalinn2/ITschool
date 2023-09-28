package session8.challanges;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Challange5 {

    public static void main(String[] args) {

        List<String> cityList = new ArrayList<>();
        cityList.add("Manchester");
        cityList.add("Wien");
        cityList.add("Prague");
        cityList.add("Budapest");
        cityList.add("Paris");

        String userCity;
        Scanner in = new Scanner(System.in);
        System.out.println("insert a city: ");
        userCity = in.nextLine();
        if (cityList.contains(userCity)) {
            System.out.println("DUPLICATE!");
        } else {
            cityList.add(userCity);
            System.out.println("Updated list: " + cityList);
        }
    }
}
