package session15.practice.enums;

public enum Day {

    MONDAY(true),
    TUESDAY(true),
    WEDNESDAY(true);

    private boolean isWeekDay;

    public boolean isWeekDay() {
        return isWeekDay;
    }

    Day(boolean isWeekDay) {
        this.isWeekDay = isWeekDay;
    }
}
