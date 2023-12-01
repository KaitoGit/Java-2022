/**
 * this class represents the savings account of a customer
 */
public class SavingsAccount extends BankAccount{
    private final double rate = 0.025;
    private int savingsNumber = 0;
    private final String accountNumber;

    /**
     * constructor for savings account
     */
    public SavingsAccount(String name, double amount) {
        super(name, amount);
        accountNumber = super.getAccountNumber()+ "-" + savingsNumber;
    }

    /**
     * copy constructor for savings account
     */
    public SavingsAccount(SavingsAccount oldAccount, double amount) {
        super(oldAccount,amount);
        savingsNumber = oldAccount.savingsNumber +1;
        accountNumber = super.getAccountNumber() + "-" + savingsNumber;
    }

    public void postInterest() {

        //monthly rate
        double monthlyRate = (rate / 12);

        //monthly fees
        double monthlyInterest = monthlyRate * getBalance();

        //deposit
        deposit(monthlyInterest);
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
