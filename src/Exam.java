import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numOfCorrect, lenOfInput, numOfOverlaps = 0, result;
		String person1, person2;

		numOfCorrect = Integer.parseInt(scanner.nextLine().trim());
		person1 = scanner.nextLine();
		person2 = scanner.nextLine();
		lenOfInput = person1.length();

		for (int i = 0; i < lenOfInput; i++) {
			if (person1.charAt(i) == person2.charAt(i)) numOfOverlaps++;
		}
		if (numOfCorrect <= numOfOverlaps) {
			result = numOfCorrect + (lenOfInput - numOfOverlaps);
		} else result = numOfOverlaps + (lenOfInput-numOfOverlaps-(numOfCorrect-numOfOverlaps));

		System.out.println(result);
	}
}