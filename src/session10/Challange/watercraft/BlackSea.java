package session10.Challange.watercraft;

public class BlackSea {
    public static void main(String[] args) {
        SpeedBoat boat1 = new SpeedBoat(6,700,210,"Super strong");
        boat1.sail();
        boat1.turboBoost();
        FishingBoat boat2 = new FishingBoat(20,8000,60, "Airplane one");
        boat2.castNet();

    }
}
