package Week14.currencyconvertor;

import Week10.savingsclub.SavingsClub;

import java.util.Scanner;

public class UserCapture {

    public UserCapture() {
    }

    public String captureStringInput(){
        Scanner s = new Scanner(System.in);
        return s.nextLine();
    }

    public double captureDoubleInput(){
        Scanner s = new Scanner(System.in);
        return s.nextDouble();
    }
}
