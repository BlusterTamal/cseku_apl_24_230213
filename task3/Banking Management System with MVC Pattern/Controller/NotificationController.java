package Banking_management_system;

import java.util.List;

public class NotificationController {

    private NotificationModel notificationModel;   // The model responsible for notifications
    private NotificationView notificationView;     // The view for interacting with the user

    // Constructor to initialize the controller with the model and view
    public NotificationController() {
        this.notificationModel = new NotificationModel();
        this.notificationView = new NotificationView();
    }

    // Method to start the notification system (show menu and handle user choices)
    public void start() {
        //Logic is needed to implement
    }

    // Method to handle the process of sending a notification
    public void sendNotification() {
         //Logic is needed to implement
    }

    // Method to display the list of sent notifications
    public void viewSentNotifications() {
        //Logic is needed to implement
    }
}
