package Banking_management_system;

/*
 * SRP & DIP: Each service class has a single responsibility and implements the NotificationService interface.
*/
public class EmailNotificationService implements NotificationService 
{
    @Override
    public void sendNotification(String message, String recipient) 
    {
        // Simulating email sending process
        System.out.println("Email sent to " + recipient + ": " + message);
    }
}