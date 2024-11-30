package Banking_management_system;
import java.util.Scanner;

public class NotificationController 
{

    private NotificationModel notificationModel;  // The model responsible for handling notifications
    private NotificationView notificationView;    // The view responsible for user interactions

    // Constructor to initialize the controller with the model and view
    public NotificationController(NotificationService notificationService) 
    {
        this.notificationModel = new NotificationModel(notificationService);
        this.notificationView = new NotificationView();
    }

    // Method to start the notification system
    public void start() 
    {
        // Logic is needed to implement
    }

    // Method to handle the process of sending a notification
    private void sendNotification() 
    {
        // Logic is needed to implement
    }

    // Method to handle the process of changing the notification service
    private void changeNotificationService() 
    {
        // Logic is needed to implement
    }
}
