package Banking_management_system;

import java.util.*;

public class LoanModel 
{
    private LoanManager loanManager;

    // Constructor to initialize LoanModel with a LoanManager instance
    public LoanModel() 
    {
        this.loanManager = new LoanManager();
    }

    // Method to create and add a new loan
    public void addLoan(String loanId, double amount, double interestRate, int duration, Customer customer) 
    {
        Loan loan = new Loan(loanId, amount, interestRate, duration, customer);
        loanManager.addLoan(loan);
        System.out.println("Loan added successfully for customer: " + customer.getName());
    }

    // Method to retrieve and display loan details by loanId
    public void getLoanDetails(String loanId) 
    {
        LoanType loan = loanManager.getLoan(loanId);

        // logic is needed to implement
    }

    // Method to display all loans
    public void displayAllLoans() 
    {
        Map<String, LoanType> allLoans = loanManager.getAllLoans();
        
        // logic is needed to implement
    }

    // Method to remove a loan by its ID
    public void removeLoan(String loanId) 
    {
        loanManager.removeLoan(loanId);
        System.out.println("Loan with ID: " + loanId + " removed successfully.");
    }
}
