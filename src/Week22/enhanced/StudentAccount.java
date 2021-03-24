package Week22.enhanced;

import java.text.NumberFormat;
import java.util.Locale;

public class StudentAccount extends CurrentAccount {

    private static final double OVERDRAFT_LIMIT = 500.0;
    BankUtils bu = new BankUtils();

    public StudentAccount (String accountHolder, String accountNumber) {
        super (accountHolder, accountNumber, true);
    }

    @Override
    public boolean withdraw (double amount) {
        if (amount > 0) {
            if (this.getBalance () - amount > (OVERDRAFT_LIMIT * -1)) {
                this.setBalance (this.getBalance () - amount);
                return true;
            }
        }
        return false;
    }

    public String display () {
        StringBuilder sb = new StringBuilder();
        final String formatString = "%20s %12s %12s %10s";
        NumberFormat gb = NumberFormat.getCurrencyInstance (Locale.UK);

        sb.append(String.format (formatString, "Student Account", this.getAccountNumber (),
                                                         this.getAccountHolder (), bu.formatCurrency (this.getBalance ())));
        return sb.toString();
    }
}
