package session15.challanges.challange_9;

public class Animal {

    private String name;

    private String color;

    private boolean hasDots;

    @Override
    public String toString() {
        return "name " + name + " color " + color + " hasDots " + hasDots;
    }

    public Animal(String name, String color, boolean hasDots) {
        this.name = name;
        this.color = color;
        this.hasDots = hasDots;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isHasDots() {
        return hasDots;
    }

    public void setHasDots(boolean hasDots) {
        this.hasDots = hasDots;
    }
}
