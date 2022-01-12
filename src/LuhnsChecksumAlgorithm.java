import java.util.Scanner;

public class LuhnsChecksumAlgorithm {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numOfCases, tempNum, result;
		char[] line;
		
		numOfCases = Integer.parseInt(scanner.nextLine().trim());
		for (int i = 0; i < numOfCases; i++) {
			line = scanner.nextLine().toCharArray();
			for (int j = line.length-2; j >= 0; j=j-2) {
				tempNum = Character.getNumericValue(line[j]) * 2;
				if(tempNum > 9) tempNum = getSumOfDigits(tempNum);
				line[j] = String.valueOf(tempNum).charAt(0);
			}
			
			result = 0;
			for (char c : line) {
				result += Character.getNumericValue(c);
			}
			if(result % 10 == 0) System.out.println("PASS");
			else System.out.println("FAIL");
		}
	}
	
	public static int getSumOfDigits(int num) {
		String numAsString = String.valueOf(num);
		int result = 0;
		for (int i = 0; i < numAsString.length(); i++) {
			result += Integer.parseInt(numAsString.substring(i, i+1));
		}
		
		return result;
	}
}