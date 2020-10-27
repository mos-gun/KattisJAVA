import java.util.HashMap;
import java.util.Scanner;

public class MasteringMastermind {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int lenOfCode, r, s;
		String code, guess;
		char[] arrCode, arrGuess;
		HashMap<Character, Integer> mapLettersAmmount;

		lenOfCode = scanner.nextInt();
		code = scanner.next();
		guess = scanner.next();
		arrCode = code.toCharArray();
		arrGuess = guess.toCharArray();
		r = 0;
		s = 0;
		mapLettersAmmount = new HashMap<>();

		for (int i = 0; i < lenOfCode; i++) {
			if (arrGuess[i] == arrCode[i]) {
				r++;
				arrGuess[i] = '-';
				arrCode[i] = '-';
			} else {
				if (mapLettersAmmount.containsKey(arrCode[i]))
					mapLettersAmmount.put(arrCode[i], mapLettersAmmount.get(arrCode[i]) + 1);
				else mapLettersAmmount.put(arrCode[i], 1);
			}
		}

		for (int i = 0; i < lenOfCode; i++) {
			if(arrGuess[i] != '-') {
				if(mapLettersAmmount.containsKey(arrGuess[i])) {
					s++;
					if(mapLettersAmmount.get(arrGuess[i]) == 1) mapLettersAmmount.remove(arrGuess[i]);
					else mapLettersAmmount.put(arrGuess[i], mapLettersAmmount.get(arrGuess[i])-1);
				}
			}
		}
		
		System.out.println(r + " " + s);
	}
}
