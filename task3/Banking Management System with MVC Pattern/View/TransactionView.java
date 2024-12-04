package Banking_management_system;

import java.util.List;
import java.util.Scanner;

public class TransactionView {

    private Scanner scanner;

    // Constructor to initialize the scanner
    public TransactionView() {
        this.scanner = new Scanner(System.in);
    }

    // Display the transaction menu for user interaction
    public void displayMenu() {
        //Logic is needed to implement
    }

    // Collect deposit details from the user
    public String[] getDepositDetails() {
        //Logic is needed to implement
        return new String[]{accountNumber, String.valueOf(amount)};
    }

    // Collect withdrawal details from the user
    public String[] getWithdrawalDetails() {
        //Logic is needed to implement
        return new String[]{accountNumber, String.valueOf(amount)};
    }

    // Display all transactions
    public void displayTransactions(List<String> transactions) {
         //Logic is needed to implement
    }

    // Display a message 
    public void displayMessage(String message) {
        System.out.println(message);
    }
}
