import java.util.Scanner;

public class ARealChallenge {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long len;

		len = Long.parseLong(scanner.nextLine());
		System.out.println(Math.sqrt(len) * 4);
	}
}