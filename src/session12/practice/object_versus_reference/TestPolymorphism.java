package session12.practice.object_versus_reference;

public class TestPolymorphism {

    public static void main(String[] args) {

        Vehicle myCar = new Car();
        Vehicle myTruck = new Truck();

        Car myCar2 = (Car) myCar;


        System.out.println(myCar.fuelType());
        System.out.println(myTruck.fuelType());

        Car ford = new Car();
        Object carAsObject = myCar2;
        Car backToCar = (Car) carAsObject;
        backToCar.fuelType();
    }
}
