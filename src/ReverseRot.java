import java.util.Arrays;
import java.util.Scanner;

public class ReverseRot {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numOfShifts;
		String txtToEncrypt;
		char[] arrTxtToEncrypt;

		while ((numOfShifts = scanner.nextInt()) != 0) {
			txtToEncrypt = reverseTxt(scanner.nextLine().trim());
			arrTxtToEncrypt = txtToEncrypt.toCharArray();
			for (int i = 0; i < arrTxtToEncrypt.length; i++) {
				for (int j = 0; j < numOfShifts; j++) {
					if(arrTxtToEncrypt[i] == 'Z') arrTxtToEncrypt[i] = '_';
					else if(arrTxtToEncrypt[i] == '_') arrTxtToEncrypt[i] = '.';
					else if(arrTxtToEncrypt[i] == '.') arrTxtToEncrypt[i] = 'A';
					else arrTxtToEncrypt[i]++;
				}
			}
			System.out.println(arrTxtToEncrypt);
		}
		
	}
	
	private static String reverseTxt(String txt) {
		StringBuilder newTxt = new StringBuilder(txt);
		newTxt.reverse();
		return newTxt.toString();
	}
}
