package Banking_management_system;

/*
 * DIP: High-level modules depend on this abstraction, not on concrete implementations.
 * This interface defines the contract for sending notifications.
*/
public interface NotificationService 
{
    
    // Sends a notification message to the specified recipient.
    void sendNotification(String message, String recipient);
}
