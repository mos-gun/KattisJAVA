import java.util.Scanner;

public class Filip {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1, num2;
		String numAsString1, numAsString2;

		num1 = scanner.nextInt();
		num2 = scanner.nextInt();

		numAsString1 = Integer.toString(num1);
		numAsString2 = Integer.toString(num2);

		StringBuilder sb = new StringBuilder();

		sb.append(numAsString1);
		sb.reverse();
		num1 = Integer.parseInt(sb.toString());
		sb.replace(0, sb.length(), numAsString2);
		sb.reverse();
		num2 = Integer.parseInt(sb.toString());

		if (num1 > num2) {
			System.out.println(num1);
		} else {
			System.out.println(num2);
		}
	}
}
