import java.util.Scanner;

public class Simon {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numOfCases;
		String line;
		String[] resultArray;

		numOfCases = Integer.parseInt(scanner.nextLine().trim());
		resultArray = new String[numOfCases];

		for (int i = 0; i < numOfCases; i++) {
			line = scanner.nextLine();
			if (line.startsWith("simon says ")) {
				resultArray[i] = line.replace("simon says ", "");
			} else {
				resultArray[i] = "";
			}
		}
		for (String element : resultArray) {
			System.out.println(element);
		}
	}
}