import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Keystrokes {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[] arrInput;
		List<Character> listPassword = new ArrayList<>();
		int index;

		arrInput = scanner.nextLine().toCharArray();

		index = 0;
		for (int i = 0; i < arrInput.length; i++) {
			if (arrInput[i] == 'L') index--;
			else if (arrInput[i] == 'R') index++;
			else if (arrInput[i] == 'B') {
				listPassword.remove(index - 1);
				index--;
			} else {
				listPassword.add(index, arrInput[i]);
				index++;
			}
		}
		
		for (char c : listPassword) System.out.print(c);
		System.out.println();
	}
}