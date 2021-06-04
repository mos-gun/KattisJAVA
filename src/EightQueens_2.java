import java.util.HashSet;
import java.util.Scanner;

public class EightQueens_2{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] arrChessBoard = new String[8];
		boolean queenExistsAlready;
		HashSet<Integer> setCoordinates = new HashSet<>();
		int[][] arrCoordinates = new int[8][2];
		
		for (int i = 0; i < 8; i++) {
			arrChessBoard[i] = scanner.nextLine();
			
			queenExistsAlready = false;
			for (int j = 0; j < 8; j++) {
				if(arrChessBoard[i].charAt(j) == '*') {
					if(queenExistsAlready) {
						System.out.println("invalid");
						System.exit(0);
					} else {
						queenExistsAlready = true;
						if(!setCoordinates.add(j)) {
							System.out.println("invalid");
							System.exit(0);
						}
						arrCoordinates[i][0] = i;
						arrCoordinates[i][1] = j;
					}
				}
			}
		}

		int x, y;
		for (int i = 0; i < 8; i++) {
			x = arrCoordinates[i][0];
			y = arrCoordinates[i][1];
			while (true) {
				if(x >= 7 || y >= 7) break;
				if(y + 1 == arrCoordinates[x+1][1]) {
					System.out.println("invalid");
					System.exit(0);
				} else {
					x++;
					y++;
				}
			}
		}

		System.out.println("valid");
	}
}