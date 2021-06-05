import java.util.*;

public class SidewaysSorting {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numOfLines, numOfChars;
		char[][] arrLines, arrVerticalLines, arrFinalLines;
		char[] arrTemp;
		List<String> listNewLines;

		while ((numOfLines = scanner.nextInt()) != 0 && (numOfChars = scanner.nextInt()) != 0) {
			scanner.nextLine();
			arrLines = new char[numOfLines][numOfChars];
			arrVerticalLines = new char[numOfChars][numOfLines];        //oppsite of arrLines (rows=colums & vice versa)
			listNewLines = new LinkedList<>();
			arrFinalLines = new char[numOfLines][numOfChars];

			for (int i = 0; i < numOfLines; i++) {
				arrLines[i] = scanner.nextLine().toCharArray();
				for (int j = 0; j < numOfChars; j++) {
					arrVerticalLines[j][i] = arrLines[i][j];
				}
			}

			for (char[] line : arrVerticalLines) {
				listNewLines.add(String.valueOf(line));
			}
			listNewLines.sort(String.CASE_INSENSITIVE_ORDER);

			for (int i = 0; i < numOfChars; i++) {
				arrTemp = listNewLines.get(i).toCharArray();
				for (int j = 0; j < numOfLines; j++) {
					arrFinalLines[j][i] = arrTemp[j];
				}
			}

			for (char[] line : arrFinalLines) {
				System.out.println(String.valueOf(line));
			}
			System.out.println();
		}
	}
}