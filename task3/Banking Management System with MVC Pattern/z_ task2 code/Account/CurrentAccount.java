package Banking_management_system;

/*
 * CurrentAccount class for handling regular transaction accounts.
 * Follows SRP: Specifically manages transactions for current accounts.
*/
public class CurrentAccount extends Account {
    private double overdraftLimit;  // Overdraft limit for the current account
    
    // Constructor to initialize Current Account details.
    public CurrentAccount(String accountNumber, String accountHolder, double overdraftLimit) {
        super(accountNumber, accountHolder);  // Initialize base class (Account) with account number and holder
        this.overdraftLimit = overdraftLimit;  // Set the overdraft limit for the account
    }

    // Withdraw method for Current Account.
    @Override
    public void withdraw(double amount) {
        // Logic is needed to Implement
    }
}
