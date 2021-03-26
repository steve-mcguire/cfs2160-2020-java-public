package Week22.cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Deck {
    private final ArrayList<Card> deckOfCards = new ArrayList<>(52);

    public Deck() {
        createDeck();
    }

    public void createDeck(){
        // loop through the values enum
        for(Suit s : Suit.values()){
            // and the deck enum
            for(Value v : Value.values()){
                // and create a new card with values and add to the deck list
                this.deckOfCards.add(new Card(s, v));
            }
        }
    }

    public String printDeck(){
        StringBuilder sb = new StringBuilder();
        for(Card c : this.deckOfCards){
            sb.append(c).append("\n");
        }
        return sb.toString();
    }

    public void sortDeck(){
        Collections.sort(deckOfCards);
    }

    public void shuffleDeck(){
        Collections.shuffle(deckOfCards);
    }


    public ArrayList<ArrayList<Card>> dealDeck(int players) throws Exception {
        ArrayList<ArrayList<Card>> hands = new ArrayList<>();
        shuffleDeck();
        if(players > 0 && players <= 52){
            int cardsInHand = deckOfCards.size() / players;

            for(int p = 0; p < players; p++){
                ArrayList<Card> hand = new ArrayList<>();
                for (int c = 0; c < cardsInHand; c++) {
                    Card card = deckOfCards.get(0);
                    hand.add(card);
                    deckOfCards.remove(card);
                }
                hands.add(hand);
            }
        }else{
            throw new Exception("Must have one or more players");
        }
        return hands;
    }
}
