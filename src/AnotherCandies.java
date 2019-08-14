//import java.util.Scanner;
//
//public class AnotherCandies {													// RUNTIME ERROR
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		int numOfCases, numOfChildren, numOfCandy;
//		String line;
//		String[] answers;
//
//		numOfCases = Integer.parseInt(scanner.nextLine());
//		answers = new String[numOfCases];
//
//		for (int i = 0; i < numOfCases; i++) {
//			System.out.println();
//			line = scanner.nextLine();
//			numOfChildren = Integer.parseInt(line);
//			numOfCandy = 0;
//			for (int j = 0; j < numOfChildren; j++) {
//				numOfCandy += Integer.parseInt(scanner.nextLine());
//			}
//			if (numOfCandy % numOfChildren == 0) {
//				answers[i] = "YES";
//			} else answers[i] = "NO";
//		}
//		for (String element : answers) {
//			System.out.println(element);
//		}
//	}
//}