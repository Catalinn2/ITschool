package session9.challange.CollageManegementSystem;

import java.time.LocalDate;

public class Course {
    private String courseName;
    private LocalDate schedule;
    private int duration;
    private String description;
    private Proffesor proffesor;

    public Course(String courseName, LocalDate schedule, int duration, String description, Proffesor proffesor) {
        this.courseName = courseName;
        this.schedule = schedule;
        this.duration = duration;
        this.description = description;
        this.proffesor = proffesor;
    }

    public String getCourseName() {
        return courseName;
    }

    public LocalDate getSchedule() {
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
}
