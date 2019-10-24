import java.util.Arrays;
import java.util.Scanner;

public class MissingNumbers {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int numOfLines;
		String output = "";

		numOfLines = scanner.nextInt();
		int[] arrNumbers = new int[numOfLines];

		for (int i = 0; i < arrNumbers.length; i++) {
			arrNumbers[i] = scanner.nextInt();
		}
		Arrays.sort(arrNumbers);

		for (int i = 0, j=1; i < arrNumbers.length; i++, j++) {
			if (arrNumbers[i] != j) {
				output += j + "\n";
				i--;
			}
		}
		if (output.equals("")) System.out.println("good job");
		else System.out.println(output);
	}
}