package Week10.bankaccount;

public class BankAccount {
    //add attributes of account here
    private String accountHolder;
    private String accountNumber;
    private double balance;
    private boolean hasOverdraft;

    //add constructor of account here

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
