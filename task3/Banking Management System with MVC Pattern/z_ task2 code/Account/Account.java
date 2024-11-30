package Banking_management_system;

/*
 * SRP: Account class handles common properties and operations of an account.
 * OCP: Allows extension by subclasses like CheckingAccount, SavingsAccount.
 * LSP: Subclasses can be used interchangeably where Account is expected.
*/
public abstract class Account implements AccountType {

    protected String accountNumber;   // Account number unique to each account
    protected double balance;         // Balance in the account
    protected String accountHolder;   // Name of the account holder

    // Constructor to initialize the account with account number and holder's name
    public Account(String accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0;  // Balance initialized to 0 by default
    }

    // SRP: Deposit method handles deposit functionality for any account.
    @Override
    public void deposit(double amount) {
        // Logic is needed to Implement
    }

    // LSP: getBalance can be used with any subclass and returns the current balance.
    @Override
    public double getBalance() {
        return balance;  // Returns the balance of the account
    }

    // OCP: Withdraw method is abstract, allowing subclasses to define withdrawal rules.
    public abstract void withdraw(double amount);
}
