import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Recount {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Map<String, Integer> mapPersonCount = new HashMap<>();
		String line, winnerName;
		int maxVote, amountWinners;

		while (! (line = scanner.nextLine()).equals("***")) {
			if (mapPersonCount.containsKey(line)) {
				mapPersonCount.put(line, mapPersonCount.get(line) + 1);
			} else {
				mapPersonCount.put(line, 1);
			}
		}

		maxVote = Collections.max(mapPersonCount.values());
		amountWinners = 0;
		winnerName = "";

		for (Map.Entry<String, Integer> entry : mapPersonCount.entrySet()) {
			if (entry.getValue() == maxVote) {
				amountWinners++;
				winnerName = entry.getKey();
			}
			if (amountWinners > 1) {
				System.out.println("Runoff!");
				break;
			}
		}

		if (amountWinners == 1) System.out.println(winnerName);
	}
}