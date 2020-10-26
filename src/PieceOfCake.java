//import java.util.Scanner;
//
//public class PieceOfCake {
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		float lenOfSides, distanceHorizontal, distanceVertical, width, depth, height;
//		
//		lenOfSides = scanner.nextInt();
//		distanceHorizontal = scanner.nextInt();
//		distanceVertical = scanner.nextInt();
//		
//		depth = 4;
//		if(distanceVertical > lenOfSides/2) height = distanceVertical;
//		else height = lenOfSides - distanceVertical;
//		
//		if(distanceHorizontal >= lenOfSides/2) width = distanceHorizontal;
//		else width = lenOfSides - distanceHorizontal;
//
//		System.out.println((int)(width * depth * height));
//	}
//}