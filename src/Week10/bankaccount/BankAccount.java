package Week10.bankaccount;

public class BankAccount {
    //attributes of account here
    private String accountHolder;
    private String accountNumber;
    private double balance;
    private boolean hasOverdraft;

    //constructor of account here

    public BankAccount(String accountHolder, String accountNumber, double balance, boolean hasOverdraft) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.hasOverdraft = hasOverdraft;
    }


    //add getters an setters

    public void deposit(double amount){
        this.balance += amount;
    }

    public void withdraw(double amount){
        this.balance -= amount;
    }

    //add toString() here

    //add main here
    public static void main(String[] args) {


    }
}
