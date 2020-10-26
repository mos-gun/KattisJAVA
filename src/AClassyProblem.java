//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class AClassyProblem {
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		int numOfCases, numOfPeople;
//		String[] line, names;
//		int[][] arrDataSet;
//		int[] temp;
//		boolean swapped;
//
//		numOfCases = Integer.parseInt(scanner.nextLine().trim());
//		for (int i = 0; i < numOfCases; i++) {
//			numOfPeople = Integer.parseInt(scanner.nextLine().trim());
//			arrDataSet = new int[numOfPeople][10];
//			names = new String[numOfPeople];
//			for (int j = 0; j < numOfPeople; j++) {
//				line = scanner.nextLine().split(" ");
//
//				names[j] = line[0].substring(0, line[0].length() - 1);
//				line = line[1].split("-");
//				for (int k = 0; k < line.length; k++) {
//					if(line[k].equals("upper")) arrDataSet[j][k] = 3;
//					if(line[k].equals("middle")) arrDataSet[j][k] = 2;
//					if(line[k].equals("lower")) arrDataSet[j][k] = 1;
//				}
//			}
//
//			for (int j = 0; j < arrDataSet.length; j++) {
////				System.out.print(names[j] + " ");
//				for (int k = 0; k < arrDataSet[j].length; k++) {
//					System.out.print(arrDataSet[j][k] + " ");
//				}
//				System.out.println();
//			}
//
//			for (int j = 0; j < 10; j++) {
//				do {
//					swapped = false;
//					for (int k = 0; k < numOfPeople-1; k++) {
//						if (arrDataSet[k][j] < arrDataSet[k + 1][j]) {
//							temp = arrDataSet[k];
//							arrDataSet[k] = arrDataSet[k+1];
//							System.out.println(k+1 + " swapped with " + ((k+1)+1));
//							arrDataSet[k+1] = temp;
//							swapped = true;
//						}
//					}
//				} while(swapped);
//				
//				System.out.println();
//				for (int[] ints : arrDataSet) {
////				System.out.print(names[j] + " ");
//					for (int anInt : ints) {
//						System.out.print(anInt + " ");
//					}
//					System.out.println();
//				}
//				break;
//			}
//
//		}
//	}
//}
