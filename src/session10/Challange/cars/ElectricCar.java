package session10.Challange.cars;

public class ElectricCar extends Car {

    private int batteryCapacity;
    private int range;

    public ElectricCar(String make, String model, int year, int batteryCapacity, int range) {
        super(make, model, year);
        this.batteryCapacity = batteryCapacity;
        this.range = range;
    }
    public void charge(){
        System.out.println("The Car started to charge!");
    }
    public int getRange() {
        return range;
    }

    public int getBatteryCapacity(){
        return batteryCapacity;
    }
}
