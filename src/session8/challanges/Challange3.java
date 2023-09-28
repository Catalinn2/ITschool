package session8.challanges;

import session7.practice.Student;

import java.util.ArrayList;
import java.util.List;

public class Challange3 {

    public static void main(String[] args) {

        List<String> studentList = new ArrayList<>();
        List<String> graduateStundetList = new ArrayList<>();
        studentList.add("Mike");
        studentList.add("Amber");
        studentList.add("Chris");
        studentList.add("John");
        studentList.add("Olivia");
        studentList.add("Larisa");
        studentList.add("Tony");
        studentList.add("Crystal");
        studentList.add("Tom");
        studentList.add("Cleopatra");
        graduateStundetList = studentList;
        graduatedStudent(graduateStundetList);

    }

    public static void graduatedStudent(List<String> graduateStudentList) {
        for (String student : graduateStudentList) {
            System.out.println(student);
        }

    }
}
