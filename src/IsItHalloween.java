import java.util.Scanner;

public class IsItHalloween {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] line;

		line = scanner.nextLine().split(" ");
		if ((line[0].equals("OCT") && line[1].equals("31")) || (line[0].equals("DEC") && line[1].equals("25"))) {
			System.out.println("yup");
		} else System.out.println("nope");
	}
}