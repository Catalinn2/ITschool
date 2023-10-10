package session11.challange.challange_2;

public class BankApp {
    public static void main(String[] args) {


        BankA bankA = new BankA();
        BankB bankB = new BankB();
        BankC bankC = new BankC();

        bankA.getBalance();
        bankB.getBalance();
        bankC.getBalance();
    }
}
