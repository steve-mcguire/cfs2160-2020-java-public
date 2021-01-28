package Week14;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyConvertor {
    // exchange rate as of 25/01/2021
    private double euroToGBRate = 0.89;

    public Double convertToGBP(double amount) {
        return this.euroToGBRate * amount;
    }

    public String setCurrencyGB(double amount){
        NumberFormat gb = NumberFormat.getCurrencyInstance (Locale.UK);
        return gb.format(amount);
    }

    public String captureStringInput(){
        Scanner s = new Scanner(System.in);
        return s.nextLine();
    }

    public static void main (String[] args) {
        CurrencyConvertor cc = new CurrencyConvertor();

        System.out.print ("Enter your amount in Euro: ");
        //get user input
        String value = cc.captureStringInput();
        //convert user input to double
        double amount = Double.parseDouble(value);
        //do the currency conversion
        double gbp = cc.convertToGBP(amount);
        //format with £ symbol
        String result = cc.setCurrencyGB(gbp);

        //print result
        System.out.println(result);
    }
}
