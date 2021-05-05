//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class APrizeNoOneCanWin {											// Time Limit Exceeded
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		int numOfItems, minimumCost, counter;
//		int arrPrices[], arrPrices2[][];
//
//		numOfItems = scanner.nextInt();
//		minimumCost = scanner.nextInt();
//		scanner.nextLine();
//
//		arrPrices = new int[numOfItems];
//		for (int i = 0; i < numOfItems; i++) {
//			arrPrices[i] = scanner.nextInt();
//		}
//		scanner.nextLine();
//
//		Arrays.sort(arrPrices);
//		arrPrices2 = new int[numOfItems][2];
//
//		for (int i = 0; i < numOfItems; i++) {
//			arrPrices2[i][0] = arrPrices[i];
//			arrPrices2[i][1] = - 1;
//		}
//
//		for (int i = 0; i < numOfItems; i++) {
//			for (int j = i+1; j < numOfItems; j++) {
//				if (arrPrices2[i][1] == 0) break;
//				if (arrPrices2[j][1] == 0) continue;
//				
//				if (arrPrices2[i][0] + arrPrices2[j][0] <= minimumCost) {
//					arrPrices2[i][1] = 1;
//					arrPrices2[j][1] = 1;
//				} else {
//					arrPrices2[j][1] = 0;
//				}
//			}
//		}
//		
//		counter = 0;
//		for(int i=0; i<numOfItems; i++) {
//			if(arrPrices2[i][1] == 1) counter++;
//		}
//		if(counter == 0) counter++;
//		System.out.println(counter);
//	}
//}
