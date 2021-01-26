package Week14.currencyconvertor;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyConvertor6 {
    private double euroToGBPRate = 0.89;

    public CurrencyConvertor6() {
    }

    //capture input from user
    //convert to GBP
    //format £ symbol
    //output

    public String captureStringInput(){
        Scanner s = new Scanner(System.in);
        return s.nextLine();
    }

    public double convertEuroToGBP(double amount){
        return this.euroToGBPRate * amount;
    }

    public String formatGBP(double amount){
        NumberFormat gbp = NumberFormat.getCurrencyInstance(Locale.UK);
        return gbp.format(amount);
    }

    public static void main(String[] args) {
        CurrencyConvertor6 cc = new CurrencyConvertor6();

        //System.out.println("Please enter a EURO value: ");
        System.out.println("Hello, what is your name? ");
        String input = cc.captureStringInput();
        System.out.println("Hello, " + input + " it's nice to meet you!");
        //double euro = Double.parseDouble(input);
        //double gbp = cc.convertEuroToGBP(euro);
        //String result = cc.formatGBP(gbp);

        //System.out.println(result);
    }
}
