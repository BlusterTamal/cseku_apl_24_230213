package Banking_management_system;

import java.util.HashMap;
import java.util.Map;

/*
 * SRP: The LoanManager class focuses on managing loan operations like adding, removing, and retrieving loans.
 * DIP: The LoanManager class depends on the LoanType interface, not on specific Loan implementations.
 * This allows for flexibility in adding different types of loans in the future (e.g., personal loans, mortgage loans, etc.).
*/
public class LoanManager 
{

    // A map to store loans by their unique loanId
    private Map<String, LoanType> loans = new HashMap<>();

    
    // Adds a loan to the LoanManager.
    public void addLoan(LoanType loan) 
    {
       // Logic is needed to Implement
    }

    
    // Retrieves a loan based on its loanId.
    public LoanType getLoan(String loanId) 
    {
        return loans.get(loanId);
    }

    // Removes a loan based on its loanId.
    public void removeLoan(String loanId)
    {
        loans.remove(loanId);
    }

    // Retrieves a list of all loans.
    public Map<String, LoanType> getAllLoans() 
    {
        return loans;
    }
}
