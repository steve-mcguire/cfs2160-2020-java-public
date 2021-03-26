package Week22.cards;

public class Card implements Comparable<Card>{
    // final as in the real world, a card does not chang its suit or value. i.e. is not polymorphic
    private final Suit suit;
    private final Value value;

    public Card(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }

    @Override
    public String toString() {
        return value + " of " + suit ;
    }


    @Override
    public int compareTo(Card c) {
        //compare by suit, need to use the toString() method value for alphabetical sorting
        int result = this.suit.toString().compareTo(c.suit.toString());

        //if equal compare by code, uses the order of the enum to sort
        // alphabetical sorting with toString() would loose the logicai order of cards.
        if(result == 0){
            result = this.value.compareTo(c.value);
        }

        return result;
    }
}