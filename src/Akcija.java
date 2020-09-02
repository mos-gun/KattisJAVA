import java.util.Arrays;
import java.util.Scanner;

public class Akcija {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int numOfBooks, minimalPrice;
		int[] arrPrices;

		numOfBooks = Integer.parseInt(scanner.nextLine().trim());
		arrPrices = new int[numOfBooks];

		for (int i = 0; i < numOfBooks; i++) {
			arrPrices[i] = Integer.parseInt(scanner.nextLine().trim());
		}

		minimalPrice = calcMinimalPrice(arrPrices);
		System.out.println(minimalPrice);
	}

	
	private static int calcMinimalPrice(int[] arrPrices) {
		int minimalPrice = 0;

		Arrays.sort(arrPrices);
		if (arrPrices.length % 3 == 0) {
			for (int i = 0; i < arrPrices.length; i++) {
				if(i % 3 != 0) minimalPrice += arrPrices[i];
			}
		} else {
			for (int i = arrPrices.length - 1; i >= 0; i--) {
				if(i-2 > -1) {
					minimalPrice += arrPrices[i];
					minimalPrice += arrPrices[i-1];
					i -= 2;
				} else {
					minimalPrice += arrPrices[i];
				}
			}
		}

		return minimalPrice;
	}
}
