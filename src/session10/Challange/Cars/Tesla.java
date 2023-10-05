package session10.Challange.Cars;

public class Tesla extends ElectricCar{

    private char autoPilot;
    public Tesla(String make, String model, int year, int batteryCapacity, int range) {
        super(make, model, year, batteryCapacity, range);
    }

    public void enableAutopilot(char symbol){
        if (symbol == '+'){
            System.out.println("Autopilot ON!");
        } else if (symbol == '-') {
            System.out.println("Autopilot OFF!");

        }
    }
}
