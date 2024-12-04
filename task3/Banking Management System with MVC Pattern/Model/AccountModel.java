package Banking_management_system;

public class AccountModel {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor
    public AccountModel(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    // Getter and Setter methods for account details
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    // Deposit money into the account
    public void deposit(double amount) {
        //Logic is needed to implement
    }

    // Withdraw money from the account
    public void withdraw(double amount) {
     //Logic is needed to implement 
    }

    @Override
    public String toString() {
        return "Account Number: " + accountNumber +
               "\nAccount Holder: " + accountHolderName +
               "\nBalance: $" + balance;
    }
}
