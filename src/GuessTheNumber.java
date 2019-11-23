import java.util.Scanner;

public class GuessTheNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num, min, max;
		String response;

		min = 1;
		max = 1001;
		num = (min + max) / 2;

		while (true) {
			System.out.println(num);
			System.out.flush();
			response = scanner.nextLine();
			if (response.equals("lower")) {
				max = num;
				num = (min+max) / 2;
			} else if (response.equals("higher")) {
				min = num;
				num = (min+max) / 2;
			} else {
				break;
			}
		}
	}
}