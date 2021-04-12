import java.util.List;

public class Deck {
    
    private List<Card> cards;



    /**
     * Creates an empty deck
     */
    public Deck(){


    }

    public Deck fullDeck(){
        Deck fullDeck = new Deck();
        for (int suit = 1; suit <= 4; suit++){
            for (int value = 0; value <= 9; value++){
                Card newCard = new Card(suit, value);
                fullDeck.addCard(newCard);
            }
        }
            


        return fullDeck;
    }

    public void addCard(Card card){
        this.cards.add(card);
    }

    public boolean removeCard(Card card){
        for (int i = 0; i < this.cards.size(); i++){
            if (card.equals(this.cards.get(i))){
                this.cards.remove(i);
                return true;
            }
        }
        return false;
    }
}
