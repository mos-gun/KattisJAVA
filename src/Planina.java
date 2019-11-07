import java.util.Scanner;

public class Planina {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numOfIter = scanner.nextInt();
		System.out.println(((int)Math.pow(2, numOfIter)+1) * ((int)Math.pow(2, numOfIter)+1));
	}
}