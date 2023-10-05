package session10.Challange.Cars;

public class CarPark {

    public static void main(String[] args) {

        Tesla tesla = new Tesla("Tesla", "X", 2022, 5000, 200);

        tesla.start();
        tesla.enableAutopilot('+');
        tesla.accelerate();
        tesla.enableAutopilot('-');
        tesla.charge();
    }
}
