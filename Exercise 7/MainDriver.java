import bank.BankAccount;
import customer.Customer;

public class MainDriver {

    public static void main(String[] args) {

        // Single account demonstration
        BankAccount acc1 = new BankAccount("Alice", 5000);

        Customer c1 = new Customer("Alice", acc1);

        c1.performTransactions(2000, 1500);

        // Array of customers
        Customer[] customers = new Customer[3];

        customers[0] = new Customer("Bob", new BankAccount("Bob", 4000));
        customers[1] = new Customer("Charlie", new BankAccount("Charlie", 6000));
        customers[2] = new Customer("David", new BankAccount("David", 3000));

        customers[0].performTransactions(500, 200);
        customers[1].performTransactions(1000, 500);
        customers[2].performTransactions(700, 1000);

        System.out.println("\nAll Customer Details");

        for (Customer c : customers) {
            c.displayCustomer();
        }
    }
}