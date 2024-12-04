package Banking_management_system;

import java.util.ArrayList;
import java.util.List;

public class TransactionModel {

    private List<String> transactions;  // List to store transaction details in string format

    // Constructor to initialize the transactions list
    public TransactionModel() {
        this.transactions = new ArrayList<>();
    }

    // Getter method for transactions list
    public List<String> getTransactions() {
        return transactions;
    }

    // Setter method for transactions list
    public void setTransactions(List<String> transactions) {
        this.transactions = transactions;
    }

    // Method to add a deposit transaction
    public void deposit(double amount, String accountNumber) {
        //Logic is needed to implement
    }

    // Method to add a withdrawal transaction
    public void withdraw(double amount, String accountNumber) {
         //Logic is needed to implement
    }

    // Method to get a list of all transactions
    public List<String> getTransactionsList() {
        return transactions;
    }

    // Method to find the balance based on transactions 
    public double getAccountBalance(String accountNumber) {
         //Logic is needed to implement
        return balance;
    }

    // Setter method for a specific transaction at a given index
    public void setTransaction(int index, String transaction) {
        //Logic is needed to implement
    }
}
