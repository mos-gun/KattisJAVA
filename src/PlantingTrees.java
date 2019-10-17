import java.util.*;

public class PlantingTrees {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numOfSeeds, daysTillParty = 0;

		numOfSeeds = scanner.nextInt();
		Integer[] arrNum = new Integer[numOfSeeds];

		for (int i = 0; i < numOfSeeds; i++) {
			arrNum[i] = scanner.nextInt();
		}

		Arrays.sort(arrNum, Collections.reverseOrder());

		daysTillParty = arrNum[0];

		if (numOfSeeds > 1) {
			for (int i = 1; i < numOfSeeds; i++) {
				if (arrNum[i] + i > daysTillParty) {
					daysTillParty+= (arrNum[i]+i)-daysTillParty;
				}
			}


		}
		System.out.println(daysTillParty+2);
	}
}