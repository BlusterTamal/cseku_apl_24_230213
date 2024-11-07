package Banking_management_system;

/*
 * SRP: Manages attributes and methods specific to an employee.
 * LSP: As an Employee, it can substitute for any Person type.
*/
public class Employee implements Person 
{

    private String employeeId;  // Employee's unique identifier
    private String name;        // Employee's name
    private String position;    // Employee's job position
    private double salary;      // Employee's salary
    private String contact;     // Employee's contact number
    private String email;       // Employee's email address

    
    // Constructor to initialize employee details.
    public Employee(String employeeId, String name, String position, double salary, String contact, String email) 
    {
        this.employeeId = employeeId;  // Set employee ID
        this.name = name;              // Set employee name
        this.position = position;      // Set employee position
        this.salary = salary;          // Set employee salary
        this.contact = contact;        // Set employee contact number
        this.email = email;            // Set employee email
    }
    
    //Setters and Getters
    @Override
    public String getId() 
    {
        return employeeId;
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

    public String getPosition() 
    {
        return position;
    }

    public double getSalary() 
    {
        return salary;
    }

    @Override
    public String toString() 
    {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", contact='" + contact + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
