package Banking_management_system;

/*
 * SRP: Handles loan-specific data and calculations.
 * DIP: Depends on LoanType interface to allow flexibility for different loan implementations.
*/
public class Loan implements LoanType 
{

    private String loanId;        // Unique identifier for the loan
    private double amount;        // Loan principal amount
    private double interestRate;  // Interest rate for the loan
    private int duration;         // Duration of the loan (e.g., in months or years)
    private Customer customer;    // Association with a Customer (Composition)

    
    // Constructor to initialize loan details, including the associated customer.
    
    public Loan(String loanId, double amount, double interestRate, int duration, Customer customer) 
    {
        this.loanId = loanId;
        this.amount = amount;
        this.interestRate = interestRate;
        this.duration = duration;
        this.customer = customer;  // Associate the loan with a specific customer
    }

    /*
     * Calculates the total interest for the loan.
     * return The total interest to be paid.
    */
    @Override
    public double calculateTotalInterest() 
    {
        return (amount * interestRate * duration) / 100;  // Simple interest calculation
    }

    /*
     * Calculates the total repayment amount (principal + interest).
     * return The total repayment amount.
    */
    @Override
    public double calculateTotalRepayment() 
    {
        return amount + calculateTotalInterest();  // Total repayment = principal + interest
    }

    /*
     * Gets the unique loan ID.
     * return Loan ID
    */
    public String getLoanId() 
    {
        return loanId;
    }

    /*
     * Gets the customer associated with the loan.
     * return Customer object
    */
    public Customer getCustomer() 
    {
        return customer;  // Return the customer associated with the loan
    }
}
