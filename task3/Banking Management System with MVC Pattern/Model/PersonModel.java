package Banking_management_system;
import java.util.*;

public class PersonModel {
    private String id;
    private String name;
    private String contact;
    private String email;
    private String extraInfo;

    // Constructor for PersonModel
    public PersonModel(String id, String name, String contact, String email, String extraInfo) {
        this.id = id;
        this.name = name;
        this.contact = contact;
        this.email = email;
        this.extraInfo = extraInfo;
    }

    // Getter methods
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }

    public String getEmail() {
        return email;
    }

    public String getExtraInfo() {
        return extraInfo;
    }

    // Setter methods
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
    }

    // Display person details
    public void displayPersonDetails() {
        //Logic is needed to implement
    }
}
