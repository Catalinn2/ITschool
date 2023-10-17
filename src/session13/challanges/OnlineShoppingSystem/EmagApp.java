package session13.challanges.OnlineShoppingSystem;

public class EmagApp {

    public static void main(String[] args) {

        Product product1 = new Product("Tshirt", "A piece of clothing.", 13.99, 50);
        Product product2 = new Product("Mug", "A cool way to drink your beer", 6.99, 35);
        product1.checkIfInStock();
        System.out.println(product1.displayProductInfo());
        Costumer costumer1 = new Costumer("Max" , "max11@gmail.com" , "Munchen, Boschstrasse 8", "Munchen, Boschstrasse 8");
        costumer1.addToCart(product1, 2);

    }
}
