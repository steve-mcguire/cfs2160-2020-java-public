package Week14.currencyconvertor;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyConvertor5 {
    //input from user
    //convert to sterling
    //format with £ symbol
    //output GBP value

    public String captureStringInput(){
        Scanner s = new Scanner(System.in);
        return s.nextLine();
    }

    public double captureDouble(){
        Scanner s = new Scanner(System.in);
        return s.nextDouble();
    }

    public double convertEuroToGBP(double amount){
        return 0.89 * amount;
    }

    public String formatGBP(double amount){
        NumberFormat gbp = NumberFormat.getCurrencyInstance(Locale.UK);
        return gbp.format(amount);
    }

    public static void main(String[] args) {
        CurrencyConvertor5 cc = new CurrencyConvertor5();
        //System.out.println("Please enter a EURO value: ");
        System.out.println("Hello, what is your name?: ");
        String name = cc.captureStringInput();
        System.out.println("Hello " + name + " it's good to meet you.");

        double e = Double.parseDouble("3.3");
        System.out.println(e);
        //double g = cc.convertEuroToGBP(e);
        //String r = cc.formatGBP(g);
        //System.out.println(r);



    }

}
