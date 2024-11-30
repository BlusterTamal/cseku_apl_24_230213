package Banking_management_system;

/*
 * ISP: Defines only the methods relevant to both Customer and Employee.
 * The Person interface serves as a common type for Customer and Employee.
*/
public interface Person {
    String getId();      // Returns the unique identifier for the person
    String getName();    // Returns the name of the person
    String getContact(); // Returns the contact number of the person
    String getEmail();   // Returns the email address of the person
}
