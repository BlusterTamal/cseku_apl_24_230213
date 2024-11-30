package Banking_management_system;

import java.util.*;

public class InvestmentModel 
{
    private InvestmentManager investmentManager;

    // Constructor to initialize InvestmentModel with an InvestmentManager instance
    public InvestmentModel() 
    {
        this.investmentManager = new InvestmentManager();
    }

    // Method to create and add a new investment
    public void addInvestment(String investmentId, double amount, String investmentType, Customer customer) 
    {
        Investment investment = new Investment(investmentId, amount, investmentType, customer);
        investmentManager.addInvestment(investment);
        System.out.println("Investment added successfully for customer: " + customer.getName());
    }

    // Method to retrieve all investments for a specific customer
    public void getInvestmentsByCustomer(Customer customer) 
    {
        List<Investment> customerInvestments = investmentManager.getInvestmentsByCustomer(customer);

        // logic is needed to implement
    }

    // Method to display all investments
    public void displayAllInvestments() 
    {
        System.out.println("Displaying all investments:");
        investmentManager.displayInvestments();
    }

    // Method to remove an investment by its ID
    public void removeInvestment(String investmentId) 
    {
        investmentManager.removeInvestment(investmentId);
        System.out.println("Investment with ID: " + investmentId + " removed successfully.");
    }
}
