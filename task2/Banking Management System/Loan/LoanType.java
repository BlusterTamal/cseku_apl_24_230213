package Banking_management_system;

/*
 * LoanType interface defines methods for any loan type.
 * Follows DIP: High-level modules depend on this abstraction, not on concrete loan types.
*/
public interface LoanType 
{
    // Calculates the total interest for the loan.
    double calculateTotalInterest();

    // Calculates the total repayment amount (principal + interest).
    double calculateTotalRepayment();
}
