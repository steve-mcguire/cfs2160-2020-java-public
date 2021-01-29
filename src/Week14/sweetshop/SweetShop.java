package Week14.sweetshop;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class SweetShop {
    private ArrayList<Integer> prices = new ArrayList<>();

    public SweetShop() {}

    /**
     * Add an integer to the prices ArrayList
     * @param price to add to ArrayList
     */
    public void addSweet(Integer price){
        this.prices.add(price);
    }

    /**
     *
     * @return the prices ArrayList
     */
    public ArrayList<Integer> getPrices(){
        return this.prices;
    }

    /**
     * Processes the input into an Integer, removes letter p from the end
     * @param input String value to process
     * @return price with last letter removed
     */
    public Integer processInput(String input){
        String sub = input.substring(0, input.length() -1);
        return Integer.parseInt(sub);
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

    private Double captureDoubleInput(){
        Scanner s = new Scanner(System.in);
        return s.nextDouble();
    }

    /**
     *
     * @param list the list from which to find the min value
     * @return lowest contained value as Integer
     */
    public Integer minInt(ArrayList<Integer> list){
        return Collections.min(list);
    }

    /**
     *
     * @param list the list from which to find the max value
     * @return highest contained value as Integer
     */
    public Integer maxInt(ArrayList<Integer> list){
        return Collections.max(list);
    }

    /**
     *
     * @param list the list from which to find the average value
     * @return average contained value as Integer
     */
    public double avg(ArrayList<Integer> list){
        double total = 0;
        for(int i : list){
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
     * Formats a double to represent GBP£
     * @param amount the amount to format
     * @return GBP representation of double
     */
    public String formatGBP(double amount){
        amount = amount / 100;
        NumberFormat gbp = NumberFormat.getCurrencyInstance(Locale.UK);
        return gbp.format(amount);
    }

    public String getPricesDetails(){
        StringBuilder sb = new StringBuilder();
        for(Integer i : prices){
            sb.append(i);
            sb.append("\n");
        }
        return sb.toString();
    }
}
