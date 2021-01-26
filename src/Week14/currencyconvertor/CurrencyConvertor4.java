package Week14.currencyconvertor;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyConvertor4 {
    //get user input

    //convert
    //format
    //output


    public CurrencyConvertor4() {
    }

    public double convertEuroToGBP(double amount){
        return 0.89 * amount;
    }

    public String formatGBP(double amount){
        NumberFormat gbp = NumberFormat.getCurrencyInstance(Locale.UK);
        return gbp.format(amount);
    }

    public String getStringInput(){
        Scanner s = new Scanner(System.in);
        return s.nextLine();
    }

    public static void main(String[] args) {
        CurrencyConvertor4 cc = new CurrencyConvertor4();

        //System.out.println("Please enter a EURO value: ");
        System.out.println("Hello, what is your name?: ");
        String name = cc.getStringInput();
        System.out.println("Hello " + name + ", it's nice to meet you");
        //double gbp = cc.convertEuroToGBP(Double.parseDouble(r));
        //String s = cc.formatGBP(gbp);
        //.out.println(s);

    }
}
