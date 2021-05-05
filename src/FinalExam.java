import java.util.Scanner;

public class FinalExam {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numOfQuestions, counterCorrectAnswers;
		char[] answers;

		numOfQuestions = Integer.parseInt(scanner.nextLine().trim());
		answers = new char[numOfQuestions];
		for (int i = 0; i < numOfQuestions; i++) {
			answers[i] = scanner.nextLine().charAt(0);
		}
		
		counterCorrectAnswers = 0;
		
		for (int i = 1; i < numOfQuestions; i++) {
			if(answers[i] == answers[i-1]) counterCorrectAnswers++;
		}

		System.out.println(counterCorrectAnswers);
	}
}
