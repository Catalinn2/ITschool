package session10.Challange.watercraft;

public class SpeedBoat extends Boat{

    private int maxSpeed;
    private String motorType;

    public SpeedBoat(int lenght, int weight, int maxSpeed, String motorType) {
        super(lenght, weight);
        this.maxSpeed = maxSpeed;
        this.motorType = motorType;
    }

    public void turboBoost(){
        System.out.println("SpeedBoat is really showing its speed! Vuuuum!");
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getMotorType() {
        return motorType;
    }

    public void setMotorType(String motorType) {
        this.motorType = motorType;
    }
}
