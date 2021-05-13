import java.util.Scanner;

public class OneChickenPerPerson {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numOfPeople, numOfChicken;
		
		numOfPeople = scanner.nextInt();
		numOfChicken = scanner.nextInt();
		scanner.nextLine();

		if (numOfChicken > numOfPeople) {
			if((numOfChicken - numOfPeople) == 1) System.out.println("Dr. Chaz will have 1 piece of chicken left over!");
			else System.out.println("Dr. Chaz will have " + (numOfChicken-numOfPeople) + " pieces of chicken left over!");
		} else {
			if((numOfPeople - numOfChicken) == 1) System.out.println("Dr. Chaz needs 1 more piece of chicken!");
			else System.out.println("Dr. Chaz needs " + (numOfPeople - numOfChicken) + " more pieces of chicken!");
		}
	}
}
