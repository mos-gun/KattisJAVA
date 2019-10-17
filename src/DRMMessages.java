//import java.util.HashMap;
//import java.util.Scanner;
//
//public class DRMMessages {
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		HashMap<Character, Integer> letterToNumDict = new HashMap<>();
//		String line, firstPart, secondPart;
//		StringBuilder newFirstPart = new StringBuilder();
//		StringBuilder newSecondPart = new StringBuilder();
//		char letter = 'A', letterFirstPart, letterSecondPart;
//		int sumFirstPart = 0, sumSecondPart = 0;
//
//
//		for (int i = 0; i < 26; i++) {
//			letterToNumDict.put(letter, i);
//			letter++;
//		}
//
//		line = scanner.nextLine();
//		int lenOfLine = line.length();
//		int lenOfLineHalf = lenOfLine / 2;
//
//		firstPart = line.substring(0, lenOfLineHalf);
//		secondPart = line.substring(firstPart.length());
//
//		for (int i = 0; i < lenOfLineHalf; i++) {
//			sumFirstPart += letterToNumDict.get(firstPart.charAt(i));
//			sumSecondPart += letterToNumDict.get(secondPart.charAt(i));
//		}
//
//		for (int i = 0; i < lenOfLineHalf; i++) {
//			letterFirstPart = (char) (firstPart.charAt(i) + sumFirstPart);
//			letterSecondPart = (char) (secondPart.charAt(i) + sumSecondPart);
//
//			while (letterFirstPart > 'Z') {
//				letterFirstPart = (char) ('A' + (letterFirstPart - 'Z' - 1));
//			}
//
//			while (letterSecondPart > 'Z') {
//				letterSecondPart = (char) ('A' + (letterSecondPart - 'Z' - 1));
//			}
//
//			letterFirstPart = (char) (letterFirstPart + letterToNumDict.get(letterSecondPart));
//
//			if (letterFirstPart <= 'Z') {
//				newFirstPart.append(letterFirstPart);
//			} else {
//				letterFirstPart = (char) ('A' + (letterFirstPart - 'Z' - 1));
//				newFirstPart.append(letterFirstPart);
//			}
//
//		}
//
//		System.out.println(newFirstPart);
//	}	
//}