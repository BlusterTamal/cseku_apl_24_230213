package Banking_management_system;

/*
 * The Customer class represents a customer in the banking system.
 * Follows SRP (Single Responsibility Principle) by only focusing on customer data and information.
*/
public class Customer implements Person 
{
    private String customerId;
    private String name;
    private String address;
    private String contact;
    private String email;

    // Constructor to initialize customer data
    public Customer(String customerId, String name, String address, String contact, String email) 
    {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
        this.contact = contact;
        this.email = email;
    }
    
   //Setters and Getters
    @Override
    public String getId() 
    {
        return customerId;
    }

    @Override
    public String getName() 
    {
        return name;
    }

    @Override
    public String getContact() 
    {
        return contact;
    }

    @Override
    public String getEmail()
    {
        return email;
    }

    public String getAddress() 
    {
        return address;
    }
}
