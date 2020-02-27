import java.util.Scanner;

public class SymmetricOrder {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numOfNames, counter;
		String[] arrNames = null;

		counter = 1;
		while (true) {
			numOfNames = Integer.parseInt(scanner.nextLine().trim());
			if (numOfNames == 0) break;

			arrNames = new String[numOfNames];

			for (int i = 0; i < numOfNames / 2; i++) {
				arrNames[i] = scanner.nextLine();
				arrNames[numOfNames - 1 - i] = scanner.nextLine();
			}
			if (numOfNames % 2 != 0) arrNames[numOfNames / 2] = scanner.nextLine();

			System.out.println("SET " + counter);
			for (String name : arrNames) System.out.println(name);

			counter++;
		}
	}
}
