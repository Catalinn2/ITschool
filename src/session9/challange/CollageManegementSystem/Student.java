package session9.challange.CollageManegementSystem;

import java.time.LocalDate;

public class Student {
    private String firstName;
    private String lastName;
    private int age;

    private LocalDate dayOfBirth;
    private String gender;
    private String CNP;
    private String Adress;

    public Student(String firstName, String lastName, int age, LocalDate dayOfBirth, String gender, String CNP, String adress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.dayOfBirth = dayOfBirth;
        this.gender = gender;
        this.CNP = CNP;
        Adress = adress;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getDayOfBirth() {
        return dayOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public String getCNP() {
        return CNP;
    }

    public String getAdress() {
        return Adress;
    }
}
