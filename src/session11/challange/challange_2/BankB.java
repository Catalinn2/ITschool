package session11.challange.challange_2;

public class BankB extends Bank{
    private int balance = 150;

    @Override
    void getBalance() {
        System.out.println(balance);
    }
}
