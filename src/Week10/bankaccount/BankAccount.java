package Week10.bankaccount;

public class BankAccount {
    //add attributes of account here
    private String accountHolder;
    private String accountNumber;
    private double balance;
    private boolean hasOverdraft;

    //add constructor of account here

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

    public boolean withdraw(double amount) throws Exception{
        if(amount > 0){
            System.out.println(hasOverdraft || amount < balance);
            if(hasOverdraft || amount < balance){
                this.balance -= amount;
                return true;
            }else{
                throw new Exception("You have insufficient funds or no overdraft");
            }
        }
        else{
            throw new Exception("Please enter a number greater than zro to withdraw");
        }
    }

    //add toString() here

    //add main here
    public static void main(String[] args) {
        BankAccount ba = new BankAccount("Steve", "dd4345"
                , 100, false);

        try{
          ba.withdraw(-10);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
