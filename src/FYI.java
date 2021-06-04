import java.util.Scanner;

public class FYI {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		if(scanner.nextLine().startsWith("555")) System.out.println("1");
		else System.out.println("0");
	}
}