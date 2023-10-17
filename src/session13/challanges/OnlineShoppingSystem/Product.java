package session13.challanges.OnlineShoppingSystem;

public class Product {
    String name;

    String description;

    double price;

    int quantity;


    public void removeQuantity(int quantity) {
        this.quantity -= quantity;

    }

    public void checkIfInStock() {
        if (quantity > 0) {
            System.out.println("There are " + quantity + " " + name + " in stock");
        } else {
            System.out.println("There are no " + name + " in stock! ");
        }
    }

    public void addQuantity(int quantity) {
        this.quantity += quantity;
    }

    public String displayProductInfo() {
        return "Product{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    public Product(String name, String description, double price, int quantity) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
