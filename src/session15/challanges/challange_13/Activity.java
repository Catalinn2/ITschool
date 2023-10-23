package session15.challanges.challange_13;

public class Activity {

    private String name;
    private session15.challanges.challange_13.Day day;

    public Activity(String name, session15.challanges.challange_13.Day day) {
        this.name = name;
        this.day = day;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Day getDay() {
        return day;
    }

    public void setDay(session15.challanges.challange_13.Day day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return day + " : " + name;
    }
}
