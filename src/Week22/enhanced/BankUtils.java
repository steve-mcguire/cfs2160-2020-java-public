package Week22.enhanced;

import java.text.NumberFormat;
import java.util.Locale;

public class BankUtils {
    public String formatCurrency(double amount){
        NumberFormat gb = NumberFormat.getCurrencyInstance (Locale.UK);
        return gb.format(amount);
    }
}
