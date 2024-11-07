package Banking_management_system;

/*
 * Investment class represents a basic investment and associates it with a customer.
 * Implements the InvestmentType interface to provide common behaviors for all investment types.
*/
public class Investment implements InvestmentType 
{

    private String investmentId;
    private double amount;
    private String investmentType;
    private Customer customer;  // Associate each investment with a customer

    // Constructor to initialize the investment details and associate it with a customer
    public Investment(String investmentId, double amount, String investmentType, Customer customer) 
    {
        this.investmentId = investmentId;
        this.amount = amount;
        this.investmentType = investmentType;
        this.customer = customer;  // Associate investment with the customer
    }

    // Getters
    public String getInvestmentId() 
    {
        return investmentId;
    }

    public double getAmount() 
    {
        return amount;
    }

    public String getInvestmentType() 
    {
        return investmentType;
    }

    public Customer getCustomer() 
    {
        return customer;  // Get the customer associated with the investment
    }

    // Setter for the amount
    public void setAmount(double amount) 
    {
        this.amount = amount;
    }

    // Implementing the calculateReturn method from InvestmentType interface
    @Override
    public double calculateReturn() 
    {
        return amount * 0.05;  // Assuming 5% return for demonstration
    }

    @Override
    public String toString() 
    {
        return "Investment{" +
                "investmentId='" + investmentId + '\'' +
                ", amount=" + amount +
                ", investmentType='" + investmentType + '\'' +
                ", customer=" + customer.getName() +  // Include customer name in the output
                '}';
    }
}
