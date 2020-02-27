import java.util.Scanner;

/**
 * Ausgewählte Probleme aus dem ACM Programming Contest  WS 2019/20
 * Problem:  coast Coast Length
 * Link: https://open.kattis.com/problems/coast ;
 *
 * @author Mosgun Mahdere
 * @version 1.0, 11/24/2019
 * Method : none
 * Status : Tried (Wrong Answer)
 * Runtime: 0.13s (not final speed because of error)
 */
public class CoastLength {

	private static char[][] arrMap;
	private static int l, w;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum;
		boolean convertFromLeftDone, convertFromRightDone, isSurroundedByLand;

		l = scanner.nextInt();
		w = scanner.nextInt();
		scanner.nextLine();
		arrMap = new char[l][w];
		sum = 0;

		for (int i = 0; i < l; i++) {                                                  // fill map with water/land marks
			arrMap[i] = scanner.nextLine().toCharArray();
		}

		for (int i = 0; i < l; i++) {
			convertFromLeftDone = false;
			convertFromRightDone = false;

			for (int j = 0; j < w; j++) {                                         // mark water outside of land with '-'
				if (! convertFromLeftDone) {
					if (arrMap[i][j] == '0') arrMap[i][j] = '-';
					else convertFromLeftDone = true;
				}
				if (! convertFromRightDone) {
					if (arrMap[i][(w - 1) - j] == '0') arrMap[i][(w - 1) - j] = '-';
					else convertFromRightDone = true;
				}

				if (convertFromLeftDone && convertFromRightDone) break;
			}
		}

		isSurroundedByLand = true;
		
		for (int i = 0; i < l; i++) {                                    // calculate result (length of the coast in km)
			for (int j = 0; j < w; j++) {
				if (arrMap[i][j] == '1') {
					sum += calcBorders(i, j);
				}
			}
		}

		for (int i = 0; i < l; i++) {                                    // calculate result (length of the coast in km)
			for (int j = 0; j < w; j++) {
				System.out.print(arrMap[i][j]);
			}
			System.out.println();
		}

		System.out.println(sum);                                              // output: total length of the coast in km
	}


	private static int calcBorders(int y, int x) {                                  // method for calculating the length
		int num = 0;                                                                // of the coast for one box
		boolean leftDone, rightDone, upDone, downDone;
		leftDone = rightDone = upDone = downDone = false;

		if (y == 0) {                                                    // if box top border
			num++;
			upDone = true;
		}
		if (x == 0) {                                                    // if box left border
			num++;
			leftDone = true;
		}
		if (y == l - 1) {                                                // if box bottom border
			num++;
			downDone = true;
		}
		if (x == w - 1) {                                                // if box right border
			num++;
			rightDone = true;
		}

		if (! upDone) {
			if (arrMap[y - 1][x] == '-') num++;
		}
		if (! leftDone) {
			if (arrMap[y][x - 1] == '-') num++;
		}
		if (! downDone) {
			if (arrMap[y + 1][x] == '-') num++;
		}
		if (! rightDone) {
			if (arrMap[y][x + 1] == '-') num++;
		}

		return num;
	}
}

