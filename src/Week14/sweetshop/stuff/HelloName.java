package Week14.sweetshop.stuff;

import Week14.sweetshop.SweetShop;

public class HelloName {
    public static void main(String[] args) {
        SweetShop ss = new SweetShop();
        System.out.println("hello, what is your name");
        String name = ss.captureStringInput();
        System.out.println("Hello " + name + ", it's nice to meet you");
    }
}
