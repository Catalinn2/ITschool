package session9.challange.SimpleBankingAplication;

public class BankApp {
    public static void main(String[] args) {

        Account account = new Account("Maurice", "Hanks", 3500.50);
        System.out.println("Mr. " + account.getLastName() + " started with "  + account.getInitialDeposit());
        account.operation(-255.5);
        account.operation(-1500);
        account.operation(69.69);
        account.getTransactionLog();
    }
}
