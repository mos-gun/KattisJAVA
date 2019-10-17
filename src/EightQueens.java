import java.util.Arrays;
import java.util.Scanner;

public class EightQueens {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[][] arrBoard = new char[8][8];
		char[] arrTempChar;
		int[] arrTempInt;
		int[] arrRowsCols = new int[8];
		boolean isValid = true;
		String line;
		int counter;


		for (int i = 0; i < 8; i++) {
			line = scanner.nextLine();

			arrBoard[i] = line.toCharArray();
			arrTempChar = Arrays.copyOf(arrBoard[i], 8);                            //check horizontally
			Arrays.sort(arrTempChar);
			if (arrTempChar[1] == '*') {
				isValid = false;
				arrRowsCols[i] = - 1;
			} else {
				arrRowsCols[i] = line.indexOf('*');
			}
		}

		if (isValid) {

			arrTempInt = Arrays.copyOf(arrRowsCols, 8);                            // check vertically
			Arrays.sort(arrTempInt);

			for (int i = 1; i < 8; i++) {
				if (arrTempInt[i] == arrTempInt[i - 1]) {
					isValid = false;
					break;
				}
			}
			

			if (isValid) {

				for (int i = 0; i < 8; i++) {

					for (int j = arrRowsCols[i]; j < 8; j++) {

						try {
							if (arrBoard[j + 1][arrRowsCols[i] + 1] == '*') {
								isValid = false;
								break;
							}
						} catch (ArrayIndexOutOfBoundsException e) {
							System.out.println("outofbounds ex");
						}

					}

				}

				
				
				
				if (isValid) {
					System.out.println("valid");
				} else System.out.println("invalid");
			} else System.out.println("invalid");

		} else System.out.println("invalid");


		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				System.out.print(arrBoard[i][j]);
			}
			System.out.println();
		}

		for (int i = 0; i < 8; i++) {
			System.out.println(i + " " + arrRowsCols[i]);
		}
	}

}
