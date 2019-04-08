//Meghann Benson this is my work.

import java.util.Scanner;
import java.util.Random;
public class GuessingGame {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		Random randomNumber = new Random();
		int random = randomNumber.nextInt(10000);
		int yourGuess = 0;
		int count = 0;
		
		System.out.println("Random number is " + random);
		System.out.print("Guess a number between 1 and 10000: ");
		
		while (yourGuess != random) {
			
			yourGuess = keyboard.nextInt();
			count++;
			
			if (yourGuess < random) {
				System.out.println("HIGHER");
			}
			else if (yourGuess > random) {
				System.out.println("LOWER");
			}
			else if (yourGuess == random) {
				System.out.println("WINNER! Number of tries: " + count);
			}
		}
		keyboard.close();
	}
}
