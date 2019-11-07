import java.util.Scanner;

public class Server {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numOfTasks, totalTime, currentTask, counter = 0;
		String input;
		String[] arrTasks;

		numOfTasks = scanner.nextInt();
		totalTime = scanner.nextInt();
		scanner.nextLine();
		input = scanner.nextLine();
		arrTasks = input.split(" ");
		for (int i = 0; i < numOfTasks; i++) {
			currentTask = Integer.parseInt(arrTasks[counter]);
			if (totalTime - currentTask >= 0) {
				totalTime -= currentTask;
				counter++;
			} else break;
		}
		System.out.println(counter);
	}
}