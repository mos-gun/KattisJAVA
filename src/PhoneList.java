//import java.util.Arrays;
//import java.util.Scanner;
//import java.util.stream.Stream;
//
//public class PhoneList {														// UNFINISHED
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		int numOfCases, numOfPhoneNumbers;
//		String[] numbers, answers;
//		String temp;
//		String[] arr;
//
//		numOfCases = Integer.parseInt(scanner.nextLine());
//		answers = new String[numOfCases];
//
//		for (int i = 0; i < numOfCases; i++) {
//			numOfPhoneNumbers = Integer.parseInt(scanner.nextLine());
//			numbers = new String[numOfPhoneNumbers];
//			Arrays.fill(numbers, "---");
//
//			for (int j = 0; j < numOfPhoneNumbers; j++) {
//				temp = scanner.nextLine();
//				try {
//					if (Arrays.stream(numbers).anyMatch(temp::startsWith)) {
//						answers[i] = "NO";
//					} else answers[i] = "YES";
//				} catch (Exception e) {
//					System.out.println("NullPointerException");
//				}
//
//				numbers[i] = temp;
//			}
//		}
//		for (String element : answers) {
//			System.out.println(element);
//		}
//	}
//}
