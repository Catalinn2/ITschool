package session9.challange.CollageManegementSystem;

import java.time.LocalDate;

public class Student {
    private String firstName;
    private String lastName;
    private int age;

    private LocalDate dayOfBirth;
    private String gender;
    private String CNP;
    private String adress;

    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setDayOfBirth(LocalDate dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setCNP(String CNP) {
        this.CNP = CNP;
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
        return adress;
    }
}
