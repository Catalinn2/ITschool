package session15.challanges.challange_14;

public enum TrafficLightEnum {

    RED("You have to stop!"),
    YELLOW("Caution!"),
    Green("You can go!");

    private String description;

    public String getDescription() {
        return description;
    }

    TrafficLightEnum(String description) {
        this.description = description;
    }
}
