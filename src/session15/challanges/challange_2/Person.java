package session15.challanges.challange_2;

import session15.challanges.challange_3.Student;

import java.util.Objects;

public class Person {
    private static int nextStudentId;
    private String name;
    private int age;
    private String email;

    private int studentId = 1;

    public int getStudentId() {
        return studentId;
    }


    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Person person = (Person) object;
        return getAge() == person.getAge() && Objects.equals(getName(), person.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }

    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.studentId = nextStudentId++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static void main(String[] args) {
        Student student1 = new Student("Mike", 15, "mikezilla@gmail.com");
        Student student2 = new Student("Mike", 15, "mikezilla@gmail.com");
        System.out.println(student1.equals(student2));
        System.out.println(student1.getStudentId());
        System.out.println(student2.getStudentId());

    }
}
