import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class QuickBrownFox {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int numOfCases;
		ArrayList<String> alResultList = new ArrayList<>();

		numOfCases = Integer.parseInt(scanner.nextLine());

		for (int i = 0; i < numOfCases; i++) {
			String line;
			StringBuilder sbLine = new StringBuilder();
			StringBuilder sbMissing = new StringBuilder();
			sbMissing.append("missing ");
			boolean isPangram = true;
			boolean charsMissing = false;
			char charsMissingFrom = '+';

			sbLine.append(scanner.nextLine().toLowerCase());

			char[] arrLine = new char[sbLine.length()];

			sbLine.getChars(0, sbLine.length(), arrLine, 0);                    // String to char array
			Arrays.sort(arrLine);                                                                // sort char array

			sbLine = new StringBuilder();

			sbLine.append(arrLine[0]);                                                            // only unique to SB
			for (int j = 1; j < arrLine.length; j++) {
				if (arrLine[j] != arrLine[j - 1]) {
					sbLine.append(arrLine[j]);
				}
			}

			arrLine = new char[sbLine.length()];                                                // update char array
			sbLine.getChars(0, sbLine.length(), arrLine, 0);

			for (int j = 0; j < arrLine.length; j++) {
				if (arrLine[j] >= 'a') {
					line = sbLine.substring(sbLine.indexOf(String.valueOf(arrLine[j])));
					sbLine = new StringBuilder(line);
					break;
				}
			}

			arrLine = new char[sbLine.length()];
			sbLine.getChars(0, sbLine.length(), arrLine, 0);

//			System.out.println(sbLine);					// prints all unique, only letters of the alphabet

//			for (char element : arrLine) {				// same print as above, just with char array
//				System.out.print(element);
//			}

			for (char l = 'a', k = 0; l <= 'z'; l++) {
				if (arrLine[k] != l) {
					if (arrLine[k] > l) {
						isPangram = false;
						sbMissing.append(l);
					}
				} else k++;

				if (k == arrLine.length && l < 'z') {
					isPangram = false;
					charsMissing = true;
					l++;
					charsMissingFrom = l;
					break;
				}
			}

			if (charsMissingFrom != '+') {
				for (char l = charsMissingFrom; l <= 'z'; l++) {
					sbMissing.append(l);
				}
			}

			if (isPangram) alResultList.add("pangram");
			else alResultList.add(sbMissing.toString());
		}

		for (String element : alResultList) {
			System.out.println(element);
		}

	}

}
