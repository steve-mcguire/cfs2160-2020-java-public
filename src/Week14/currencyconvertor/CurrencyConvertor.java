package Week14.currencyconvertor;

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

    //output

    public static void main(String[] args) {
        CurrencyConvertor cc = new CurrencyConvertor();
        //System.out.println("Please enter a EURO value: ");

        System.out.println("Hello, what is your name? ");
        String input  = cc.captureStringInput();
        System.out.println("Hello "  + input + ", it's nice to meet you!");


        try{
            //double euro = Double.parseDouble(input);
            //double gbp = cc.convertEuroToGBP(euro);
            //String result = cc.formatGBP(gbp);

            //System.out.println(result);

        }catch(NumberFormatException n){
            System.out.println(n);
        }
    }



}
