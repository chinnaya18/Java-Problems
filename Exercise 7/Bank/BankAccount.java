package bank;

public class BankAccount {

    private String accountHolder;
    private double balance;

    public BankAccount() {
        accountHolder = "Unknown";
        balance = 0.0;
    }

    public BankAccount(String name, double balance) {
        this.accountHolder = name;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited.");
    }

    public void withdraw(double amount) {

        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn.");
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public void showAccountInfo() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}