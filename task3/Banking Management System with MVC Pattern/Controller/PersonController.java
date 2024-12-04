package Banking_management_system;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PersonController {
    private List<PersonModel> people;  // List to store all people (Customers and Employees)
    private PersonView personView;     // View for interacting with the user

    // Constructor to initialize the controller with a new list of people and view
    public PersonController() {
        this.people = new ArrayList<>();
        this.personView = new PersonView();
    }

    // Method to start the person management system
    public void start() {
        //Logic is needed to implement
    }

    // Method to view the details of a specific person by ID
    public void viewPersonDetails() {
         //Logic is needed to implement
    }

    // Method to add either a customer or employee
    public void addPerson(String type) {
         //Logic is needed to implement
    }

    // Method to display all people (customers and employees)
    public void displayPeople() {
        //Logic is needed to implement
    }

}
