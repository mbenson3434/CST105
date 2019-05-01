//Meghann Benson This is my work.

public class PalindromicPrimes {
	public static void main(String[] args) {
		// Initialize
		int count = 0; // Start at 0
		final int PP_PER_LINE = 4; // PrimePalindromes per line
		int number = 2; // number to start with iterating up to 100000
		// for the number starting at 2, when number is less than 10k, go to next number
		for (number = 2; number <= 100000; number++) {
			// if the number is prime and palindrome
			if (isPrime(number) && isPalindrome(number)) {
				// go to next primepalindrome
				count++;
				if (count % PP_PER_LINE == 0) {
					// align left with 10sp between and go to next line after 4
					System.out.printf("%-10s\n", number);
				} else
					System.out.printf("%-10s", number);
			}
		}

		/*
		 * TESTING THE LOOP System.out.println("PP to " + count + " are:");
		 * System.out.print(primeNumbersFound);
		 */

		/*
		 * TEST EACH METHOD System.out.println(isPrime(6));
		 * System.out.println(isPalindrome(100));
		 */

	} // Main Method Brace

	// This method finds prime numbers and returns true or false
	public static boolean isPrime(int number) {
		for (int divisor = 2; divisor <= number / 2; divisor++) {
			if (number % divisor == 0) {
				return false;
			}
		}
		return true;
	}

	// This method finds Palindromes and returns true or false
	public static boolean isPalindrome(int integer) {
		int palindrome = integer;
		int reverse = 0;

		while (palindrome != 0) {
			int remainder = palindrome % 10;
			reverse = reverse * 10 + remainder;
			palindrome = palindrome / 10;
		}

		return integer == reverse;
	}

}
