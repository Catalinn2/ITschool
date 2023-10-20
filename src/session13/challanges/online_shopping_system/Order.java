package session13.challanges.online_shopping_system;

import java.util.ArrayList;

public class Order {

    private static int nextOrderNumber = 1;
    private int orderNumber;
    private Costumer costumer;
    private ArrayList<Product> products;
    private String orderStatus = "Processing.";


    public String orderInfo() {
        return "Order{" +
                "orderNumber=" + orderNumber +
                ", orderStatus='" + orderStatus + '\'' +
                '}';
    }

    public void costumerInfo() {
        System.out.println("Name : " + costumer.getName());
        System.out.println("Email : " + costumer.getEmail());
        System.out.println("Billing adress : " + costumer.getBillingAddress());
        System.out.println("Shipping Adress : " + costumer.getShippingAddress());
    }

    public Order(Costumer costumer, ArrayList<Product> products) {
        this.costumer = costumer;
        this.products = products;
        this.orderNumber = nextOrderNumber++;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }
}
