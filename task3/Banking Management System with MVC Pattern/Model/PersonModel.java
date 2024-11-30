package Banking_management_system;

public class PersonModel 
{
    
    private Person person; // A reference to Person interface which can be either Customer or Employee

    // Constructor that accepts a Person (either Customer or Employee)
    public PersonModel(Person person) 
    {
        this.person = person;
    }

    // Method to display person details
    public void displayPersonDetails() 
    {
        System.out.println("Person ID: " + person.getId());
        System.out.println("Name: " + person.getName());
        System.out.println("Contact: " + person.getContact());
        System.out.println("Email: " + person.getEmail());
        
        // If the person is an Employee, we can also display their position and salary
        // If the person is a Customer, we can also display their address

        // logic is needed to implement
        
    }

    // Method to get the person's ID
    public String getPersonId() 
    {
        return person.getId();
    }

    // Method to get the person's name
    public String getPersonName() 
    {
        return person.getName();
    }

    // Method to get the person's contact
    public String getPersonContact() 
    {
        return person.getContact();
    }

    // Method to get the person's email
    public String getPersonEmail() 
    {
        return person.getEmail();
    }
}
