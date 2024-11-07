package Banking_management_system;

/*
 * Interface Segregation Principle (ISP): This interface is designed to be minimal, containing only the necessary methods that are common to all investment types.
 * Dependency Inversion Principle (DIP): High-level modules (e.g., InvestmentManager) depend on this abstraction, not on concrete investment types. This allows InvestmentManager to handle any type of investment (stocks, bonds, etc.) as long as they implement InvestmentType.
*/
public interface InvestmentType 
{
    /*
     * Calculates the return on investment (ROI) for a specific investment type.
    */
    double calculateReturn();
    
    /*
     * Gets the type of investment (e.g., "Stock", "Bond", etc.).
    */
    String getInvestmentType();
}
