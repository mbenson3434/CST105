/*
 * Meghann Benson This is my work.
 * Card class defines a card object with two attributes. Also contains
 * getters and setters for card color and number.
 */
public class Card {

	private String color;
	private String number;

	public String getColor() {
		return this.color;
	}

	public String getNumber() {
		return this.number;
	}

	public boolean setColor(String color) {
		this.color = color;
		return true;
	}

	public boolean setNumber(String number) {
		this.number = number;
		return true;
	}
	
	
}

