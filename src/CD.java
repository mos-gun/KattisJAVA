import java.util.Arrays;

/**
 * Ausgewählte Probleme aus dem ACM Programming Contest  WS 2019/20
 * Problem:  cd CD
 * Link: https://open.kattis.com/problems/cd ;
 *
 * @author Mosgun Mahdere
 * @version 1.0, 11/08/2019
 * Method : none
 * Status : ACCEPTED
 * Runtime: 0.85s
 */
public class CD {
	public static void main(String[] args) {
		Kattio io = new Kattio(System.in, System.out);
		int n, m, counter;
		int[] arrCDs;

		while (true) {
			n = io.getInt();
			m = io.getInt();

			if (n == 0 && m == 0) break;
			arrCDs = new int[n];
			counter = 0;

			for (int i = 0; i < n; i++) {
				arrCDs[i] = io.getInt();
			}

			for (int i = 0; i < m; i++) {
				if(Arrays.binarySearch(arrCDs, io.getInt()) >= 0) counter++;
			}
			System.out.println(counter);
		}
	}
}