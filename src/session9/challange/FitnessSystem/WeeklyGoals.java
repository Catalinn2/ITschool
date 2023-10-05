package session9.challange.FitnessSystem;

public class WeeklyGoals {
    public String goalType;
    public double targetValue;

    public WeeklyGoals(String goalType, double targetValue) {
        this.goalType = goalType;
        this.targetValue = targetValue;
    }
    public String getGoalType(){
        return goalType;
    }
    public double getTargetValue(){
        return targetValue;
    }

    @Override
    public String toString() {
        return "WeeklyGoals{" +
                "goalType='" + goalType + '\'' +
                ", targetValue=" + targetValue +
                '}';
    }
}
