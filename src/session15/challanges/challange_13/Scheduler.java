package session15.challanges.challange_13;

import session11.practice.data_transfer_information.PDFReport;

import java.util.ArrayList;
import java.util.List;

public class Scheduler {

    private List<Activity> activities;

    public Scheduler() {
        activities = new ArrayList<>();
    }

    public Activity getActivityOnDay(Day day) {
        for (Activity activity : activities) {
            if (activity.getDay().equals(day)) {
                return activity;
            }
        }
        System.out.println("No activity on " + day);
        return null;
    }

    public List<Activity> getActivities() {
        return activities;
    }

    public void setActivities(List<Activity> activities) {
        this.activities = activities;
    }
}
