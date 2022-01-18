import java.util.*;

public class AnotherBrickInTheWall {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int heightOfWall, widthOfWall, numOfBricks;
		int[] arrLenOfBricks;
		int currentLayer;

		heightOfWall = scanner.nextInt();
		widthOfWall = scanner.nextInt();
		numOfBricks = scanner.nextInt();
		scanner.nextLine();
		arrLenOfBricks = new int[numOfBricks];

		for (int i = 0; i < numOfBricks; i++) {
			arrLenOfBricks[i] = scanner.nextInt();
		}
		scanner.nextLine();

		currentLayer = widthOfWall;
		for(int i=0; i<numOfBricks; i++) {
			if(currentLayer - arrLenOfBricks[i] >= 0) {
				currentLayer -= arrLenOfBricks[i];
				if(currentLayer == 0) {
					heightOfWall--;
					if(heightOfWall == 0) {
						System.out.println("YES");
						break;
					}
					else currentLayer = widthOfWall;
				}
			} else {
				System.out.println("NO");
				break;
			}
		}
	}
}