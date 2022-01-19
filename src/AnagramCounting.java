import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class AnagramCounting {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String line;
		while ((line = scanner.nextLine()) != null) {
			System.out.println(numberOfPermutations(BigInteger.valueOf(line.length())));
		}
	}

	private static BigInteger numberOfPermutations(BigInteger n) {
		if(n.equals(BigInteger.ONE) || n.equals(BigInteger.ZERO)) return BigInteger.ONE;

		return (n).multiply(numberOfPermutations(n.subtract(BigInteger.ONE)));
	}
}