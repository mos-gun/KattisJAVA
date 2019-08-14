import java.util.Arrays;
import java.util.Scanner;

public class BusNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numOfBuses, valueOne, valueTwo, counter;
		int[] valueArray;
		StringBuilder sb = new StringBuilder();

		numOfBuses = scanner.nextInt();
		valueArray = new int[numOfBuses];

		for (int i = 0; i < numOfBuses; i++) {
			valueArray[i] = scanner.nextInt();
		}

		Arrays.sort(valueArray);

		for (int i = 0; i < valueArray.length; i++) {
			counter = 0;
			if (i != valueArray.length - 1 && valueArray[i] == valueArray[i + 1] - 1) {
				valueOne = valueArray[i];
				valueTwo = valueArray[i + 1];
				counter++;

				for (int j = i + 2; j < valueArray.length; j++) {
					if (valueTwo == valueArray[j] - 1) {
						valueTwo = valueArray[j];
						counter++;
						i = j - 1;
					} else {
						i = j - 1;
						break;
					}
				}

				if (counter > 1) {
					sb.append(valueOne + "-" + valueTwo + " ");
				} else {
					sb.append(valueOne + " " + valueTwo + " ");
				}
			} else {
				if (! sb.toString().contains(Integer.toString(valueArray[i]))) {
					sb.append(valueArray[i] + " ");
				}
			}
		}
		System.out.println(sb.toString());
	}
}