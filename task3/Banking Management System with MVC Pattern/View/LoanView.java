package Banking_management_system;

import java.util.Map;
import java.util.Scanner;

public class LoanView {

    private Scanner scanner;

    // Constructor
    public LoanView() {
        this.scanner = new Scanner(System.in);
    }

    // Display the main menu for loan operations
    public void displayMenu() {
        //Logic is needed to implement
    }

    // Get loan details from the user to add a new loan from LoanModel
    public String[] getLoanDetails() {
        //Logic is needed to implement
    }

    // Get loan ID for retrieval or deletion
    public String getLoanId() {
        System.out.print("Enter Loan ID: ");
        return scanner.nextLine();
    }

    // Display a specific loan's details
    public void displayLoan(LoanModel loan) {
        //Logic is needed to implement
    }

    // Display all loans
    public void displayAllLoans(Map<String, LoanModel> loans) {
         //Logic is needed to implement
    }
}
