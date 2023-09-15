package session4.challanges;

public class Challange17 {
    public static void main(String[] args) {
        boolean hasUsername = true;
        boolean hasPassword = false;
        if (hasUsername == true && hasPassword == true) {
            System.out.println("Authentication Successful");
        } else if (hasUsername == false && hasPassword == false) {
            System.out.println("Authentication Failed");
        } else if (hasUsername == true && hasPassword == false) {
            System.out.println("Password Incorect");
        }
    }
}
