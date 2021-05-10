package Week10;

public class BankAccount {
    //add attributes of account here
    private String accountHolder;
    private String accountNumber;
    private double balance;
    private boolean hasOverdraft;

    //add constructors of account here
    public BankAccount(String accountHolder, String accountNumber,
                       double balance, boolean hasOverdraft) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.hasOverdraft = hasOverdraft;
    }

    public BankAccount(String accountHolder, String accountNumber,
                       boolean hasOverdraft) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = 0;
        this.hasOverdraft = hasOverdraft;
    }

    //getters and setters
    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean getHasOverdraft() {
        return hasOverdraft;
    }

    public void setHasOverdraft(boolean hasOverdraft) {
        this.hasOverdraft = hasOverdraft;
    }

    public void deposit(double amount)
    {

    }

    public void withdraw(double amount)
    {

    }

    public void addInterest(double rate) {

    }

    //toString method
    @Override
    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", hasOverdraft=" + hasOverdraft +
                '}';
    }



    //Main method
    public static void main(String[] args) {




    }
}
