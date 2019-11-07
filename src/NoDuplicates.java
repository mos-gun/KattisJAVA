import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class NoDuplicates {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		Scanner scanner1 = new Scanner(input);
		SortedSet<String> setInput = new TreeSet<>();
		boolean noDuplicates = true;
		
		while (scanner1.hasNext()) {
			if(!setInput.add(scanner1.next())) {
				noDuplicates = false;
				break;
			}
		}
		if(noDuplicates) System.out.println("yes");
		else System.out.println("no");
	}
}