package session9.challange.CollageManegementSystem;
import java.time.LocalDate;

public class CollageManagementSystem {
    public static void main(String[] args) {
    Student student1 = new Student("Gabriel" , "Armstrong", 17);
    Proffesor proffesor1 = new Proffesor("Tom", "Muller", 45);
    Course math = new Course("Math", "2023-10-05 10:00:00", 45 , "Arithmetic Operations", proffesor1);
        System.out.println("Today subject " + math.getDescription());
        math.setDescription("Trigonometry");
        System.out.println("Tomorrow subject " + math.getDescription());
        System.out.println("Math proffesor is : " + proffesor1.getFirstName() + " " + proffesor1.getLastName());
        System.out.println(math.getSchedule());
    }
}
