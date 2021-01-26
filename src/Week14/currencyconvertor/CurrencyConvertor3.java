package Week14.currencyconvertor;


import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyConvertor3 {
    private double euroToGBPRate = 0.89;
    //take input
    //convert to gbp
    //format
    //output

    public double euroToGBP(double eur){
        return this.euroToGBPRate * eur;
    }

    public String formatGBP(double gbp){
        NumberFormat gb = NumberFormat.getCurrencyInstance(Locale.UK);
        return gb.format(gbp);
    }

    public String captureStringInput(){
        Scanner s = new Scanner(System.in);
        return s.nextLine();
    }

    public double cleanInput(String amount) throws  NumberFormatException{
        double cleaned = 0;
        String s = amount.replaceAll("€", "");
        try{
            return Double.parseDouble(s);
        }catch(NumberFormatException n) {
            throw new NumberFormatException("Please enter a number only");
        }
    }

    public static void main(String[] args) {
        CurrencyConvertor3 cc = new CurrencyConvertor3();

        //System.out.println("Please enter an amount in EURO: ");
        //System.out.println("Please enter your name: ");

        //String s = cc.captureStringInput();
        //System.out.println("Hello, " + s + " it's nice to meet you");
        //double d = Double.parseDouble(s);
        //double gbp = cc.euroToGBP(56);
        //String f = cc.formatGBP(gbp);
        ///System.out.println(f);

        try{
            double d = cc.cleanInput("€46");
            System.out.println(cc.formatGBP(d));
        }catch(NumberFormatException n){
            System.out.println(n.getMessage());
        }
    }
}
