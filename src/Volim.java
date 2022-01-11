import java.util.Scanner;

public class Volim {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int playerWithBomb, numOfQuestions, timeRemainingInSec;
		int[] arrAnswersTime;
		char[] arrAnswersSymbol;
		
		playerWithBomb = Integer.parseInt(scanner.nextLine().trim());
		numOfQuestions = Integer.parseInt(scanner.nextLine().trim());
		arrAnswersTime = new int[numOfQuestions];
		arrAnswersSymbol = new char[numOfQuestions];
		timeRemainingInSec = 210;
		
		for (int i = 0; i < numOfQuestions; i++) {
			arrAnswersTime[i] = scanner.nextInt();
			arrAnswersSymbol[i] = scanner.next().charAt(0);
		}

		for (int i = 0; i < numOfQuestions; i++) {
			if (timeRemainingInSec - arrAnswersTime[i] <= 0) break;
			else {
				timeRemainingInSec -= arrAnswersTime[i];
				if(arrAnswersSymbol[i] == 'T') {
					if(playerWithBomb == 8) playerWithBomb = 1;
					else playerWithBomb++;
				}
			}
		}

		System.out.println(playerWithBomb);

	}
}
