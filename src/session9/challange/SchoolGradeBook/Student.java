package session9.challange.SchoolGradeBook;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Student {

    private String name;
    private UUID studentID;
    private List<Double> grades;

    public Student(String name, UUID studentID, List<Double> grades) {
        this.name = name;
        this.studentID = UUID.randomUUID();
        this.grades = new ArrayList<>();
    }

    public Student(String studentID, String studentName) {
    }

    public void addGrades(double grade){
        grades.add(grade);
    }
    public double calculateGradesAverage(){
        double sum = 0.0;
        for (double grade : grades){
            sum += grade;
        }
        return (grades.size() > 0) ? sum / grades.size() : 0.0;
    }

    public UUID getStudentID(){
        return studentID;
    }

    public String getName(){
        return name;
    }
}
