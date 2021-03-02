package Week20.currencyconvertor;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyConvertor {

    //input from user
    public String captureStringInput(){
        Scanner s = new Scanner(System.in);
        return s.nextLine();
    }

    //convert to GBP
    public double convertEuroToGBP(double amount){
        return 0.89 * amount;
    }

    //format to GBP
    public String formatGBP(double amount){
        NumberFormat gb = NumberFormat.getCurrencyInstance(Locale.UK);
        return gb.format(amount);
    }
}