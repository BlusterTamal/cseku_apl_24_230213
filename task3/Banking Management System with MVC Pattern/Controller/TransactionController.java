package Banking_management_system;

import java.util.List;

public class TransactionController {

    private TransactionModel transactionModel;  // The model responsible for handling transaction logic
    private TransactionView transactionView;    // The view responsible for user interactions

    // Constructor to initialize the controller with the model and view
    public TransactionController() {
        this.transactionModel = new TransactionModel();
        this.transactionView = new TransactionView();
    }

    // Method to start the transaction system
    public void start() {
        // Logic is needed to implement
    }

    // Method to process a deposit transaction
    public void deposit() {
       // Logic is needed to implement
    }

    // Method to process a withdrawal transaction
    public void withdrawal() {
       // Logic is needed to implement
    }

    // Method to display all transactions (optional, if the list of transactions is available)
    public void displayTransactions() {
        // Logic is needed to implement
    }
    
}
