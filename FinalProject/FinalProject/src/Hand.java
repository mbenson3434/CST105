import java.util.ArrayList;
import java.util.List;

public class Hand {

	List<Card> player1 = new ArrayList<Card>();
	List<Card> player2 = new ArrayList<Card>();
	List<Card> player3 = new ArrayList<Card>();
	List<Card> player4 = new ArrayList<Card>();
	List<Card> discardPile = new ArrayList<Card>();
	
	public List<Card> player1Hand() {
		return player1;
	}

	public List<Card> player2Hand() {
		return player2;
	}

	public List<Card> player3Hand() {
		return player3;
	}

	public List<Card> player4Hand() {
		return player4;
	}
	
	public List<Card> discard() {
		return discardPile;
	}

	public List<Card> printHand(List<Card> playerHand) {
		final int CARDS_PER_LINE = 6;
		for (int i = 0; i < playerHand.size(); i++) {
			if(i % CARDS_PER_LINE == 0) {
				System.out.println(playerHand.get(i).getColor() + playerHand.get(i).getNumber() + "  ");
			}
			else
				System.out.print(playerHand.get(i).getColor() + playerHand.get(i).getNumber() + "  ");
		}
		return playerHand;

	}

}
