package session15.challanges.challange_13;

public class CalendarApp {

    public static void main(String[] args) {
        Scheduler scheduler = new Scheduler();
        Activity activity = new Activity("Hike on the forrest", session15.challanges.challange_13.Day.MONDAY);

        scheduler.getActivities().add(activity);

        System.out.println("Monday activities :  " + scheduler.getActivityOnDay(session15.challanges.challange_13.Day.MONDAY));
    }
}
