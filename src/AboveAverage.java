import java.util.ArrayList;
import java.util.Scanner;

public class AboveAverage {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int numOfCases;
		ArrayList<Integer> valueSet = new ArrayList<>();
		ArrayList<Float> resultSet = new ArrayList<>();
		int len, sum = 0, aboveAvg = 0;
		
		numOfCases = scanner.nextInt();
		scanner.nextLine();

		for (int i = 0; i < numOfCases; i++) {
			len = scanner.nextInt();
			valueSet = new ArrayList<>(len);
			sum = 0;
			aboveAvg = 0;
			for (int j = 0; j < len; j++) {
				valueSet.add(scanner.nextInt());
				sum += valueSet.get(j);
			}
			scanner.nextLine();
			
			for (int j = 0; j < len; j++) {
				if(valueSet.get(j) > sum / len){
					aboveAvg++;
				}
			}
			resultSet.add((float) aboveAvg / len * 100);
		}

		for (int i = 0; i < resultSet.size(); i++) {
			System.out.printf("%.3f%s\n", resultSet.get(i), "%");
		}
	}
}