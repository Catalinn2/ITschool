package session9.challange.SimpleBankingAplication;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Account {
    private String firstName;
    private String lastName;

    private double initialDeposit;
    private double balance;
    private List<String> transaction = new ArrayList<>();

    public Account(String firstName, String lastName, double initialDeposit) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.initialDeposit = initialDeposit;
    }

    private void transferLog(double amount) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime tLog = LocalDateTime.now();
        String tLogDate = tLog.format(formatter);
        if (balance > balance + amount) {
            transaction.add("Withdraw " + (-amount) + " at: " + tLogDate + " new balance " + balance);
        } else if (balance < balance + amount) {
            transaction.add("Deposit " + amount + " at: " + tLogDate + " new balance " + balance);
        }
    }

    public void operation(double amount) {
        balance += amount;
        transferLog(amount);
    }

    public void getTransactionLog() {
        for (String trans : transaction) {
            System.out.println(trans);
        }
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getInitialDeposit() {
        return initialDeposit;
    }

    public double getBalance() {
        return balance;
    }

    public List<String> getTransaction() {
        return transaction;
    }
}
