package Banking_management_system;

/*
 * SRP: Defines common properties for all transactions.
 * OCP: Can be extended for different transaction types without modifying the base class.
 * DIP: Depends on AccountManager abstraction, not its concrete implementation.
*/
public abstract class Transaction 
{

    protected String transactionId;  // Unique ID for the transaction
    protected String accountNumber;  // Account number for the transaction
    protected double amount;         // Amount involved in the transaction

   
    // Constructor to initialize the transaction.
    public Transaction(String transactionId, String accountNumber, double amount) 
    {
        this.transactionId = transactionId;
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

   
    // Abstract method to execute the transaction.
    public abstract void execute(AccountManager accountManager);

}
