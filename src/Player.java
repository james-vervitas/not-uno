

public class Player{

	private String name;
	private int wins;

	private Deck cards;


	public Player(){
		this("defaultName9876", 0);
	}

	public Player(String name){
		this.name = name;
		this.wins = 0;
		this.cards = new Deck();
	}

	public Player(String name, int wins){
		this.name = name;
		this.wins = wins;
		this.cards = new Deck();
	}

	public String getName(){
		return this.name;
	}

	public int getWins(){
		return this.wins;
	}

	public void addWins(int n){
		this.wins = this.wins + n;
	}

	public void addCard(Card card){
		this.cards.addCard(card);
	}

	public Card getCard(int cardIndex){
		return this.cards.takeCard(cardIndex);
	}

	public boolean removeCard(Card card){
		return this.cards.removeCard(card);
	}
	
	public boolean hasCard(Card card){
		return this.cards.contains(card);
	}

	public Deck getCards(){
		return this.cards;
	}
	

}