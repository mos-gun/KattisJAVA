import java.util.HashSet;
import java.util.Scanner;

public class Keywords {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numOfKeywords, uniqueKeywords;
		HashSet<String> setKeywords;
		String keyword;
		
		numOfKeywords = Integer.parseInt(scanner.nextLine().trim());
		uniqueKeywords = numOfKeywords;
		setKeywords = new HashSet<>();
		
		for (int i = 0; i < numOfKeywords; i++) {
			keyword = scanner.nextLine().toLowerCase().replaceAll("-", " ");
			if(!setKeywords.add(keyword)) uniqueKeywords--;
		}

		System.out.println(uniqueKeywords);
	}
}
