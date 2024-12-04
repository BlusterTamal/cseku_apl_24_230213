package Banking_management_system;

import java.util.*;

public class LoanModel {
    private String loanId;
    private String customerName;
    private double loanAmount;
    private double interestRate;
    private int loanTerm; // In months
    private boolean isApproved;

    // A static map to store all loans (using loanId as key)
    private static Map<String, LoanModel> loans = new HashMap<>();

    // Constructor
    public LoanModel(String loanId, String customerName, double loanAmount, double interestRate, int loanTerm, boolean isApproved) {
        this.loanId = loanId;
        this.customerName = customerName;
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
        this.loanTerm = loanTerm;
        this.isApproved = isApproved;
    }

    // Default constructor for operations
    public LoanModel() {
        
    }

    // Getter and Setter methods
    public String getLoanId() {
        return loanId;
    }

    public void setLoanId(String loanId) {
        this.loanId = loanId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getLoanTerm() {
        return loanTerm;
    }

    public void setLoanTerm(int loanTerm) {
        this.loanTerm = loanTerm;
    }

    public boolean isApproved() {
        return isApproved;
    }

    public void setApproved(boolean approved) {
        isApproved = approved;
    }

    // Method to add a new loan to the loan collection
    public void addLoan(LoanModel loan) {
        loans.put(loan.getLoanId(), loan);
    }

    // Method to retrieve loan details by loanId
    public LoanModel getLoanDetails(String loanId) {
        return loans.get(loanId);
    }

    // Method to get all loans
    public Map<String, LoanModel> getAllLoans() {
        return loans;
    }

    // Method to remove a loan by its loanId
    public void removeLoan(String loanId) {
      //Logic is needed to implement 
    }

    // Calculate monthly repayment (Simplified calculation for demonstration)
    public double calculateMonthlyRepayment() {
        //Logic is needed to implement
    }

    // String representation of the loan details
    @Override
    public String toString() {
        return "Loan ID: " + loanId +
               "\nCustomer Name: " + customerName +
               "\nLoan Amount: $" + loanAmount +
               "\nInterest Rate: " + interestRate + "%" +
               "\nLoan Term: " + loanTerm + " months" +
               "\nApproved: " + (isApproved ? "Yes" : "No") +
               "\nMonthly Repayment: $" + calculateMonthlyRepayment();
    }
}
