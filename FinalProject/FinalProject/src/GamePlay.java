import java.util.ArrayList;
import java.util.List;

// Meg Benson This is my work.

public class GamePlay {
	public static void main(String[] args) {
		Deck myDeck = new Deck();
		Hand player = new Hand();
		Dealer deal = new Dealer();
		List<Card> startingDeck = new ArrayList<Card>();
		//Shuffle the brand new deck
		startingDeck = deal.shuffleOriginalDeck(myDeck.theDeck());
		for (int i = 0; i < startingDeck.size(); i++) {
			if(i % 7 == 0) {
				System.out.println(startingDeck.get(i).getColor() + startingDeck.get(i).getNumber() + "  ");
			}
			else
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
		
		
		

		// while all 4 of the players have cards in their hands
		while (player.player1Hand().size() != 0 && player.player2Hand().size() != 0 && player.player3Hand().size() != 0
				&& player.player4Hand().size() != 0) {
			System.out.println("Game in session");
			// making sure the deck has enough cards to play the next hand.
			if (startingDeck.size() >= 4) {
				System.out.println("Deck has enough cards");
				break;
			// Shuffle the discard pile and return the the deck if not, and deal 1 card to discard pile
			} else {
				System.out.println("Shuffling Discard Pile...");
				deal.shuffleDiscardPile(player.discard(), startingDeck);
				deal.dealCards(startingDeck, player.discard(), 1);
			}
			
		}
	} // MAIN METHOD

} // CLASS
