package Banking_management_system;

public class TransactionModel 
{

    // Method to process a deposit transaction
    public void processDepositTransaction(String transactionId, String accountNumber, double amount, NotificationService notificationService, AccountManager accountManager) 
    {
        // Create a DepositTransaction object
        Transaction depositTransaction = new DepositTransaction(transactionId, accountNumber, amount, notificationService);
        
        // Execute the transaction (deposit)
        depositTransaction.execute(accountManager);

        // logic is needed to implement
    }

    // Method to process a withdrawal transaction
    public void processWithdrawalTransaction(String transactionId, String accountNumber, double amount, NotificationService notificationService, AccountManager accountManager) 
    {
        // Create a WithdrawalTransaction object
        Transaction withdrawalTransaction = new WithdrawalTransaction(transactionId, accountNumber, amount, notificationService);
        
        // Execute the transaction (withdrawal)
        withdrawalTransaction.execute(accountManager);

        // logic is needed to implement
    }

}
