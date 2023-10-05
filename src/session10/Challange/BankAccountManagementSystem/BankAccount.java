package session10.Challange.BankAccountManagementSystem;

import javax.sound.midi.Soundbank;
import java.util.UUID;

public class BankAccount {
    private String accountHolderName;
    private UUID accountNumber;
    private double balance;

    public void transferFunds(BankAccount targetAccount, int value) {
        if (value < 0 || value > balance) {
            System.out.println("Invalid input!");
        } else {
            balance -= value;
            targetAccount.deposit(value);
            System.out.println(accountHolderName + " has sent to " + targetAccount.accountHolderName + ", " + value);
        }
    }

    public void getAccountDetails() {
        System.out.println("Account holder name : " + getAccountHolderName());
        System.out.println("Account number : " + getAccountNumber());
    }


    public void withdraw(double amount) {
        if (amount < 0 || amount > balance) {
            System.out.println("Invalid amount!");
        } else {
            balance -= amount;
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else if (amount <= 0) {
            System.out.println("Invalid amount!");
        }
    }

    public BankAccount(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }


    public void setAccountNumber() {
        this.accountNumber = UUID.randomUUID();
    }

    public UUID getAccountNumber() {
        return accountNumber;
    }


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
