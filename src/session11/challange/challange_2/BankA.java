package session11.challange.challange_2;

public class BankA extends Bank {

    private int balance = 100;

    @Override
    void getBalance() {
        System.out.println(balance);
    }
}
