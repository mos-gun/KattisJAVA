import java.util.Scanner;

public class SumOfTheOthers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] arrNumbersAsStrings;
		int[] arrNumbers;
		int possibleSum, calculatedSum;

		while(scanner.hasNext()) {
			arrNumbersAsStrings = scanner.nextLine().split(" ");				// directly to int, not string first
			arrNumbers = new int[arrNumbersAsStrings.length];

			for (int i=0; i<arrNumbersAsStrings.length; i++) {
				arrNumbers[i] = Integer.parseInt(arrNumbersAsStrings[i]);
			}

			for (int i = 0; i < arrNumbers.length; i++) {
				possibleSum = arrNumbers[i];
				calculatedSum = 0;
				for (int j = 0; j < arrNumbers.length; j++) {
					if(j!=i) {
						calculatedSum += arrNumbers[j];
					}
				}
				
				if(possibleSum == calculatedSum) {
					System.out.println(possibleSum);
					break;
				}
			}
		}
	}
}