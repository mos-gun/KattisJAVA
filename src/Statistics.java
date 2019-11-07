import java.util.ArrayList;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Statistics {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		SortedSet<Integer> setValues;
		int sampleSize, counter = 1;
		String temp;
		String[] arrValues;
		ArrayList<String> listResults = new ArrayList<>();

		while (scanner.hasNextInt()) {
			temp = scanner.nextLine();
			arrValues = temp.split(" ");
			setValues = new TreeSet<>();
			sampleSize = Integer.parseInt(arrValues[0]);
			for (int i = 0; i < sampleSize; i++) {
				setValues.add(Integer.parseInt(arrValues[i + 1]));
			}
			listResults.add("Case " + counter + ": " + setValues.first() + " " + setValues.last() + " " + (setValues.last() - setValues.first()));
			counter++;

		}
		for (String element : listResults) {
			System.out.println(element);
		}
	}
}