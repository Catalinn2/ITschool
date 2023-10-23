package session15.challanges.challange_5;

import java.util.Objects;

public class Product {
    private String name;
    private double price;
    private int productId;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Product product = (Product) object;
        return getProductId() == product.getProductId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProductId());
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getProductId() {
        return productId;
    }

    public Product(String name, double price, int productId) {
        this.name = name;
        this.price = price;
        this.productId = productId;
    }

    public static void main(String[] args) {

        Product product1 = new Product("Phone" , 216.99 , 12 );
        Product product2 = new Product("Laptop" , 916.99 , 11 );
        System.out.println(product2.equals(product1));
        System.out.println(product2.hashCode());
        System.out.println(product1.hashCode());
    }
}
