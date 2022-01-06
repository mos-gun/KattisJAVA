import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class AnIForAnEye {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[] arrChars = new char[] {'@','&', '1', '2', '4', 'b', 'c', 'i', 'o', 'r', 'u', 'y'};
		HashMap<String, Character> mapWordsSubstitutes = new HashMap<String, Character>() {
			{
				put("at", '@');
				put("and", '&');
				put("one", '1'); put("won", '1');
				put("to", '2'); put("too", '2'); put("two", '2');
				put("for", '4'); put("four", '4');
				put("bea", 'b'); put("be", 'b'); put("bee", 'b');
				put("sea", 'c'); put("see", 'c');
				put("eye", 'i');
				put("oh", 'o'); put("owe", 'o');
				put("are", 'r');
				put("you", 'u');
				put("why", 'y');
			}
		};
		int numOfLines;
		String line;
		
		numOfLines = Integer.parseInt(scanner.nextLine().trim());
		for (int i = 0; i < numOfLines; i++) {
			line = scanner.nextLine();
			
		}

	}

	
}
