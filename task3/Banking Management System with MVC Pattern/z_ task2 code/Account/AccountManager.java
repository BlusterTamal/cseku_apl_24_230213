package Banking_management_system;
import java.util.HashMap;
import java.util.Map;

/*
 * SRP: AccountManager is responsible for managing accounts.
 * It encapsulates account-related operations like adding, retrieving, and removing accounts.
*/
public class AccountManager {

    // A map to store accounts with the account number as the key
    private Map<String, Account> accounts = new HashMap<>();

    
    // Adds a new account to the account manager.
    public void addAccount(Account account) 
    {
        accounts.put(account.accountNumber, account);
    }

    // Retrieves an account based on the account number.
    public Account getAccount(String accountNumber) {
        
        return accounts.get(accountNumber);  // Returns the account corresponding to the account number
    }

    // Removes an account from the account manager.
    public void removeAccount(String accountNumber) 
    {
        accounts.remove(accountNumber);  // Removes the account from the map using its account number
    }
}
