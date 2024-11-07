package Banking_management_system;

import java.util.ArrayList;
import java.util.List;

/*
 * InvestmentManager class manages investments for customers, allowing adding, retrieving, and removing investments.
 * Follows SRP by focusing only on managing investments.
*/
public class InvestmentManager 
{

    private List<Investment> investments = new ArrayList<>();  // List to store investments

    // Add an investment to the manager
    public void addInvestment(Investment investment) 
    {
        investments.add(investment);
    }

    // Get all investments for a specific customer
    public List<Investment> getInvestmentsByCustomer(Customer customer) 
    {
        List<Investment> customerInvestments = new ArrayList<>();
        
        // Logic is needed to Implement
        
        return customerInvestments;
    }

    // Display all investments (including customer name for each investment)
    public void displayInvestments() 
    {
        // Logic is needed to Implement
    }

    // Remove an investment by investmentId
    public void removeInvestment(String investmentId) 
    {
        // Logic is needed to Implement
    }
}
