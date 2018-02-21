import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        /**
         * checkings account
         */
        CHECKINGS,
        /**
         * savings account.
         */
        SAVINGS,
        /**
         * student account.
         */
        STUDENT,
        /**
         * workplace account.
         */
        WORKPLACE
    }

    /**
     * number of the account.
     */
    private int accountNumber;
    /**
     * type of the account.
     */
    private BankAccountType accountType;

    /**
     * the account balance.
     */
    private double accountBalance = 0;
    /**
     *
     */
    public String ownerName;
    public double interestRate;
    private double interestEarned;

    /**
     *
     * @param name the name of the owner.
     * @param accountCategory the type of account.
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        ownerName = name;
        accountType = accountCategory;
    }

    /**
     *
     * @return the account number of the bank account.
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     *
     * @return the account balance.
     */
    public double getAccountBalance() {
        return accountBalance;
    }

    /**
     *
     * @return the account type.
     */
    public BankAccountType getAccountType() {
        return accountType;
    }
}