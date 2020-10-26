import java.util.Scanner;

public class OddGnome {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numOfGroups;
		String[] arrGnomes;

		numOfGroups = Integer.parseInt(scanner.nextLine().trim());

		for (int i = 0; i < numOfGroups; i++) {
			scanner.nextInt();
			arrGnomes = scanner.nextLine().trim().split(" ");

			for (int j = 0; j < arrGnomes.length-1; j++) {
				if(Integer.parseInt(arrGnomes[j+1]) != Integer.parseInt(arrGnomes[j])+1) {
					System.out.println(j+2);
					break;
				}
			}
		}
	}
}