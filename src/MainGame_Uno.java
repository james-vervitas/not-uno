import java.util.ArrayList;
import java.util.List;

public class MainGame_Uno {
	
	
	private List<Player> players;
	private Deck mainDeck;
	private Card curCard;
	private Deck historyDeck;


	public MainGame_Uno(){
		this.mainDeck = new Deck().fullDeck();
		this.mainDeck.shuffelCards();
		this.players = new ArrayList<Player>();
		this.curCard = this.mainDeck.takeTopCard();
		
		for (int i = 1; i <= 5; i++){
			this.historyDeck.addCard(this.mainDeck.takeTopCard());
		}
	}

	public void addPlayer(Player newPlayer){
		this.players.add(newPlayer);
	}

	public Player getPlayer(int playerIndex){
		return this.players.get(playerIndex);
	}

	public void dealPlayer(int playerIndex, int cards){
		this.mainDeck.dealCards(this.players.get(playerIndex), cards);
	}

	public void dealAllPlayers(int cards){
		for (int i = 0; i < this.players.size(); i++){
			dealPlayer(i, cards);
		}
	}

	
	public boolean playerPlayCard(int playerIndex, int playerCardIndex){
		Player curPlayer = getPlayer(playerIndex);
		Card playerCard = curPlayer.getCard(playerCardIndex);
		int playerCardSuit = playerCard.getSuit();
		
		if (playerCardSuit == 0){
			moveHistory();
			this.historyDeck.addCard(this.curCard);

			this.curCard = playerCard;
			return true;
		}

		int playerCardValue = playerCard.getValue();

		int curCardSuit = this.curCard.getSuit();
		int curCardValue = this.curCard.getValue();

		if (playerCardSuit == curCardSuit){
			moveHistory();
			this.historyDeck.addCard(this.curCard);

			this.curCard = playerCard;
			return true;
		}
		if (playerCardValue == curCardValue){
			moveHistory();
			this.historyDeck.addCard(this.curCard);

			this.curCard = playerCard;
			return true;
		}
		return false;

	}





	private void moveHistory(){
		Card tempCard = this.historyDeck.takeCard(4);
		this.mainDeck.addCard(tempCard);
	}




}
