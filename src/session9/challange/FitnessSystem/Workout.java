package session9.challange.FitnessSystem;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Workout {
    private String type;
    private double duratiom;
    private double distance;
    private double weightlifting;
    public Date date;

    public Workout(String type, double duratiom, double distance, double weightlifting, Date date) {
        this.type = type;
        this.duratiom = duratiom;
        this.distance = distance;
        this.weightlifting = weightlifting;
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public double getDuratiom() {
        return duratiom;
    }

    public double getDistance() {
        return distance;
    }

    public double getWeightlifting() {
        return weightlifting;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return "Workout{" +
                "type='" + type + '\'' +
                ", duratiom=" + duratiom +
                ", distance=" + distance +
                ", weightlifting=" + weightlifting +
                ", date=" + sdf.format(date) +
                '}';
    }
}
