package session10.Challange.BankAccountManagementSystem;

public class BankApp {

    public static void main(String[] args) {

        BankAccount accRobinson = new BankAccount("Robinson Crusoe");
        accRobinson.setAccountNumber();
        BankAccount accCharlie = new BankAccount("Charlie Harper");
        accCharlie.setAccountNumber();
        accCharlie.deposit(2500);
        accRobinson.deposit(3000);
        System.out.println(accRobinson.getAccountHolderName() + " balance is : " + accRobinson.getBalance());
        accRobinson.getAccountDetails();
        accRobinson.transferFunds( accCharlie, 2000);
        System.out.println(accRobinson.getAccountHolderName() + " balance is : " + accRobinson.getBalance());
        System.out.println(accCharlie.getAccountHolderName() + " balance is : " + accCharlie.getBalance());

    }
}
