package Banking_management_system;

import java.util.ArrayList;
import java.util.List;

public class NotificationModel {

    private List<String> notifications; // A list to store all notifications

    // Constructor to initialize the notifications list
    public NotificationModel() {
        this.notifications = new ArrayList<>();
    }

    // Method to add a new notification
    public void addNotification(String message) {
        notifications.add(message);
    }

    // Method to get the list of all notifications
    public List<String> getNotifications() {
        return notifications;
    }

    public void setNotifications(List<String> notifications) {
        this.notifications = notifications;
    }

    // Method to simulate sending a notification (prints to console or stores)
    public void sendNotification(String message, String recipient) {
         //Logic is needed to implement
    }

    // Getter and Setter methods
    public List<String> getNotificationList() {
        return notifications;
    }

}
