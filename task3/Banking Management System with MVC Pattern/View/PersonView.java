package Banking_management_system;

import java.util.*;

public class PersonView {
    private Scanner scanner;

    // Constructor
    public PersonView() {
        this.scanner = new Scanner(System.in);
    }

    // Display menu options for user interaction
    public void displayMenu() {
        // logic is needed to implement.
    }

    // Get basic information shared by both Customers and Employees
    public Map<String, String> getBasicDetails() {
         //Logic is needed to implement
    }

    // Display a person's details
    public void displayPersonDetails(Map<String, String> personDetails) {
         //Logic is needed to implement
    }

    // Display a message 
    public void displayMessage(String message) {
        System.out.println(message);
    }
}
