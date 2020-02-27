import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.concurrent.atomic.AtomicInteger;

public class Enigma {

	private static char[][] arrGrid;
	private static int numOfRows;
	private static int numOfColumns;

	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Kattio io = new Kattio(System.in, System.out);
		int numOfWords;
//		char[][] arrGrid;
		char status;
//		boolean[][] arrField2;

		numOfRows = io.getInt();                                               // read: number of rows in crossword grid
		numOfColumns = io.getInt();                                         // read: number of columns in crossword grid

		arrGrid = new char[numOfRows][numOfColumns];                    // create: array with crossword grid dimensions

		for (int i = 0; i < numOfRows; i++) {               // loop for filling array with crossword grid representation
			arrGrid[i] = io.getWord().toCharArray();
		}

//		for (char[] element : arrGrid) {
//			io.println(element);
//		}


		// find all possible word fields...
		for (int i = 0; i < numOfRows; i++) {
			for (int j = 0; j < numOfColumns; j++) {
				if (arrGrid[i][j] == '.') {
					arrGrid[i][j] = evaluateBox(i, j);
				}

			}

		}

		for (char[] element : arrGrid) {
			io.println(element);
		}


//		numOfWords = io.getInt();                                                         // read: total number of words


		io.flush();
		io.close();
	}

	private static char evaluateBox(int x, int y) {
		boolean leftNull = false;
		boolean topNull = false;
		boolean rightNull = false;
		boolean bottomNull = false;
		boolean isPossibleHorizontalField = false;
		boolean isPossibleVerticalField = false;


		if (x == 0 || arrGrid[x - 1][y] == '#') leftNull = true;
		if (y == 0 || arrGrid[x][y - 1] == '#') topNull = true;
		if (x == numOfRows - 1 || arrGrid[x + 1][y] == '#') rightNull = true;
		if (y == numOfColumns - 1 || arrGrid[x][y + 1] == '#') bottomNull = true;

		System.out.println(x + " " + y + "  " + leftNull + " " + topNull + " " + rightNull + " " + bottomNull);

		if (leftNull) {
			if (!rightNull) isPossibleHorizontalField = true;
		}
		if (topNull) {
			if (!bottomNull) isPossibleVerticalField = true;
		}

		if (isPossibleHorizontalField) {
			if (isPossibleVerticalField) {
				return 'z';
			} else return 'h';
		}
		if(isPossibleVerticalField) return 'v';

		return '-';
	}


}


class Field {
	final AtomicInteger count = new AtomicInteger(0);
	int fieldId, x, y, length;
	char direction;

	public Field(int x, int y, char direction, int length) {
		fieldId = count.getAndIncrement();
		this.x = x;
		this.y = y;
		this.direction = direction;
		this.length = length;
	}

	private int getFieldId() {
		return fieldId;
	}

	private int getX() {
		return x;
	}

	private int getY() {
		return y;
	}

	private char getDirection() {
		return direction;
	}

	private int getLength() {
		return length;
	}

}