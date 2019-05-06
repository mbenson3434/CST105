/* 
 * Meghann Benson This is my work.
 * This program plays a game of UNO with computer players in console.
 * GamePlay class initializes the game.
 */

public class GamePlay {
	// Main Method
	public static void main(String[] args) {
		
		TakeTurn beginGame = new TakeTurn();
		int playerCount = 0;
		beginGame.playGame(beginGame.whichPlayer(playerCount));
		
		
		/*
		 * TEST
		 * Player play = new Player();
		 * Hand hand = new Hand();
		 * beginGame.playGame(hand.player1Hand());
		 */
		
		
		
	} // MAIN METHOD
} // CLASS
