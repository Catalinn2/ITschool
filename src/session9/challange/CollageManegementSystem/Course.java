package session9.challange.CollageManegementSystem;

public class Course {
    private String courseName;
    private String schedule;
    private int duration;
    private String description;
    private Proffesor proffesor;

    public Course(String courseName, String schedule, int duration, String description, Proffesor proffesor) {
        this.courseName = courseName;
        this.schedule = schedule;
        this.duration = duration;
        this.description = description;
        this.proffesor = proffesor;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getSchedule() {
        return schedule;
    }

    public int getDuration() {
        return duration;
    }

    public String getDescription() {
        return description;
    }

    public Proffesor getProffesor() {
        return proffesor;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setProffesor(Proffesor proffesor) {
        this.proffesor = proffesor;
    }
}
