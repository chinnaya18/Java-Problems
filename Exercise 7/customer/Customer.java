package customer;

import bank.BankAccount;

public class Customer {

    private String customerName;
    private BankAccount customerAccount;

    public Customer(String name, BankAccount account) {
        customerName = name;
        customerAccount = account;
    }

    public void performTransactions(double depositAmt, double withdrawAmt) {

        System.out.println("\nCustomer: " + customerName);

        customerAccount.deposit(depositAmt);
        customerAccount.withdraw(withdrawAmt);

        customerAccount.showAccountInfo();
    }

    public void displayCustomer() {
        System.out.println("Customer Name: " + customerName);
        customerAccount.showAccountInfo();
        System.out.println("--------------------------");
    }
}