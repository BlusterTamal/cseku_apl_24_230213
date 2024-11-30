package Banking_management_system;

/*
 * LSP: CheckingAccount can replace Account without breaking the application.
 * Follows SRP: Specifically manages transactions for checking accounts.
*/
public class CheckingAccount extends Account {
    private double overdraftLimit;  // The overdraft limit for the checking account

    //Constructor to initialize Checking Account details.
    public CheckingAccount(String accountNumber, String accountHolder, double overdraftLimit) {
        super(accountNumber, accountHolder);  // Initialize base class (Account) with account number and holder
        this.overdraftLimit = overdraftLimit;  // Set the overdraft limit for the account
    }
    
    //Withdraw method for Checking Account.
    @Override
    public void withdraw(double amount) {
        // Logic is needed to Implement
    }
}
