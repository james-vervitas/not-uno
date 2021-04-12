public class App {
	public static void main(String[] args) throws Exception {
		System.out.println("Hello, World!");

		Deck deck = new Deck().fullDeck();
		

		Player p1 = new Player("james", 2);
		deck.shuffelCards();
		deck.dealCards(p1,7);

		System.out.println(10);

	}
}
