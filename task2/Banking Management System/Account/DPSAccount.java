package Banking_management_system;

/*
 * DPSAccount class for handling Deposit Pension Scheme (DPS) accounts.
 * Follows SRP: It specifically handles DPS-related operations.
*/
public class DPSAccount extends Account 
{
    private double monthlyDepositAmount; // Fixed monthly deposit amount
    private double interestRate;         // Interest rate applied to the account
    private int depositTerm;             // Term in months for the DPS

    
    // Constructor to initialize DPS account details.
    public DPSAccount(String accountNumber, String accountHolder, double monthlyDepositAmount, double interestRate, int depositTerm) 
    {
        super(accountNumber, accountHolder);  // Calling the parent constructor to set account details
        this.monthlyDepositAmount = monthlyDepositAmount;
        this.interestRate = interestRate;
        this.depositTerm = depositTerm;
    }

    // Deposit method for DPS account.
    @Override
    public void deposit(double amount) 
    {
        // Logic is needed to Implement
    }
    
    // Withdrawal method for DPS account.
    @Override
    public void withdraw(double amount) 
    {
        // Logic is needed to Implement
    }
    
    // Calculate the maturity amount for the DPS account, including interest.
    public double calculateMaturityAmount() 
    {
        // Applying interest rate to the balance for the given deposit term
        return balance + (balance * interestRate * depositTerm / 100);
    }
}
