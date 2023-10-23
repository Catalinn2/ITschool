package session15.challanges.challange_6;

public enum LightColor {
    RED("Stop", 30),
    YELLOW("Caution", 5),
    GREEN("Go", 45);

    private String description;
    private int durationInSecond;

    LightColor(String description, int durationInSecond) {
        this.description = description;
        this.durationInSecond = durationInSecond;
    }

    public String getDescription() {
        return description;
    }

    public int getDurationInSecond() {
        return durationInSecond;
    }
}
