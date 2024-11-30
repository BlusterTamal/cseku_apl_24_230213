package Banking_management_system;

public class NotificationModel 
{
    private NotificationService notificationService;

    // Constructor to initialize the model with a specific NotificationService
    public NotificationModel(NotificationService notificationService) 
    {
        this.notificationService = notificationService;
    }

    // Method to send a notification using the selected notification service
    public void sendNotification(String message, String recipient) 
    {
        notificationService.sendNotification(message, recipient);
    }

    // Method to switch the notification service dynamically
    public void setNotificationService(NotificationService newService) 
    {
        this.notificationService = newService;
    }
}
