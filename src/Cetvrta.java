import java.util.Scanner;

public class Cetvrta {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] arrInputs = new int[3][2];
		int numAnswer1, numAnswer2;

		for (int i = 0; i < 3; i++) {
			arrInputs[i][0] = scanner.nextInt();
			arrInputs[i][1] = scanner.nextInt();
		}
		if(arrInputs[0][0] == arrInputs[1][0]) numAnswer1 = arrInputs[2][0];
		else if(arrInputs[0][0] == arrInputs[2][0]) numAnswer1 = arrInputs[1][0];
		else numAnswer1 = arrInputs[0][0];
		if(arrInputs[0][1] == arrInputs[1][1]) numAnswer2 = arrInputs[2][1];
		else if(arrInputs[0][1] == arrInputs[2][1]) numAnswer2 = arrInputs[1][1];
		else numAnswer2 = arrInputs[0][1];
		System.out.println(numAnswer1 + " " + numAnswer2);
	}
}