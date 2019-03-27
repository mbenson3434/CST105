/* Meghann Benson this is my work.
 * Exercise 2, #1
*/

import java.util.Scanner; // Imports scanner class from api.
public class CalcDigits { 

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); // Names keyboard because System.in always is keyboard.
		
		System.out.println("Please enter a five digit positive integer: "); // Prompt for user input.

		
		int num = keyboard.nextInt(); // This is the user input number.
		int first  =  num % 10;
		int second =  ( num - first ) % 100 / 10;
		int third  =  ( num - first - second ) % 1000 / 100;
		int fourth =  ( num - first - second - third ) % 10000 / 1000;
		int fifth =  ( num - first - second - third - fourth ) % 100000 / 10000;
		int sum = first + second + third + fourth + fifth;
		
		/* These calculations can be done with less writing but extrapolating each 
		 * individual digit to print in the correct order was difficult without using
		 * more complicated java classes. If I were only adding the digits I would do this:
		 * Scanner keyboard = new Scanner(System.in);
		
			System.out.println("Enter five digit positive integer: ");
		
			int number = keyboard.nextInt();
		
			int sum = 0;
			while (number > 0) {
			
				int add = number % 10;
				sum = sum + add;
				number = number / 10;
			}
				System.out.print("The sum of the number is " + sum);
				
			keyboard.close();	
		 */
				
				
		System.out.print("The sum of the number " + fifth + " + " + fourth + " + " + 
				third + " + " + second + " + " + first + " = " + sum);
		
		keyboard.close(); // I use this to stop the error when using the Scanner.
	}
}
