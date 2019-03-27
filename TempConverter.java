/*Meg Benson this is my work
 *Converting temperature from fahrenheit to celcius
 *and celcius to fahrenheit.
 */
import java.util.Scanner;
public class TempConverter {
	public static void main(String[] args) {
		
		// Initializing the scanner object
		Scanner keyboard = new Scanner(System.in); 
		// User prompt
		System.out.print("Please enter degrees fahrenheit: ");
		// Double to calculate decimals
		double degrees1 = keyboard.nextDouble();
		double fahrenheit = ((degrees1 - 32) * 5) / 9;
		System.out.print(degrees1 + "F is equivalent to ");
		System.out.println(fahrenheit + "C");
		
		System.out.print("Please enter degrees celcius: ");
		double degrees2 = keyboard.nextDouble();
		double celcius = ((degrees2 * 9) / 5) + 32;
		System.out.print(degrees2 + "C is equivalent to ");
		System.out.println(celcius + "F");
		
		keyboard.close();
	}
}
