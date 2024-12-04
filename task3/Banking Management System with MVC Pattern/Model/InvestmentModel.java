package Banking_management_system;

import java.util.*;

public class InvestmentModel {
    private String investmentId;
    private String customerName;
    private double amount;
    private String type;

    // List to store all investments 
    private static List<InvestmentModel> investments = new ArrayList<>();

    // Constructor
    public InvestmentModel(String investmentId, String customerName, double amount, String type) {
        this.investmentId = investmentId;
        this.customerName = customerName;
        this.amount = amount;
        this.type = type;
    }

    // Default Constructor for operations
    public InvestmentModel() {
    }

    // Getter and Setter methods
    public String getInvestmentId() {
        return investmentId;
    }

    public void setInvestmentId(String investmentId) {
        this.investmentId = investmentId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // Add a new investment
    public void addInvestment(InvestmentModel investment) {
        investments.add(investment);
    }

    // Retrieve investments by customer name
    public List<InvestmentModel> getInvestmentsByCustomer(String customerName) {
        //Logic is needed to implement
    }

    // Retrieve all investments
    public List<InvestmentModel> getAllInvestments() {
        return new ArrayList<>(investments);
    }

    // Remove an investment by ID
    public boolean removeInvestment(String investmentId) {
        //Logic is needed to implement
    }

    @Override
    public String toString() {
        return "Investment ID: " + investmentId +
               "\nCustomer Name: " + customerName +
               "\nAmount: $" + amount +
               "\nType: " + type;
    }
}
