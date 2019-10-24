import java.util.Scanner;

public class Avion {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input, output="";

		for (int i = 1; i <= 5; i++) {
			input = scanner.nextLine();
			if (input.contains("FBI")) {
				output += i+" ";
			}
		}
		if (output.equals("")) {
			System.out.println("HE GOT AWAY!");
		} else System.out.println(output);
	}

}