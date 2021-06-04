import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Gerrymandering {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numOfPrecincts, numOfDistricts;
		int distNum, numOfVotesA, numOfVotesB;
		int wastedVotesPartyA, wastedVotesPartyB;
		int totalWastedVotesPartyA, totalWastedVotesPartyB, totalVotes;
		double efficiencyGap;
		Map<Integer, int[]> mapDistricts = new HashMap<>();

		numOfPrecincts = scanner.nextInt();
		numOfDistricts = scanner.nextInt();
		scanner.nextLine();

		for (int i = 0; i < numOfPrecincts; i++) {
			distNum = scanner.nextInt();
			numOfVotesA = scanner.nextInt();
			numOfVotesB = scanner.nextInt();
			scanner.nextLine();
			if (mapDistricts.containsKey(distNum)) {
				mapDistricts.put(distNum, new int[]{mapDistricts.get(distNum)[0] + numOfVotesA, mapDistricts.get(distNum)[1] + numOfVotesB});
			} else {
				mapDistricts.put(distNum, new int[]{numOfVotesA, numOfVotesB});
			}
		}

		totalWastedVotesPartyA = 0;
		totalWastedVotesPartyB = 0;
		totalVotes = 0;

		for (Map.Entry<Integer, int[]> entry : mapDistricts.entrySet()) {
			if (entry.getValue()[0] > entry.getValue()[1]) {
				wastedVotesPartyA = entry.getValue()[0] - (((entry.getValue()[0] + entry.getValue()[1]) / 2) + 1);
				wastedVotesPartyB = entry.getValue()[1];
				System.out.println("A " + wastedVotesPartyA + " " + wastedVotesPartyB);
			} else {
				wastedVotesPartyA = entry.getValue()[0];
				wastedVotesPartyB = entry.getValue()[1] - (((entry.getValue()[0] + entry.getValue()[1]) / 2) + 1);
				System.out.println("B " + wastedVotesPartyA + " " + wastedVotesPartyB);
			}

			totalWastedVotesPartyA += wastedVotesPartyA;
			totalWastedVotesPartyB += wastedVotesPartyB;
			totalVotes += entry.getValue()[0] + entry.getValue()[1];
		}

		efficiencyGap = Math.abs((double) (totalWastedVotesPartyA - totalWastedVotesPartyB) / totalVotes);
		System.out.println(efficiencyGap);
	}
}