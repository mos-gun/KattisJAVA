
import java.util.stream.Stream;

class PrefixSearch {
	public static void main(String[] args)
	{
		// Array of prefixes 
		String[] arr = { "Geeks", "for", "Gfor" };

		// Given String 
		String str = "GeeksforGeeks";

		// Convert the Prefixes into Stream using Stream.of() 
		// and check if any prefix matches using Predicate 
		// str::startsWith 
		if (Stream.of(arr)
				.anyMatch(str::startsWith))
			System.out.println("Given String "
					+ "starts with one of the prefixes.");
		else
			System.out.println("Given String do not "
					+ "starts with one of the prefixes.");

		System.out.println("==========================");
		
		String[] newArr;
		newArr = new String[3];

		newArr[0] = "Hallo";
		newArr[1] = "ollaH";
		newArr[2] = "abcd";

		if (Stream.of(newArr)
				.anyMatch(str::startsWith))
			System.out.println("Given String "
					+ "starts with one of the prefixes.");
		else
			System.out.println("Given String do not "
					+ "starts with one of the prefixes.");
	}
} 
