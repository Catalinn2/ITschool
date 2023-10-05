package session9.challange.SchoolGradeBook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Gradebook {
    private Map<String, List<Student>> classes;

    public Gradebook() {
        this.classes = new HashMap <>();
    }

    public void addStudentToClass(String className, Student student) {
        if (!classes.containsKey(className)) {
            classes.put(className, new ArrayList<>());
        }
        classes.get(className).add(student);
    }

    public void assignGrade(String className, String studentID, double grade) {
        if (classes.containsKey(className)) {
            List<Student> students = classes.get(className);
            for (Student student : students) {
                if (student.getStudentID().equals(studentID)) {
                    student.addGrades(grade);
                    return;
                }
            }
        }
        System.out.println("Student not found.");
    }

    public void showAllStudentsAndAverages(String className) {
        if (classes.containsKey(className)) {
            System.out.println("Class: " + className);
            List<Student> students = classes.get(className);
            for (Student student : students) {
                double avg = student.calculateGradesAverage();
                System.out.println("Student ID: " + student.getStudentID() + ", Name: " + student.getName() + ", Average Grade: " + avg);
            }
        } else {
            System.out.println("Class not found.");
        }
    }
}

