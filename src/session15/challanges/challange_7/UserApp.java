package session15.challanges.challange_7;

public class UserApp {

    public static void main(String[] args) {

        User user = new User("John" , "1990-12-12");
        User user1 = new User("John" , "1990-12-12");
        System.out.println(user.getUserId());
        System.out.println(user1.getUserId());
        System.out.println(user.equals(user1));
    }
}
