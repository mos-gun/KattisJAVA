import java.util.HashMap;
import java.util.Scanner;

public class ANewAlphabet {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<Character, String> oldToNewDict = new HashMap<>();
		String alphabet, line;
		StringBuilder sb = new StringBuilder();

		alphabet = "a @ b 8 c ( d |) e 3 f # g 6 h [-] i | j _| k |< l 1 m []\\/[] n []\\[] o 0 p |D q (,) r |z s $ t '][' u |_| v \\/ w \\/\\/ x }{ y `/ z 2";
		Scanner scanner1 = new Scanner(alphabet);

		for (int i = 0; i < 26; i++) {
			oldToNewDict.put(scanner1.next().charAt(0), scanner1.next());
		}

		line = scanner.nextLine().toLowerCase();
		for (int i = 0; i < line.length(); i++) {
			if ((line.charAt(i) < 'a' || line.charAt(i) > 'z') && (line.charAt(i) < 'A' || line.charAt(i) > 'Z')) {
				sb.append(line.charAt(i));
			} else sb.append(oldToNewDict.get(line.charAt(i)));
		}
		System.out.println(sb.toString());
	}
}