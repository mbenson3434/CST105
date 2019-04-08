//Meghann Benson this is my work.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class PigLatinTranslator {

	public static void main(String[] args) throws FileNotFoundException {

		//the main is reading from the text file and converting it into a string
		String fileName = "pigLatin1.txt";
		File textFile = new File(fileName);
		@SuppressWarnings("resource")
		Scanner input = new Scanner(textFile);
		String string = input.nextLine(); //convert text file to string
		
		// Pulling the final result from the other classes and printing them to the screen
		String pigLatin = convert(string);
		System.out.println(pigLatin);	
		
	}
	
	private static String convert(String s) {
		String pigLatin = " ";
		int i = 0;
		while (i<s.length()) {
			while (i<s.length() && !isLetter(s.charAt(i))) {
				pigLatin = pigLatin + s.charAt(i);
				i++;
			}
			
			if (i>s.length()) break;
			
			int begin = i;
			while (i<s.length() && isLetter(s.charAt(i))) {
				i++;
			}
			
			int end = i;
			pigLatin = pigLatin + eachWord(s.substring(begin, end));
		}
		return pigLatin;
	}
		
	private static boolean isLetter(char c) {
		return ( ( c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') );
	}
		
	
	private static String eachWord(String word) {
		int split = firstVowel(word);
		//word = word.toUpperCase();
		
		if (word.charAt(0) == 'A' || word.charAt(0) == 'a' || 
		    word.charAt(0) == 'E' || word.charAt(0) == 'e' ||
		    word.charAt(0) == 'I' || word.charAt(0) == 'i' || 
		    word.charAt(0) == 'O' || word.charAt(0) == 'o' ||
		    word.charAt(0) == 'U' || word.charAt(0) == 'u')
		    
		   return word + "\t\t" + word.toUpperCase() + "WAY\n";
		else		
		return word + "\t\t" + word.substring(split).toUpperCase() + word.substring(0, split).toUpperCase() + "AY\n";
	}
			
	private static int firstVowel(String word) {
		word = word.toUpperCase();
		for (int i=0; i<word.length(); i++)
			if (word.charAt(i) == 'A' || word.charAt(i) == 'E' || 
			    word.charAt(i) == 'I' || word.charAt(i) == 'U' ||
			    word.charAt(i) == 'O')
			  return i;
			return 0;
	}
	
	
	
	
}
	
	