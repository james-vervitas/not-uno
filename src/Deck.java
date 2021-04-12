import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	private List<Card> cards;



	/**
	 * Creates an empty deck
	 */
	public Deck(){
		this.cards = new ArrayList<Card>();

	}


	/**
	 * Returns a new full deck. (The starting deck)
	 * 
	 * @return a full deck
	 */
	public Deck fullDeck(){
		Deck fullDeck = new Deck();

		// Adds skips, reverse, +2 and 0-9 (including 0's)
		for (int suit = 1; suit <= 4; suit++){
			for (int value = 0; value <= 12; value++){
				Card newCard = new Card(suit, value);
				fullDeck.addCard(newCard);
			}
		}
		// Adds skips, reverse, +2 and 1-9 (excluding 0's)
		for (int suit = 1; suit <= 4; suit++){
			for (int value = 1; value <= 12; value++){
				Card newCard = new Card(suit, value);
				fullDeck.addCard(newCard);
			}
		}
		// Adds the wildcard color cnange and +4's
		for (int suit = 1; suit <= 4; suit++){
			for (int value = 13; value <= 14; value++){
				Card newCard = new Card(0, value);
				fullDeck.addCard(newCard);
			}
		}
	
		return fullDeck;
	}


	public void addCard(Card card){
		this.cards.add(card);
	}

	public boolean contains(Card card){
		for (int i = 0; i < this.cards.size(); i++){
			if (card.equals(this.cards.get(i))){
				return true;
			}
		}
		return false;
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

	public void shuffelCards(){
		Collections.shuffle(this.cards);
	}


	public Card takeTopCard(){
		Card card = this.cards.get(0);
		this.cards.remove(0);
		return card;
	}

	public Card takeCard(int index){
		Card card = this.cards.get(index);
		this.cards.remove(index);
		return card;
	}

	public void dealCards(Player player, int n){
		for (int i = 1; i <= n; i++){
			Card card = this.takeTopCard();
			player.addCard(card);
		}
	}
}
