package session10.practice.car_dealership;

import java.time.LocalDate;

public class NewCar extends Car {
    private LocalDate warranty;

    public NewCar(String model, int year, double price, LocalDate warranty) {
        super(model, year, price);
        this.warranty = warranty;
    }

    public void printWarranty() {
        System.out.println(warranty);
    }

    public LocalDate getWarranty() {
        return warranty;
    }
}
