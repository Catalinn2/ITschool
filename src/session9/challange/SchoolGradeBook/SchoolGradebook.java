package session9.challange.SchoolGradeBook;

import java.util.Scanner;

public class SchoolGradebook {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Gradebook gradebook = new Gradebook();

        while (true) {
            System.out.println("Menu");
            System.out.println("1. Add student to class");
            System.out.println("2. Assign grade");
            System.out.println("3. Show all students and grades");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            int choice = in.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Class Name: ");
                    String className = in.next();
                    System.out.print("Enter Student ID: ");
                    String studentID = in.next();
                    System.out.print("Enter Student Name: ");
                    String studentName = in.next();
                    Student student = new Student(studentID, studentName);
                    gradebook.addStudentToClass(className, student);
                    break;
                case 2:
                    System.out.print("Enter Class Name: ");
                    className = in.next();
                    System.out.print("Enter Student ID: ");
                    studentID = in.next();
                    System.out.print("Enter Grade: ");
                    double grade = in.nextDouble();
                    gradebook.assignGrade(className, studentID, grade);
                    break;
                case 3:
                    System.out.print("Enter Class Name: ");
                    className = in.next();
                    gradebook.showAllStudentsAndAverages(className);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
