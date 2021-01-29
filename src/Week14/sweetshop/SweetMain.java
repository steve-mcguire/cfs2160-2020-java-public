package Week14.sweetshop;

import java.util.ArrayList;

public class SweetMain {
    public static void main(String[] args) {
        SweetShop ss = new SweetShop();
        System.out.println("Welcome to the sweet shop");
        System.out.println("How many sweet prices would you like to enter?");

        int y = ss.captureIntInput();

        for (int i = 1; i < (y + 1); i++){
            System.out.println("Please enter the price for sweet " + i);
            String p = ss.captureStringInput();
            Integer x = ss.processInput(p);
            ss.addSweet(x);
        }


        //print report
        ArrayList<Integer> prices = ss.getPrices();
        System.out.println("Sweet Shop Report");
        System.out.println("Total price is: " + ss.formatGBP(ss.total(prices)));
        System.out.println("Number of sweets is: " + prices.size());
        System.out.println("Max sweet price is: " + ss.formatGBP(ss.min(ss.getPrices())));
        System.out.println("Min sweet price is: " + ss.formatGBP(ss.max(ss.getPrices())));
        System.out.println("Avg sweet price is: " + ss.formatGBP(ss.avg(ss.getPrices())));
        System.out.println(ss.getPricesDetails());
    }
}
