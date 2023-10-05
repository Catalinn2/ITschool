package session10.Challange.Cars;

public class Car {
    //Car: make, model, year
    //Car: start(), stop(), accelerate()
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void start(){
        System.out.println("Car starts up!");
    }

    public void stop(){
        System.out.println("Car stops!");
    }
    public void accelerate(){
        System.out.println("Car increased speed!");
    }
}
