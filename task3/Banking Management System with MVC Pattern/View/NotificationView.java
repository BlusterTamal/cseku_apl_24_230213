package Banking_management_system;

import java.util.List;
import java.util.Scanner;

public class NotificationView {

    private Scanner scanner;

    // Constructor to initialize the scanner for user input
    public NotificationView() {
        this.scanner = new Scanner(System.in);
    }

    // Method to display a menu for sending notifications 
    public void displayMenu() {
        //Logic is needed to implement
    }

    // Get notification details from the user
    public String getNotificationMessage() {
        //Logic is needed to implement
        return scanner.nextLine();
    }

    // Get recipient details from the user
    public String getRecipientDetails() {
        //Logic is needed to implement
        return scanner.nextLine();
    }

    // Display a list of notifications
    public void displayNotificationsList(List<String> notifications) {
        //Logic is needed to implement
    }

    // Display a confirmation message after sending a notification
    public void displayConfirmation(String message) {
         //Logic is needed to implement
    }
}
