//import java.util.Scanner;
//
//public class A1Paper {
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		int smallestPaperSize;
//		int[] arrAmountOfPapers;
//		double lenOfTapeNeeded;
//		boolean boolA1Built;
//
//		//predetermined data///////////////////////////////////////////////////
//		double[] arrWidthOfPapers = new double[30];
//		double[] arrHeightOfPapers = new double[30];
//		double[] arrAreaOfPapers = new double[30];
//
//		arrWidthOfPapers[0] = - 1;
//		arrHeightOfPapers[0] = - 1;
//		arrAreaOfPapers[0] = - 1;
//		arrWidthOfPapers[1] = Math.pow(2, (- 5.0) / 4.0);
//		arrHeightOfPapers[1] = Math.pow(2, (- 3.0) / 4.0);
//		arrAreaOfPapers[1] = arrWidthOfPapers[1] * arrHeightOfPapers[1];
//
//		for (int i = 2; i < 30; i++) {
//			arrAreaOfPapers[i] = arrAreaOfPapers[i - 1] / 2;
//			arrWidthOfPapers[i] = arrHeightOfPapers[i - 1] / 2;
//			arrHeightOfPapers[i] = arrAreaOfPapers[i] / arrWidthOfPapers[i];
//		}
//		//predetermined data///////////////////////////////////////////////////
//
//
//		smallestPaperSize = Integer.parseInt(scanner.nextLine().trim());
//		arrAmountOfPapers = new int[smallestPaperSize];
//		arrAmountOfPapers[0] = 0;
//		for (int i = 1; i < smallestPaperSize; i++) {
//			arrAmountOfPapers[i] = scanner.nextInt();
//		}
//		scanner.nextLine();
//
//		lenOfTapeNeeded = 0;
//		boolA1Built = false;
//		for (int i = 0; i < smallestPaperSize; i++) {
//			if (i == 0 && arrAmountOfPapers[i] == 1) {
//				boolA1Built = true;
//				break;
//			}
//			if (arrAmountOfPapers[i] >= 2) {
//				arrAmountOfPapers[i] -= 2;
//				lenOfTapeNeeded += arrHeightOfPapers[i];
//				arrAmountOfPapers[i-1]++;
//				i -= 2;
//			}
//		}
//
//		
//		if (boolA1Built) System.out.println(lenOfTapeNeeded);
//		else System.out.println("impossible");
//	}
//}