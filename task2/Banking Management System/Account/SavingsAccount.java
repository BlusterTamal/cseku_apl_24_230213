package Banking_management_system;

/*
 * LSP: SavingsAccount can replace Account without altering the system's behavior.
*/
public class SavingsAccount extends Account 
{
    private double interestRate;  // Interest rate for the savings account

    // Constructor to initialize savings account with account details and interest rate.
    public SavingsAccount(String accountNumber, String accountHolder, double interestRate) 
    {
        super(accountNumber, accountHolder);  // Call parent constructor
        this.interestRate = interestRate;
    }

    
    // Applies interest to the balance based on the interest rate.
    public void applyInterest() 
    {
        balance += balance * interestRate;  // Calculate and add interest
    }

    
    // Overrides withdrawal method to ensure valid amount and sufficient funds.
    @Override
    public void withdraw(double amount) 
    {
        // Logic is needed to Implement
    }
}
