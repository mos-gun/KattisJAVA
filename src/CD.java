import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class CD {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int numOfJack, numOfJill, numOfDuplicates, temp;
		HashSet<Integer> setCDs;
//		int[] arrCDs;
		ArrayList<Integer> listResults = new ArrayList<>();

		while (true) {

			numOfJack = scanner.nextInt();
			numOfJill = scanner.nextInt();

			if (numOfJack == 0 && numOfJill == 0) {
				break;
			}

			setCDs = new HashSet<>();
//			arrCDs = new int[numOfJack + numOfJill];
			numOfDuplicates = 0;
			
			for (int i = 0; i < numOfJack + numOfJill; i++) {
				temp = scanner.nextInt();
				if (! setCDs.add(temp)) {
					numOfDuplicates++;
				}
//				arrCDs[i] = scanner.nextInt();
			}

//			Arrays.sort(arrCDs);
			
//			for (int i = 1; i < numOfJack + numOfJill; i++) {
//				if(arrCDs[i] == arrCDs[i-1]) numOfDuplicates++;
//			}
			
			listResults.add(numOfDuplicates);
		}

		for (int element : listResults) {
			System.out.println(element);
		}
		
	}
}