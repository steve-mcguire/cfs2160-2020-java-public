package Week22.enhanced;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

public class Bank {

    private static final BankUtils bu = new BankUtils();
    private ArrayList <BankAccount> accounts;

    public Bank () {
        accounts = new ArrayList <> ();
    }

    public void addAccount (BankAccount b) {
        this.accounts.add (b);
    }

    public double totalBalance () {
        double total = 0.0;
        for (BankAccount a : this.accounts) {
            total += a.getBalance ();
        }
        return total;
    }

    public String displayAllAccounts () {
        StringBuilder sb = new StringBuilder();
        for (BankAccount b : this.accounts) {
            sb.append(b.display ()).append("\n");
        }
        return sb.toString();
    }

    public String displayOverdrawnAccounts () {
        StringBuilder sb = new StringBuilder();
        for (BankAccount b : this.accounts) {
            if (b.getBalance () < 0.0) {
                sb.append(b.display ()).append("\n");
            }
        }
        return sb.toString();
    }

    public String displayStudentAccounts () {
        StringBuilder sb = new StringBuilder();
        for (BankAccount b : this.accounts) {
            if (b instanceof StudentAccount) {
                sb.append(b.display ()).append("\n");
            }
        }
        return sb.toString();
    }

    public String displayGoldAccounts () {
        StringBuilder sb = new StringBuilder();
        for (BankAccount b : this.accounts) {
            if (b instanceof GoldenAccount) {
                sb.append(b.display ()).append("\n");
            }
        }
        return sb.toString();
    }

    private static void runDemo () {

        CurrentAccount c = new CurrentAccount ("Fred", "123", false);
        c.deposit (100);

        CurrentAccount c2 = new CurrentAccount ("Jane", "321", true);
        c2.withdraw (100);

        DepositAccount d = new DepositAccount ("Jim", "456", 10);
        d.deposit (150);

        StudentAccount s = new StudentAccount ("Alice", "789");
        s.withdraw (50);

        StudentAccount s2 = new StudentAccount ("Mohammed", "987");
        s2.deposit (25);

        GoldCurrentAccount g1 = new GoldCurrentAccount("Steve", "435", true);
        g1.deposit(1000);
        g1.addMonthlyBonus();
        g1.takeMonthlyFee();

        Bank theBank = new Bank ();

        theBank.addAccount(c);
        theBank.addAccount(c2);
        theBank.addAccount(d);
        theBank.addAccount(s);
        theBank.addAccount(s2);
        theBank.addAccount(g1);

        System.out.println ();
        System.out.println ("Testing the Bank");
        System.out.println ("================");
        System.out.println ();

        NumberFormat gb = NumberFormat.getCurrencyInstance (Locale.UK);
        System.out.println ("Total Balances: " + bu.formatCurrency (theBank.totalBalance ()));

        System.out.println ();

        System.out.println ("All Accounts");
        System.out.println ("============");
        System.out.println(theBank.displayAllAccounts ());

        System.out.println ();

        System.out.println ("All Overdrawn Accounts");
        System.out.println ("======================");
        System.out.println(theBank.displayOverdrawnAccounts ());

        System.out.println ();

        System.out.println ("Student Accounts");
        System.out.println ("================");
        System.out.println(theBank.displayStudentAccounts());

        System.out.println ();

        System.out.println ("Student Accounts");
        System.out.println ("================");
        System.out.println(theBank.displayGoldAccounts());

        System.out.println ();


    }

    public static void main (String[] args) {

        runDemo ();

    }
}
