package Week22.cards;

import java.util.ArrayList;

public class CardMain {
    public static void main(String[] args)  {
        Deck d = new Deck();
        System.out.println("SHUFFLING THE DECK");
        d.shuffleDeck();
        System.out.println(d.printDeck());
        d.sortDeck();
        System.out.println("SORTING THE DECK");
        System.out.println(d.printDeck());

        try{
            ArrayList<ArrayList<Card>> hands = d.dealDeck(10);
            for(ArrayList<Card> hand : hands){
                System.out.println(hand);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
