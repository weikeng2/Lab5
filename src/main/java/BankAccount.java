import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 5.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/5/">Lab 5 Description</a>
 */
public class BankAccount {

    /**
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        CHECKINGS,
        SAVINGS,
        STUDENT,
        WORKPLACE
    }

    /**
     * no
     */
    private int accountNumber;
    /**
     * no
     */
    private BankAccountType accountType;
    /**
     * no
     */
    private double accountBalance;
    /**
     * no
     */
    private String ownerName;
    /**
     * no
     */
    private double interestRate;
    /**
     * no
     */
    private double interestEarned;

    /**
     * yes
     * @param name no
     * @param accountCategory no
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        ownerName = name;
        accountType = accountCategory;
        Bank.totalAccounts++;
    }

    /**
     * no
     * @return no
     */
    public double getAccountBalance() {
        return accountBalance;
    }

    /**
     * no
     * @param newAmount no
     */
    public void setAccountBalance(final double newAmount) {
        accountBalance = newAmount;
    }

    /**
     * no
     * @param name no
     */
    public void setOwnerName(final String name) {
        ownerName = name;
    }
}
