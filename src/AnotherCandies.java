import java.util.Scanner;

public class AnotherCandies {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numOfCases, numOfChildren, numOfCandies;

		numOfCases = Integer.parseInt(scanner.nextLine());
		scanner.nextLine();

		for (int i = 0; i < numOfCases; i++) {
			numOfChildren = Integer.parseInt(scanner.nextLine());
			numOfCandies = 0;

			for (int j = 0; j < numOfChildren; j++) {
				numOfCandies += Integer.parseInt(scanner.nextLine());
			}

			if(numOfCandies % numOfChildren == 0) System.out.println("YES");
			else System.out.println("NO");

			if(i != numOfCases-1) scanner.nextLine();
		}
	}
}