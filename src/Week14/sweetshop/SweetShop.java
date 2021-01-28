package Week14.sweetshop;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class SweetShop {
    ArrayList<Integer> prices = new ArrayList<>();

    public SweetShop() {}

    /**
     * Add an integer to the prices ArrayList
     * @param price to add to ArrayList
     */
    public void addSweet(Integer price){
        this.prices.add(price);
    }

    /**#
     * Processes the input into an Integer, removes letter p from the end
     * @param input String value to process
     * @return price with last letter removed
     */
    public Integer processInput(String input){
        return Integer.parseInt(input.substring(0, input.length() -1));
    }

    /**
     * Get a string from the user
     * @return users input
     */
    public String captureStringInput(){
        Scanner s = new Scanner(System.in);
        return s.nextLine();
    }

    /**
     * Get an Integer from the user
     * @return users input
     */
    public Integer captureIntInput(){
        Scanner s = new Scanner(System.in);
        return s.nextInt();
    }

    /**
     *
     * @param list the list from which to find the min value
     * @return lowest contained value as Integer
     */
    public Integer min(ArrayList<Integer> list){
        return Collections.min(list);
    }

    /**
     *
     * @param list the list from which to find the max value
     * @return highest contained value as Integer
     */
    public Integer max(ArrayList<Integer> list){
        return Collections.max(list);
    }

    /**
     *
     * @param list the list from which to find the average value
     * @return average contained value as Integer
     */
    public double avg(ArrayList<Integer> list){
        double total = 0;
        for(Integer i : list){
            total += i;
        }
        return total / list.size();
    }

    /**
     *
     * @param list the list from which to find the total value
     * @return total value of the list
     */
    public Integer total(ArrayList<Integer> list){
        int total = 0;
        for(int p : list){
            total += p;
        }
        return total;
    }

    /**
     *
     * @return the prices ArrayList
     */
    public ArrayList<Integer> getPrices(){
        return this.prices;
    }

    public String formatGBP(double amount){
        amount = amount / 100;
        NumberFormat gbp = NumberFormat.getCurrencyInstance(Locale.UK);
        return gbp.format(amount);
    }
}
