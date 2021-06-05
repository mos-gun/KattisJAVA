import java.util.Scanner;

public class Doorman {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numOfMaxDiff, numOfMen, numOfWomen;
		boolean jumped;
		char[] arrLine;

		numOfMaxDiff = Integer.parseInt(scanner.nextLine().trim());
		arrLine = scanner.nextLine().toCharArray();
		numOfMen = 0;
		numOfWomen = 0;
		jumped = false;

		for (int i = 0; i < arrLine.length; i++) {
			if (arrLine[i] == 'M') {
				if ((numOfMen - numOfWomen) == numOfMaxDiff) {
					if (! jumped) {
						if (arrLine[i + 1] == 'M') break;
						else jumped = true;
					}
				} else {
					numOfMen++;
					if (jumped) {
						numOfWomen++;
						jumped = false;
					}
				}
			} else {
				if ((numOfWomen - numOfMen) == numOfMaxDiff) {
					if (! jumped) {
						if (arrLine[i + 1] == 'W') break;
						else jumped = true;
					}
				} else {
					numOfWomen++;
					if (jumped) {
						numOfMen++;
						jumped = false;
					}
				}
			}
		}

		System.out.println(numOfMen + numOfWomen);
	}
}