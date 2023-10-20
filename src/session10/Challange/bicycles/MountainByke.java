package session10.Challange.bicycles;

public class MountainByke extends Bicycle {

    private String tireType;
    private int suspension;

    public void adjustSuspension(int value) {
        // minimum suspension power
        if (suspension + value <= 0) {
            suspension = 0;
            System.out.println("Lowest suspension level!");
        }
        // maximum suspension power
        else if (suspension + value >= 60) {
            suspension = 60;
            System.out.println("Maximum suspension level!");

        } else {
            suspension += value;
            System.out.println("Supension adjusted with " + value + ". Current level : " + suspension);
        }
    }

    public String getTireType() {
        return tireType;
    }

    public int getSuspension() {
        return suspension;
    }

    public MountainByke(int speed, int gear, String tireType, int suspension) {
        super(speed, gear);
        this.tireType = tireType;
        this.suspension = suspension;


    }
}
