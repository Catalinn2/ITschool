package session10.Challange.Bicycles;

public class MountainTrack {
    public static void main(String[] args) {
        Bicycle bike1 = new Bicycle(30,5);
        MountainByke mb1 = new MountainByke(40,8, "Offroad", 40);
        bike1.changeGear('+');
        bike1.speedUp(15);

        mb1.adjustSuspension(-50);
    }
}
