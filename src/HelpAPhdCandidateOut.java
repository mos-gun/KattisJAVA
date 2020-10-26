import java.util.Scanner;

public class HelpAPhdCandidateOut {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numOfCases;
		String line;
		String[] arrNumbers;
		
		numOfCases = Integer.parseInt(scanner.nextLine().trim());
		for (int i = 0; i < numOfCases; i++) {
			if((line = scanner.nextLine()).equals("P=NP")) System.out.println("skipped");
			else {
				arrNumbers = line.split("\\+");
				System.out.println(Integer.parseInt(arrNumbers[0]) + Integer.parseInt(arrNumbers[1]));
			}
		}
	}
}