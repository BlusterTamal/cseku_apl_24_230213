package Banking_management_system;
import java.util.List;

public class PersonController 
{

    private PersonModel personModel;  
    private PersonView personView;    

    // Constructor to initialize the controller with the model and view
    public PersonController(Person person) 
    {
        this.personModel = new PersonModel(person);
        this.personView = new PersonView();
    }

    // Method to start the person management system
    public void start() 
    {
       // Logic is needed to implement
    }

    // Method to view the details of a specific person
    private void viewPersonDetails() 
    {
        // Logic is needed to implement
    }

    // Method to add a new customer
    private void addCustomer() 
    {
        // Logic is needed to implement
    }

    // Method to add a new employee
    private void addEmployee() 
    {
        // Logic is needed to implement
    }

    // Method to display all customers and employees
    private void displayPeople() 
    {
        // Logic is needed to implement
    }

    // Utility method to get user input for a menu option
    private int getUserInput() 
    {
        // Logic is needed to implement
    }
}
