//import java.util.Scanner;
//
//class IOKindsOfPeople {
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		int rows, columns;
//		String[] arrDimensions;
//		int[][] arrField;
//		String line;
//		String[][] arrLines;
//		int[][] arrNumbers;
//		int x1, x2, y1, y2;
//
//		arrDimensions = scanner.nextLine().split(" ");
//		rows = Integer.parseInt(arrDimensions[0]);
//		columns = Integer.parseInt(arrDimensions[1]);
//		arrLines = new String[rows][columns];
//		arrField = new int[rows][columns];
//
//		for (int i = 0; i < rows; i++) {
//			line = scanner.nextLine();
//			arrLines[i] = line.split("");
//
//			
//		}
//
//		
//		x1 = scanner.nextInt();
//		y1 = scanner.nextInt();
//		x2 = scanner.nextInt();
//		y2 = scanner.nextInt();
//		
//
//		for (int i = 0; i < columns; i++) {
//			arrNumbers[i] = Integer.parseInt(arrLines[i]);
//		}
//
//	}
//}