package Banking_management_system;
import java.util.*;
public class AccountModel {
    private AccountManager accountManager;

    // Constructor to initialize the AccountModel with an AccountManager instance
    public AccountModel() {
        this.accountManager = new AccountManager();
    }

    // Method to create and add a SavingsAccount
    public void createSavingsAccount(String accountNumber, String accountHolder, double interestRate) {
        SavingsAccount savingsAccount = new SavingsAccount(accountNumber, accountHolder, interestRate);
        accountManager.addAccount(savingsAccount);
        System.out.println("Savings Account created successfully.");
    }

    // Method to create and add a FDRAccount
    public void createFDRAccount(String accountNumber, String accountHolder, double initialDeposit, double interestRate, int durationInMonths) {
        FDRAccount fdrAccount = new FDRAccount(accountNumber, accountHolder, initialDeposit, interestRate, durationInMonths);
        accountManager.addAccount(fdrAccount);
        System.out.println("FDR Account created successfully.");
    }

    // Method to create and add a DPSAccount
    public void createDPSAccount(String accountNumber, String accountHolder, double monthlyDepositAmount, double interestRate, int depositTerm) {
        DPSAccount dpsAccount = new DPSAccount(accountNumber, accountHolder, monthlyDepositAmount, interestRate, depositTerm);
        accountManager.addAccount(dpsAccount);
        System.out.println("DPS Account created successfully.");
    }

    // Method to create and add a CurrentAccount
    public void createCurrentAccount(String accountNumber, String accountHolder, double overdraftLimit) {
        CurrentAccount currentAccount = new CurrentAccount(accountNumber, accountHolder, overdraftLimit);
        accountManager.addAccount(currentAccount);
        System.out.println("Current Account created successfully.");
    }

    // Method to deposit money into an account
    public void depositToAccount(String accountNumber, double amount) {
        Account account = accountManager.getAccount(accountNumber);
        
        // logic is needed to implement
       
    }

    // Method to withdraw money from an account
    public void withdrawFromAccount(String accountNumber, double amount) {
        Account account = accountManager.getAccount(accountNumber);

        // logic is needed to implement
        
    }

    // Method to get account details and balance
    public void getAccountDetails(String accountNumber) {
        Account account = accountManager.getAccount(accountNumber);

        // logic is needed to implement
        
    }
}
