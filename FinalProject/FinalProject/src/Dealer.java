import java.util.Collections;
import java.util.List;
/*
 * Meghann Benson This is my work.
 * Dealer class has methods specific to dealers
 */
public class Dealer {

	Deck myDeck = new Deck();
	Hand playerHand = new Hand();
	int numOfCards;
	/*
	 * dealCards takes the deck, and player hand, and deals the appropriate
	 * number of cards and transfers the cards to each hand. 
	 */
	public List<Card> dealCards(List<Card> myDeck, List<Card> playerHand, int numOfCards) {
		for(int i = 0; i < numOfCards; i++) {
			playerHand.add(myDeck.get(0));
			myDeck.remove(0);
		}
		return myDeck;
	}
	/*
	 * Shuffles the ordered deck.
	 */
	public List<Card> shuffleOriginalDeck (List <Card> originalDeck) {
		Collections.shuffle(originalDeck);
		return originalDeck;
		
	}
	/*
	 * Shuffles discard pile when the deck runs out and puts the cards back in
	 * the deck
	 */
	public List<Card> shuffleDiscardPile(List<Card> discardPile, List<Card> drawPile) {
		for(int i = 0; i < drawPile.size(); i++) {
			drawPile.addAll(discardPile);
			discardPile.removeAll(drawPile);
			Collections.shuffle(drawPile);
		}
		return drawPile;
	}
}
