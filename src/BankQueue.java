import java.util.*;

public class BankQueue {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numOfPeople, minutes;
		int[][] customers;
		int tmp1, tmp2;

		numOfPeople = scanner.nextInt();
		minutes = Integer.parseInt(scanner.nextLine().trim());

		customers = new int[numOfPeople][2];


		for (int i = 0; i < numOfPeople; i++) {
			customers[i][0] = scanner.nextInt();
			customers[i][1] = Integer.parseInt(scanner.nextLine().trim());
		}

		Arrays.sort(customers, Comparator.comparingInt(a -> a[0]));
		for (int i = 0; i < customers.length/2; i++) {
			tmp1 = customers[i][0];
			tmp2 = customers[i][1];
			customers[i][0] = customers[customers.length-1 - i][0];
			customers[i][1] = customers[customers.length-1 - i][1];
			customers[customers.length-1 - i][0] = tmp1;
			customers[customers.length-1 - i][1] = tmp2;			
		}

		int sum = 0;
		boolean[] used = new boolean[minutes];
		for (int[] customer : customers) {
			int time = customer[1];
			while (time >= 0) {
				if (! used[time]) {
					sum += customer[0];
					used[time] = true;
					break;
				}
				time--;
			}
		}
		System.out.println(sum);
	}
}
