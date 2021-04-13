public class App {
	public static void main(String[] args) throws Exception {
		System.out.println("Hello, World!");

		
		MainGame_Uno game = new MainGame_Uno();


		Player newPlayer = new Player("James");
		game.addPlayer(newPlayer); 
		
		newPlayer = new Player("cris");
		game.addPlayer(newPlayer);

		game.dealAllPlayers(7);

		System.out.println("END");

	}
}
