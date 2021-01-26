package Week14;

import java.util.Scanner;

public class NamedGreeter {

    public void sayHelloWorld(String name) {
        System.out.println ("Hello, " + name);
    }

    public static void main (String[] args) {
        NamedGreeter ng = new NamedGreeter();
        Scanner in = new Scanner (System.in);

        System.out.print ("Hello. Who are you? ");
        String name = in.nextLine ();


        ng.sayHelloWorld (name);
    }
}
