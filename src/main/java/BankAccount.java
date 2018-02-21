import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /**
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        /**
         * for daily use.
         */
        CHECKINGS,
        /**
         * for interest.
         */
        SAVINGS,
        /**
         *without interest and annual fee.
         */
        STUDENT,
        /**
         *for businesses.
         */
        WORKPLACE
    }
    /**
     *identification number.
     */
    private int accountNumber;
    /**
     *account type.
     */
    private BankAccountType accountType;
    /**
     *remaining balance.
     */
    private double accountBalance;
    /**
     *name of account holder.
     */
    private String ownerName;
    /**
     *amount of interest for owed $.
     */
    private double interestRate;
    /**
     *amount of interest for saving.
     */
    private double interestEarned;
    /**
     *@param name name of account
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        /*
         * Implement this function
         */
    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */
}