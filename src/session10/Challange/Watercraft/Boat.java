package session10.Challange.Watercraft;

public class Boat {

    private int lenght;
    private int weight;

    public Boat(int lenght, int weight) {
        this.lenght = lenght;
        this.weight = weight;
    }

    public void sail(){
        System.out.println("Boat sails into the sea!");
    }
    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
