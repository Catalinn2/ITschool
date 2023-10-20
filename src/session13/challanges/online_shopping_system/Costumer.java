package session13.challanges.online_shopping_system;

import java.util.ArrayList;

public class Costumer {

    String name;
    String email;
    String shippingAddress;
    String billingAddress;
    ArrayList<Product> shoppingCart = new ArrayList<>();
    ArrayList<Order> orderHistory = new ArrayList<>();


    public Order placeOrder(){
        Order order = new Order(this, shoppingCart);
        orderHistory.add(order);
        shoppingCart.clear();
        System.out.println("Order placed succesfully");
        return order;
    }


    public void addToCart(Product product, int quantity) {
        for (int index = 0; index < quantity; index++) {
            shoppingCart.add(product);

        }
    }

    public void removeFromCart(Product product, int quantity) {
        for (int index = 0; index < quantity; index++) {
            shoppingCart.remove(product);
        }
    }

    public Costumer(String name, String email, String shippingAddress, String billingAddress) {
        this.name = name;
        this.email = email;
        this.shippingAddress = shippingAddress;
        this.billingAddress = billingAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }
}
