//Meghann Benson this is my work.
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
// Class
public class TwoDArray { 
	// Main method
	public static void main(String[] args) throws FileNotFoundException  {
		// initializing the size of the row and columns for the char array
		int row = 6;
		int column = 7;
		// Created a new variable to store the string from the file
		String string = startConfig();
		char[][] boardArray = new char[row][column]; // This like initializes the char array
		int offset = 0; // this is a counter
		// Loop that places the characters one at a time into the 6x7 array. 
		for (int r = 0; r < row; r++) {
			for (int c = 0; c < column; c++) {
				boardArray[r][c] = string.charAt(offset++);
				System.out.print(boardArray[r][c] + " "); //prints array with spaces between characters
			}
			System.out.println(); //prints another line
		}
		// This loop calls the information in column major order out of the array
		// above and displays it as a string. 
		for (int c = 0; c < boardArray[0].length; c++) {
			for (int r = 0; r < boardArray.length; r++) {
				System.out.print(boardArray[r][c]);
			}
		}
	}

	// This method feeds the file contents as a string
	// to the main method
	public static String startConfig() throws FileNotFoundException {

		File file = new File("ex5practice.txt");
		Scanner s = new Scanner(file);
		String str = s.nextLine();
		// System.out.println(str);
		s.close();
		return str;
	}

}


		
		
		


