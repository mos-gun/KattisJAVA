import java.util.Scanner;

public class CharacterDevelopment {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numOfCharacters;

		numOfCharacters = Integer.parseInt(scanner.nextLine().trim());
		if(numOfCharacters < 2) System.out.println(0);
		else System.out.println((int)(Math.pow(2, numOfCharacters)-numOfCharacters-1));
	}
}