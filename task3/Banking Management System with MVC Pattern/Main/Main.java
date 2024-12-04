package Banking_management_system;
import java.util.*;

public class Main {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Instantiate Models, Views, and Controllers
        AccountModel accountModel = new AccountModel();
        AccountView accountView = new AccountView();
        AccountController accountController = new AccountController(accountModel, accountView);

        InvestmentModel investmentModel = new InvestmentModel();
        InvestmentView investmentView = new InvestmentView();
        InvestmentController investmentController = new InvestmentController(investmentModel, investmentView);

        LoanModel loanModel = new LoanModel();
        LoanView loanView = new LoanView();
        LoanController loanController = new LoanController(loanModel, loanView);

        NotificationModel notificationModel = new NotificationModel();
        NotificationView notificationView = new NotificationView();
        NotificationController notificationController = new NotificationController(notificationModel, notificationView);

        TransactionModel transactionModel = new TransactionModel();
        TransactionView transactionView = new TransactionView();
        TransactionController transactionController = new TransactionController(transactionModel, transactionView);

        PersonModel personModel = new PersonModel();
        PersonView personView = new PersonView();
        PersonController personController = new PersonController(personModel, personView);

        /* Services being called from respective controller */

        // Account Management
        accountController.deposit();
        accountController.withdraw();
        accountController.displayAccountDetails();

        // Investment Management
        investmentController.addInvestment();
        investmentController.getInvestmentsByCustomer();
        investmentController.displayAllInvestments();
        investmentController.removeInvestment();

        // Loan Management
        loanController.addLoan();
        loanController.getLoanDetails();
        loanController.displayAllLoans();
        loanController.removeLoan();

        // Notification Management
        notificationController.sendNotification();
        notificationController.viewSentNotifications();

        // Transaction Management
        transactionController.deposit();
        transactionController.withdrawal();
        transactionController.displayTransactions();

        // Person Management
        personController.addPerson();
        personController.viewPersonDetails();
        personController.displayPeople();

        scanner.close();
        System.out.println("Banking Management System has completed its operations.");

        // Logic is needed to implement
   }

    // Method to display the main menu
   private static void displayMainMenu() {
      // Logic is needed to implement
   }

   // Method to display a welcome message
   private static void displayWelcomeMessage() {
      // Logic is needed to implement
   }

   // Method to exit the system
   private static void exitSystem(Scanner scanner) {
      // Logic is needed to implement
   }
   
   // Method to reset system state 
   private static void resetSystemState() {
      // Logic is needed to implement
   }
}