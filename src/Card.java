

public class Card {
    
    private int suit;
    private int value;



    /**
     * Initialize a new Card with defined suit and value.
     * 
     * @param suit The desired suit of the card (0-4)
     * @param value The desired value of the card (0-9)
     */
    public Card(int suit, int value){
        this.suit = suit;
        this.value = value;
    }


    public int getSuit(){
        return this.suit;
    }

    public int getValue(){
        return this.value;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        Card other = (Card) obj;
        return this.suit == other.suit && this.value == other.value;
    }
}
