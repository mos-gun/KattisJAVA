import java.util.Arrays;
import java.util.Scanner;

public class BasketballOneOnOne {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[] line;
		int scoreA, scoreB;
		char winner;

		line = scanner.nextLine().toCharArray();
		scoreA = 0;
		scoreB = 0;
		winner = '-';

		for (int i = 0; i < line.length; i += 2) {
			if (line[i] == 'A') scoreA += Character.getNumericValue(line[i + 1]);
			else scoreB += Character.getNumericValue(line[i + 1]);

			if (scoreA >= 11 && scoreB < 10) {
				winner = 'A';
				break;
			}
			if (scoreB >= 11 && scoreA < 10) {
				winner = 'B';
				break;
			}

			if (scoreA >= 10 && scoreB >= 10) {
				if(scoreA - scoreB >= 2) {
					winner = 'A';
					break;
				}
				if(scoreB - scoreA >= 2) {
					winner = 'B';
					break;
				}
			}
		}
		System.out.println(winner);
	}
}