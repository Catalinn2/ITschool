package session9.challange.FitnessSystem;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class FitnessTrackingSystem {
    private List<User> users = new ArrayList<>();
    private List<Workout> workouts = new ArrayList<>();
    private List<WeeklyGoals> weeklyGoals = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    public void addWorkouts(Workout workout) {
        workouts.add(workout);
    }

    public void addWeeklyGoals(WeeklyGoals weeklyGoals) {
        this.weeklyGoals.add(weeklyGoals);
    }

    public void weeklySummary(User user) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();
        double totalDistance = 0;
        double totalDuration = 0;
        double totalWeightLifted = 0;

        for (Workout workout : workouts) {
            if (workout.date.after(calendar.getTime())) {
                totalDuration += workout.getDuratiom();
                totalDistance += workout.getDistance();
                totalWeightLifted += workout.getWeightlifting();
            }
        }
        System.out.println("Weekly summary for " + user.getName() + ". Week starting : " + sdf.format(calendar.getTime()));
        System.out.println("Total yoga duration : " + totalDuration);
        System.out.println("Total running distance : " + totalDistance);
        System.out.println("Total weight lifted : " + totalWeightLifted);
    }

}
