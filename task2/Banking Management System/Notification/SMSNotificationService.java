package Banking_management_system;

/*
 * SRP: Manages SMS notification sending logic.
 * DIP: Implements the NotificationService interface for abstraction.
*/
public class SMSNotificationService implements NotificationService 
{

    @Override
    public void sendNotification(String message, String recipient) 
    {
        // Logic to send an SMS (simulated here)
        System.out.println("SMS sent to " + recipient + ": " + message);
    }
}
