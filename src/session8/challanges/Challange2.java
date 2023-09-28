package session8.challanges;

import java.util.ArrayList;
import java.util.List;

public class Challange2 {

    public static void main(String[] args) {
        List<String> wishList = new ArrayList<>();
        wishList.add("Saxophone");
        wishList.add("Happyness");
        wishList.add("Biscuits");
        wishList.remove("Saxophone");
        System.out.println("Christmas wishlist: " + wishList);
    }
}
