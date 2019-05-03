import java.util.Collections;
import java.util.List;

public class GamePlay {
	public static void main(String[] args) {
		Deck myDeck = new Deck();
		Hand player = new Hand();
		Dealer deal = new Dealer();
		deal.dealCards(myDeck.theDeck(), player.player1Hand(), 7);
		deal.dealCards(myDeck.theDeck(), player.player2Hand(), 7);
		deal.dealCards(myDeck.theDeck(), player.player3Hand(), 7);
		deal.dealCards(myDeck.theDeck(), player.player4Hand(), 7);
		deal.dealCards(myDeck.theDeck(), player.discard(), 1);
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
		myDeck.printDeck(myDeck.theDeck);
		
		
	} // MAIN METHOD
} // CLASS
