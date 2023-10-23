package session15.challanges.challange_15;

public class App {

    public static void main(String[] args) {

        Student student1 = new Student("John", 21);
        Student student2 = new Student("John", 21);
        System.out.println(student1.equals(student2));

        GenericRepository<Student> studentRepo = new GenericRepository<>();
        studentRepo.add(student1);
        System.out.println(studentRepo.size());
        studentRepo.get(1);
    }
}
