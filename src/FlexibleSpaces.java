import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class FlexibleSpaces {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int totalWidth, numOfPartitions;
		int[] arrPartitions;
		SortedSet<Integer> setSpaces = new TreeSet<>();

		totalWidth = scanner.nextInt();
		numOfPartitions = scanner.nextInt();
		scanner.nextLine();
		arrPartitions = new int[numOfPartitions+1];
		
		setSpaces.add(totalWidth);

		for (int i = 0; i < numOfPartitions; i++) {
			arrPartitions[i] = scanner.nextInt();
			setSpaces.add(arrPartitions[i]);
		}
		
		arrPartitions[arrPartitions.length-1] = totalWidth;
		
		for (int i = numOfPartitions; i > 0; i--) {
			for (int j = i - 1; j >= 0; j--) {
				setSpaces.add(arrPartitions[i] - arrPartitions[j]);
			}
		}

		for (int element : setSpaces) {
			System.out.print(element + " ");
		}
	}
}