package Week22.enhanced;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrentAccount extends BankAccount {

    private boolean hasOverdraft;
    private BankUtils bu = new BankUtils();

    public CurrentAccount (String accountHolder, String accountNumber, boolean hasOverdraft) {
        super (accountHolder, accountNumber);
        this.hasOverdraft = hasOverdraft;
    }

    public boolean isHasOverdraft () {
        return hasOverdraft;
    }

    public void setHasOverdraft (boolean hasOverdraft) {
        this.hasOverdraft = hasOverdraft;
    }

    public boolean withdraw (double amount) {
        if (amount > 0) {
            if (this.hasOverdraft || this.getBalance () <= amount) {
                this.setBalance (this.getBalance () - amount);
                return true;
            }
        }
        return false;
    }

    public String display () {
        StringBuilder sb = new StringBuilder();
        final String formatString = "%20s %12s %12s %10s ";


        sb.append(String.format (formatString, "Current Account", this.getAccountNumber (),
                this.getAccountHolder (), bu.formatCurrency(this.getBalance())));

        if (this.hasOverdraft) {
            sb.append ("Has Overdraft");
        }
        else {
            sb.append  ("No Overdraft");
        }
        return sb.toString();
    }
}
