import java.util.Scanner;

public class Tri {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1, num2, num3;

		num1 = scanner.nextInt();
		num2 = scanner.nextInt();
		num3 = scanner.nextInt();
		scanner.nextLine();

		if (calc(num1, num2, num3, '+') != 'f') {
			System.out.println(num1 + "+" + num2 + "=" + num3);
		} else if (calc(num1, num2, num3, '-') != 'f') {
			System.out.println(num1 + "-" + num2 + "=" + num3);
		} else if (calc(num1, num2, num3, '*') != 'f') {
			System.out.println(num1 + "*" + num2 + "=" + num3);
		} else if (calc(num1, num2, num3, '/') != 'f') {
			System.out.println(num1 + "/" + num2 + "=" + num3);
		} else if (calc(num2, num3, num1, '+') != 'f') {
			System.out.println(num1 + "=" + num2 + "+" + num3);
		} else if (calc(num2, num3, num1, '-') != 'f') {
			System.out.println(num1 + "=" + num2 + "-" + num3);
		} else if (calc(num2, num3, num1, '*') != 'f') {
			System.out.println(num1 + "=" + num2 + "*" + num3);
		} else if (calc(num2, num3, num1, '/') != 'f') {
			System.out.println(num1 + "=" + num2 + "/" + num3);
		} else System.out.println("no answer");

	}

	private static char calc(int num1, int num2, int result, char operator) {
		if (operator == '+') {
			if (result == num1 + num2) {
				return operator;
			}
		} else if (operator == '-') {
			if (result == num1 - num2) {
				return operator;
			}
		} else if (operator == '*') {
			if (result == num1 * num2) {
				return operator;
			}
		} else if (operator == '/') {
			if (result == num1 / num2) {
				return operator;
			}
		}
		return 'f';
	}
}