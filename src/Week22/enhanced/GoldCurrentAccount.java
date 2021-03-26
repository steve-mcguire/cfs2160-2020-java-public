package Week22.enhanced;

import java.text.NumberFormat;
import java.util.Locale;

public class GoldCurrentAccount extends CurrentAccount implements GoldenAccount{

    BankUtils bu = new BankUtils();

    public GoldCurrentAccount(String accountHolder, String accountNumber, boolean hasOverdraft) {
        super(accountHolder, accountNumber, hasOverdraft);
    }



    @Override
    public void takeMonthlyFee() {
        this.withdraw(MONTHLY_FEE);
    }

    @Override
    public void addMonthlyBonus() {
        double bonusAmount = (this.getBalance() / 100) * BONUS_RATE;
        this.deposit(bonusAmount);
    }

    @Override
    public String display () {
        StringBuilder sb = new StringBuilder();
        final String formatString = "%20s %12s %12s %10s ";

        sb.append (String.format (formatString, "Gold Current Account", this.getAccountNumber (),
                this.getAccountHolder (), bu.formatCurrency (this.getBalance ())));

        if (super.isHasOverdraft()) {
            sb.append ("Has Overdraft");
        }
        else {
            sb.append ("No Overdraft");
        }
        return sb.toString();
    }


}
