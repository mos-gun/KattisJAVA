import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class StackingCups {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numOfCups;
		String line, tmpString;
		String[][] cups;
		int num;

		numOfCups = scanner.nextInt();
		scanner.nextLine();
//		numOfCups = Integer.parseInt(scanner.nextLine());		//alternative to above scanning

		cups = new String[numOfCups][2];

		for (int i = 0; i < numOfCups; i++) {
			line = scanner.nextLine();
			cups[i][0] = line.substring(0, line.indexOf(' '));
			cups[i][1] = line.substring(line.indexOf(' ') + 1);

			try {
				num = Integer.parseInt(cups[i][0]);
				num /= 2;
				tmpString = cups[i][1];
				cups[i][1] = Integer.toString(num);
				cups[i][0] = tmpString;

			} catch (NumberFormatException e) {
				// Nothing
			}


		}

		Arrays.sort(cups, Comparator.comparingInt(a -> Integer.parseInt(a[1])));
		// alternative to Arrays.sort() above
//		Arrays.sort(cups, (a, b) -> Integer.compare(Integer.parseInt(a[1]), Integer.parseInt(b[1])));


		for (String[] cup : cups) {
			System.out.println(cup[0]);
		}
	}
}
