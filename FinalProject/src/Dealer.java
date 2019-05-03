import java.util.List;

public class Dealer {

	Deck myDeck = new Deck();
	Hand playerHand = new Hand();
	int numOfCards;
	
	public List<Card> dealCards(List<Card> myDeck, List<Card> playerHand, int numOfCards) {
		for(int i = 0; i < numOfCards; i++) {
			playerHand.add(myDeck.get(0));
			myDeck.remove(0);
		}
		return myDeck;
	}
	
	
}
