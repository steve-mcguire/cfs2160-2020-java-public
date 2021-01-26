package Week14.currencyconvertor;

import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyConvertor2 {
    private double euroGBPRate = 0.89;

    public double euroToGBP(double amount){
        return this.euroGBPRate * amount;
    }

    public String formatGBP(double amount){
        NumberFormat gb = NumberFormat.getCurrencyInstance(Locale.UK);
        return gb.format(amount);
    }
}
