package Week22.enhanced;

abstract public class BankAccount {

    private String accountHolder;
    private String accountNumber;
    private double balance;


    public BankAccount (String accountHolder, String accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public String getAccountHolder () {
        return accountHolder;
    }

    public void setAccountHolder (String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getAccountNumber () {
        return accountNumber;
    }

    public void setAccountNumber (String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance () {
        return balance;
    }

    public void setBalance (double balance) {
        this.balance = balance;
    }

    public boolean deposit (double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
        return amount > 0;
    }

    abstract String display ();

}
