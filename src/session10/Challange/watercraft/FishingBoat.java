package session10.Challange.watercraft;

public class FishingBoat extends Boat{
    private int fishCapacity;
    private String typeOfNet;

    public FishingBoat(int lenght, int weight, int fishCapacity, String typeOfNet) {
        super(lenght, weight);
        this.fishCapacity = fishCapacity;
        this.typeOfNet = typeOfNet;
    }

    public void castNet(){
        System.out.println("The fishing boat opens its net!");
    }

    public int getFishCapacity() {
        return fishCapacity;
    }

    public void setFishCapacity(int fishCapacity) {
        this.fishCapacity = fishCapacity;
    }

    public String getTypeOfNet() {
        return typeOfNet;
    }

    public void setTypeOfNet(String typeOfNet) {
        this.typeOfNet = typeOfNet;
    }
}
