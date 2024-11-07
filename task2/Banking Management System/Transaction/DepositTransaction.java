package Banking_management_system;

/*
 * SRP & DIP: DepositTransaction performs the deposit and sends a notification using the provided NotificationService.
*/
public class DepositTransaction extends Transaction 
{

    private NotificationService notificationService;  // Add a NotificationService dependency

    // Constructor now accepts a NotificationService to notify after transaction
    public DepositTransaction(String transactionId, String accountNumber, double amount, NotificationService notificationService) 
    {
        super(transactionId, accountNumber, amount);
        this.notificationService = notificationService;  // Inject the notification service
    }

    @Override
    public void execute(AccountManager accountManager) 
    {
        // Logic is needed to Implement
        
        // After transaction, send notification
        notificationService.sendNotification("Deposit of " + amount + " was successful.", accountNumber);
    }
}
