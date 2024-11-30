package Banking_management_system;

/*
 * FDRAccount class for handling Fixed Deposit Receipt (FDR) accounts.
 * Follows SRP: Specifically manages FDR-related operations.
*/
public class FDRAccount extends Account {

    private double interestRate;         // Interest rate for FDR account
    private int durationInMonths;        // Duration until maturity (in months)

    // Constructor to initialize FDR account with initial deposit, interest rate, and duration.
    public FDRAccount(String accountNumber, String accountHolder, double initialDeposit, double interestRate, int durationInMonths) {
        super(accountNumber, accountHolder);  // Initialize base Account class with account details
        this.balance = initialDeposit;        // Set initial balance
        this.interestRate = interestRate;    // Set interest rate for FDR
        this.durationInMonths = durationInMonths; // Set FDR duration in months
    }

    
    // FDR accounts do not allow additional deposits after the initial deposit.
    @Override
    public void deposit(double amount) {
        throw new UnsupportedOperationException("Additional deposits are not allowed in FDR accounts.");
    }

   
    // Withdrawals are only allowed after the FDR account matures.
    @Override
    public void withdraw(double amount) {
        // Logic is needed to Implement
    }

    
    // Determines if the FDR account has matured.
    public boolean isMatured() {
        // Logic is needed to Implement
        
        return true;
    }

    // Calculates the maturity amount, including the interest earned over the duration of the FDR.
    public double calculateMaturityAmount() {
        return balance + (balance * interestRate * durationInMonths / 100); // Simple interest formula
    }
}
