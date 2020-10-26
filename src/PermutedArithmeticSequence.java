//import java.util.*;
//
//public class PermutedArithmeticSequence {
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		int numOfLines, lenOfSequence, diffBetweenInts;
//		int[] arrSequence;
//		boolean isInAscendingOrder, isArithmetic;
//
//		numOfLines = Integer.parseInt(scanner.nextLine().trim());
//
//		for (int i = 0; i < numOfLines; i++) {
//			lenOfSequence = scanner.nextInt();
//			arrSequence = new int[lenOfSequence];
//			
//			for (int j = 0; j < lenOfSequence; j++) {
//				arrSequence[j] = scanner.nextInt();
//			}
//			scanner.nextLine();
//			
//			isInAscendingOrder = true;
//			for (int j = 0; j < arrSequence.length-1; j++) {
//				if (arrSequence[j] > arrSequence[j+1]) {
//					isInAscendingOrder = false;
//					break;
//				}
//			}
//			
//			if(!isInAscendingOrder) Arrays.sort(arrSequence);
//
//			isArithmetic = true;
//			diffBetweenInts = arrSequence[1] - arrSequence[0];
//			for (int j = 1; j < arrSequence.length - 1; j++) {
//				if (arrSequence[j+1] - arrSequence[j] != diffBetweenInts) {
//					isArithmetic = false;
//					break;
//				}
//			}
//			System.out.println(isArithmetic ? isInAscendingOrder ? "arithmetic" : "permuted arithmetic" : "non-arithmetic");
//		}
//	}
//}