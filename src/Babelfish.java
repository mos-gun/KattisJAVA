//import java.util.*;
//
//public class Babelfish {															// RUNTIME ERROR
//
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		HashMap<String, String> dictMap = new HashMap<>();
//		String line;
//		ArrayList<String> wordList = new ArrayList<>();
//
//		while (! (line = scanner.nextLine()).isEmpty()) {
//			dictMap.put(line.substring(0, line.indexOf(' ')), line.substring(line.indexOf(' ')+1));
//		}
//
//		while (! (line = scanner.nextLine()).isEmpty()) {
//			wordList.add(line);
//		}
//
//		for (String word : wordList) {
//			try {
//				line = dictMap.entrySet()
//						.stream()
//						.filter(entry -> word.equals(entry.getValue()))
//						.map(Map.Entry::getKey)
//						.findFirst()
//						.get();
//			} catch (NoSuchElementException e) {
//				line = "";
//			}
//
//			if (! line.isEmpty()) {
//				System.out.println(line);
//			} else System.out.println("eh");
//		}
//	}
//
//}
