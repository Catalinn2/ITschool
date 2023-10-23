package session15.challanges.challange_16;

public class CarApp {

    public static void main(String[] args) {

        carBrand(CarType.KUGA);
        carPrice(CarType.Q7);
        System.out.println(CarType.GOLF);

    }

    private static void carBrand(CarType car) {
        System.out.println(car.name() + " " + car.brand());
    }

    private static void carPrice(CarType car) {
        System.out.println(car.name() + " " + car.price());
    }
}
