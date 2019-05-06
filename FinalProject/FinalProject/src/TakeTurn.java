import java.util.ArrayList;
import java.util.List;

/*
 * Meghann Benson This is my work.
 * The TakeTurn loops through the players until one player has 0 cards
 */
public class TakeTurn {
	Deck myDeck = new Deck();
	Hand player = new Hand();
	Dealer deal = new Dealer();
	Player play = new Player();
	// start playerCount at 0
	int playerCount = 0;

	// This method deals the first hand and plays a whole turn of the game.
	public void playGame(List<Card> currentPlayerHand) {
		List<Card> startingDeck = new ArrayList<Card>();
		// Shuffle the brand new deck
		startingDeck = deal.shuffleOriginalDeck(myDeck.theDeck());
		for (int i = 0; i < startingDeck.size(); i++) {
			if (i % 7 == 0) {
				System.out.println(startingDeck.get(i).getColor() + startingDeck.get(i).getNumber() + "  ");
			} else
				System.out.print(startingDeck.get(i).getColor() + startingDeck.get(i).getNumber() + "  ");
		}
		System.out.println();
		System.out.println();

		// Deal the cards
		deal.dealCards(startingDeck, player.player1Hand(), 7);
		deal.dealCards(startingDeck, player.player2Hand(), 7);
		deal.dealCards(startingDeck, player.player3Hand(), 7);
		deal.dealCards(startingDeck, player.player4Hand(), 7);
		deal.dealCards(startingDeck, player.discard(), 1);
		// Print the cards
		System.out.println("Player 1 Hand: ");
		player.printHand(player.player1Hand());
		System.out.println();
		System.out.println("Player 2 Hand: ");
		player.printHand(player.player2Hand());
		System.out.println();
		System.out.println("Player 3 Hand: ");
		player.printHand(player.player3Hand());
		System.out.println();
		System.out.println("Player 4 Hand: ");
		player.printHand(player.player4Hand());
		System.out.println();
		System.out.println("Discard Pile: ");
		player.printHand(player.discard());
		System.out.println();
		
		System.out.println();
		myDeck.printDeck(startingDeck);
		// Test System.out.println(player.discard().get(0).getNumber());
		// Test System.out.println(player.discard().size());
		// Test System.out.println(startingDeck.size());

		// while all 4 of the players have cards in their hands
		for (int playerCount = 0; playerCount < 4; playerCount++) {
			//while (player.player1Hand().size() != 0 && player.player2Hand().size() != 0
			//		&& player.player3Hand().size() != 0 && player.player4Hand().size() != 0) {
				System.out.println(player.printHand(currentPlayerHand));
				System.out.println("Game in session");
				// making sure the deck has enough cards to play the next hand.
				if (startingDeck.size() >= 4) {
					System.out.println("Deck has enough cards");
					// Shuffle the discard pile and return the the deck if not, and deal 1 card to
					// discard pile
				}
				if (startingDeck.size() < 4) {
					System.out.println("Shuffling Discard Pile...");
					deal.shuffleDiscardPile(player.discard(), startingDeck);
					deal.dealCards(startingDeck, player.discard(), 1);
				}
				if (player.discard().get(0).getNumber().equals("skip")) {
				//if (player.discard().get(0).getNumber().equals("skip")) {
					System.out.println("You are skipped");
					playerCount++;
					
				}

				if (player.discard().get(0).getNumber().equals("reverse")) {
					System.out.println("Reverse");
					play.reverseOrder(playerCount);
					playerCount++;
				}

				if (player.discard().get(0).getNumber().equals("drawtwo")) {
					System.out.println("Draw two");
					deal.dealCards(startingDeck, currentPlayerHand, 2);
					System.out.println(currentPlayerHand);
					playerCount++;
				}
					//Bug here - wont exchange cards in arrayLists.
				if (player.discard().get(0).getNumber().equals("wild")) {
					System.out.println("Wild Card");
					for(int i = 0; i < currentPlayerHand.size(); i++) {
					player.discard().add(currentPlayerHand.get(i));
					currentPlayerHand.remove(i);
					}
					playerCount++;
				}

				if (player.discard().get(0).getNumber().equals("wilddraw")) {
					System.out.println("Draw four");
					deal.dealCards(startingDeck, currentPlayerHand, 4);
					playerCount++;
				}

				
				if (player.discard().get(0).getNumber().equals("zero") ||
					player.discard().get(0).getNumber().equals("one") || 
					player.discard().get(0).getNumber().equals("two") ||
					player.discard().get(0).getNumber().equals("three") ||
					player.discard().get(0).getNumber().equals("four") ||
					player.discard().get(0).getNumber().equals("five") ||
					player.discard().get(0).getNumber().equals("six") ||
					player.discard().get(0).getNumber().equals("seven") ||
					player.discard().get(0).getNumber().equals("eight") ||
					player.discard().get(0).getNumber().equals("nine")) {
					System.out.println("Finding a match");
					cardMatches(currentPlayerHand, player.discard());
					playerCount++;
					break;
				}	
				if (player.player1Hand().size() == 1 || player.player2Hand().size() == 1
						|| player.player3Hand().size() == 1 || player.player4Hand().size() == 1) {
					System.out.println("UNO");
					
				}
				System.out.println("Player 1 Hand: ");
				player.printHand(player.player1Hand());
				System.out.println();
				System.out.println("Player 2 Hand: ");
				player.printHand(player.player2Hand());
				System.out.println();
				System.out.println("Player 3 Hand: ");
				player.printHand(player.player3Hand());
				System.out.println();
				System.out.println("Player 4 Hand: ");
				player.printHand(player.player4Hand());
				System.out.println();
				System.out.println("Discard Pile: ");
				player.printHand(player.discard());
				System.out.println();
			}
		}
	//}
	/*
	 *  cardMatches decides if any attributes of two cards match and moves the
	 *  matching card to the discard pile. *There is a bug in this method because
	 *  it will not switch the cards. *** 
	 */
	public boolean cardMatches(List<Card> hand, List<Card> discardPile) {
		for (int i = 0; i < hand.size(); i++) {
			if  (hand.get(i).getColor().equals(discardPile.get(0).getColor()) ||
				(hand.get(i).getNumber().equals(discardPile.get(0).getNumber()))) {
				discardPile.add(hand.get(i));
				hand.remove(i);
			}
		}
		return false;
	}
	/*
	 * This method should take the playerCount as an argument and use it to return a specific 
	 * hand. Once the player count gets to 4, count should return to 0. 
	 */
	public List<Card> whichPlayer(int playerCount) {
		if (playerCount == 0) {
			System.out.println("P1");
			return player.player1Hand(); 
		}
		if (playerCount == 1) {
			System.out.println("P2");
			return player.player2Hand();
		}
		if (playerCount == 2) {
			System.out.println("P3");
			return player.player3Hand();
		}
		if (playerCount == 3) {
			System.out.println("P4");
			return player.player4Hand();
		}
		if (playerCount == 4) {
			playerCount = 0;
		}
		return null;
	}
}
