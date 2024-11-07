package Banking_management_system;

/*
 * SRP & ISP: AccountType interface is segregated to define only essential operations for accounts.
 * SRP: Each method in this interface is focused on handling operations related to accounts.
 * ISP: The interface only includes operations that are directly related to the account's core behavior (deposit, withdraw, get balance).
*/
public interface AccountType 
{
    //Method to deposit money into the account.
    void deposit(double amount);

    //Method to withdraw money from the account.
    void withdraw(double amount);

    //Method to get the current balance of the account.
    double getBalance();
}
