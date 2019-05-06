import java.util.ArrayList;
import java.util.List;
/*
 * Meghann Benson This is my work
 * This class defines the players in a simple list
 */
public class Player {

	List<Integer> playerList = new ArrayList<Integer>();
	Hand hand = new Hand();

	public List<Integer> players() {

		playerList.add(0);
		playerList.add(1);
		playerList.add(2);
		playerList.add(3);
		return playerList;
	}


	
	/*
	 * reverseOrder reverses the order of play
	 */
	public void reverseOrder(int currentPlayer) {
		currentPlayer--;
	}
}
