package session10.Challange.bicycles;

public class Bicycle {

    private int speed;

    private int gear;


    public void changeGear(char change) {
        // higherGear
        if (change == '+') {
            if (gear + 1 <= 15) {
                gear++;
                System.out.println("Gear UP!");
            } else {
                System.out.println("Max gear already!");
            }
        }
        // lowerGear
        if (change == '-') {
            if (gear - 1 <= 0) {
                gear--;
                System.out.println("Gear DOWN!");
            } else {
                System.out.println("Lowest gear already!");
            }
        }
    }

    //speedUP
    public void speedUp(int value) {
        speed += value;
        System.out.println("Speed increased with " + value);
    }

    //applyBREAK
    public void applyBreak(int value) {
        if (speed - value <= 0) {
            speed = 0;
            System.out.println("You stoped!");
        }
        speed -= value;
        System.out.println("Speed decreased with " + value);
    }


    public Bicycle(int speed, int gear) {
        this.speed = speed;
        this.gear = gear;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }
}
