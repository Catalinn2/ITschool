package session15.challanges.challange_3;

import java.util.Objects;

public class Student {
    private static int nextStudendId = 0;
    private String name;
    private int age;
    private  int studentId;
    private String email;

    public Student(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.studentId =  nextStudendId++;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Student student = (Student) object;
        return getAge() == student.getAge() && Objects.equals(getName(), student.getName()) && Objects.equals(getEmail(), student.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getEmail());
    }

    public static int getNextStudendId() {
        return nextStudendId;
    }

    public static void setNextStudendId(int nextStudendId) {
        Student.nextStudendId = nextStudendId;
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

    public int getStudentId() {
        return studentId;
    }



    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static void main(String[] args) {

        Student student1 = new Student("Charlie", 22, "charlieangel22");
        Student student2 = new Student("Charlie", 22, "charlieangel22");
        System.out.println(student2.equals(student1));

        System.out.println(student2.getStudentId());
        System.out.println(student1.getStudentId());
        Student student3 = new Student("Bill", 21, "billgates@icloud.com");
        System.out.println(student3.equals(student1));
        System.out.println(student3.getStudentId());
        System.out.println(student1.getStudentId());
    }
}
