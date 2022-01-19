import java.util.Objects;
import java.util.Scanner;

public class ASCIIAddition {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		char[][] arrASCII0 =
				{
						{'x', 'x', 'x', 'x', 'x'},
						{'x', '.', '.', '.', 'x'},
						{'x', '.', '.', '.', 'x'},
						{'x', '.', '.', '.', 'x'},
						{'x', '.', '.', '.', 'x'},
						{'x', '.', '.', '.', 'x'},
						{'x', 'x', 'x', 'x', 'x'}
				};

		char[][] arrASCII1 =
				{
						{'.', '.', '.', '.', 'x'},
						{'.', '.', '.', '.', 'x'},
						{'.', '.', '.', '.', 'x'},
						{'.', '.', '.', '.', 'x'},
						{'.', '.', '.', '.', 'x'},
						{'.', '.', '.', '.', 'x'},
						{'.', '.', '.', '.', 'x'}
				};

		char[][] arrASCII2 =
				{
						{'x', 'x', 'x', 'x', 'x'},
						{'.', '.', '.', '.', 'x'},
						{'.', '.', '.', '.', 'x'},
						{'x', 'x', 'x', 'x', 'x'},
						{'x', '.', '.', '.', '.'},
						{'x', '.', '.', '.', '.'},
						{'x', 'x', 'x', 'x', 'x'},
				};

		char[][] arrASCII3 =
				{
						{'x', 'x', 'x', 'x', 'x'},
						{'.', '.', '.', '.', 'x'},
						{'.', '.', '.', '.', 'x'},
						{'x', 'x', 'x', 'x', 'x'},
						{'.', '.', '.', '.', 'x'},
						{'.', '.', '.', '.', 'x'},
						{'x', 'x', 'x', 'x', 'x'},
				};

		char[][] arrASCII4 =
				{
						{'x', '.', '.', '.', 'x'},
						{'x', '.', '.', '.', 'x'},
						{'x', '.', '.', '.', 'x'},
						{'x', 'x', 'x', 'x', 'x'},
						{'.', '.', '.', '.', 'x'},
						{'.', '.', '.', '.', 'x'},
						{'.', '.', '.', '.', 'x'}
				};

		char[][] arrASCII5 =
				{
						{'x', 'x', 'x', 'x', 'x'},
						{'x', '.', '.', '.', '.'},
						{'x', '.', '.', '.', '.'},
						{'x', 'x', 'x', 'x', 'x'},
						{'.', '.', '.', '.', 'x'},
						{'.', '.', '.', '.', 'x'},
						{'x', 'x', 'x', 'x', 'x'},
				};

		char[][] arrASCII6 =
				{
						{'x', 'x', 'x', 'x', 'x'},
						{'x', '.', '.', '.', '.'},
						{'x', '.', '.', '.', '.'},
						{'x', 'x', 'x', 'x', 'x'},
						{'x', '.', '.', '.', 'x'},
						{'x', '.', '.', '.', 'x'},
						{'x', 'x', 'x', 'x', 'x'},
				};

		char[][] arrASCII7 =
				{
						{'x', 'x', 'x', 'x', 'x'},
						{'.', '.', '.', '.', 'x'},
						{'.', '.', '.', '.', 'x'},
						{'.', '.', '.', '.', 'x'},
						{'.', '.', '.', '.', 'x'},
						{'.', '.', '.', '.', 'x'},
						{'.', '.', '.', '.', 'x'}
				};

		char[][] arrASCII8 =
				{
						{'x', 'x', 'x', 'x', 'x'},
						{'x', '.', '.', '.', 'x'},
						{'x', '.', '.', '.', 'x'},
						{'x', 'x', 'x', 'x', 'x'},
						{'x', '.', '.', '.', 'x'},
						{'x', '.', '.', '.', 'x'},
						{'x', 'x', 'x', 'x', 'x'},
				};

		char[][] arrASCII9 =
				{
						{'x', 'x', 'x', 'x', 'x'},
						{'x', '.', '.', '.', 'x'},
						{'x', '.', '.', '.', 'x'},
						{'x', 'x', 'x', 'x', 'x'},
						{'.', '.', '.', '.', 'x'},
						{'.', '.', '.', '.', 'x'},
						{'x', 'x', 'x', 'x', 'x'},
				};

		char[][] arrASCIIPlus =
				{
						{'.', '.', 'x', '.', '.'},
						{'.', '.', 'x', '.', '.'},
						{'.', '.', 'x', '.', '.'},
						{'x', 'x', 'x', 'x', 'x'},
						{'.', '.', 'x', '.', '.'},
						{'.', '.', 'x', '.', '.'},
						{'.', '.', 'x', '.', '.'}
				};
		
		char[][] arrInput = new char[7][];
		
		for (int i = 0; i < 7; i++) {
			arrInput[i] = scanner.nextLine().toCharArray();
		}

		int numOfSymbols = (arrInput[0].length + 1) / 6;
		char[] arrSymbols = new char[numOfSymbols];
		int counter = 5;

		char[][] arrInputSymbol;
		int posOfPlus = -1;
		
		for (int i = 0; i < numOfSymbols; i++) {
			arrInputSymbol = new char[7][6];
			int l = 0;
			for (int j = 0; j < 7; j++) {
				int k=i;
				int m = 0;
				for (k=k*6 ;k < counter; k++) {
					arrInputSymbol[l][m] = arrInput[j][k];
					m++;
				}
				l++;
			}
			arrSymbols[i] = getSymbol(arrInputSymbol);
			if(arrSymbols[i] == '+') posOfPlus = i;
			counter += 6;
		}

		StringBuilder num1AsString = new StringBuilder();
		StringBuilder num2AsString = new StringBuilder();

		for (int i = 0; i < numOfSymbols; i++) {
			if(i<posOfPlus) num1AsString.append(arrSymbols[i]);
			else num2AsString.append(arrSymbols[i]);
		}
		
		int num1 = Integer.parseInt(num1AsString.toString());
		int num2 = Integer.parseInt(num2AsString.toString());
		int result = num1 + num2;
		String resultAsString = String.valueOf(result);
		char[][] symbolToPrint = null;
		StringBuilder[] resultAsASCII = new StringBuilder[7];
		resultAsASCII[0] = new StringBuilder();
		resultAsASCII[1] = new StringBuilder();
		resultAsASCII[2] = new StringBuilder();
		resultAsASCII[3] = new StringBuilder();
		resultAsASCII[4] = new StringBuilder();
		resultAsASCII[5] = new StringBuilder();
		resultAsASCII[6] = new StringBuilder();
		
		for (int i = 0; i < resultAsString.length(); i++) {
			if(resultAsString.charAt(i) == '1') symbolToPrint = arrASCII1;
			if(resultAsString.charAt(i) == '2') symbolToPrint = arrASCII2;
			if(resultAsString.charAt(i) == '3') symbolToPrint = arrASCII3;
			if(resultAsString.charAt(i) == '4') symbolToPrint = arrASCII4;
			if(resultAsString.charAt(i) == '5') symbolToPrint = arrASCII5;
			if(resultAsString.charAt(i) == '6') symbolToPrint = arrASCII6;
			if(resultAsString.charAt(i) == '7') symbolToPrint = arrASCII7;
			if(resultAsString.charAt(i) == '8') symbolToPrint = arrASCII8;
			if(resultAsString.charAt(i) == '9') symbolToPrint = arrASCII9;
			if(resultAsString.charAt(i) == '0') symbolToPrint = arrASCII0;
			if(resultAsString.charAt(i) == '+') symbolToPrint = arrASCIIPlus;

			for (int j = 0; j < Objects.requireNonNull(symbolToPrint).length; j++) {
				for (int k = 0; k < symbolToPrint[j].length; k++) {
					resultAsASCII[j].append(symbolToPrint[j][k]);
				}
				if(i !=resultAsString.length()-1) {
					resultAsASCII[j].append('.');
				}
			}
		}
		for(StringBuilder sb : resultAsASCII) {
			System.out.println(sb.toString());
		}
		
		


	}
	
	private static char getSymbol (char[][] arrSymbol) {
		if(arrSymbol[1][0] == '.' && arrSymbol[1][4] == 'x' && 
		   arrSymbol[5][0] == '.' && arrSymbol[5][4] == 'x' &&
		   arrSymbol[0][0] == '.') return '1';
		
		if(arrSymbol[1][0] == '.' && arrSymbol[1][4] == 'x' && 
		   arrSymbol[5][0] == 'x' && arrSymbol[5][4] == '.') return '2';
		
		if(arrSymbol[1][0] == '.' && arrSymbol[1][4] == 'x' && 
		   arrSymbol[5][0] == '.' && arrSymbol[5][4] == 'x' &&
		   arrSymbol[6][0] == 'x') return '3';
		
		if(arrSymbol[1][0] == 'x' && arrSymbol[1][4] == 'x' && 
		   arrSymbol[5][0] == '.' && arrSymbol[5][4] == 'x' &&
		   arrSymbol[6][0] == '.') return '4';
		
		if(arrSymbol[1][0] == 'x' && arrSymbol[1][4] == '.' && 
		   arrSymbol[5][0] == '.' && arrSymbol[5][4] == 'x') return '5';
		
		if(arrSymbol[1][0] == 'x' && arrSymbol[1][4] == '.' && 
		   arrSymbol[5][0] == 'x' && arrSymbol[5][4] == 'x') return '6';
		
		if(arrSymbol[1][0] == '.' && arrSymbol[1][4] == 'x' && 
		   arrSymbol[5][0] == '.' && arrSymbol[5][4] == 'x' &&
		   arrSymbol[0][0] == 'x' && arrSymbol[6][0] == '.') return '7';
		
		if(arrSymbol[1][0] == 'x' && arrSymbol[1][4] == 'x' && 
		   arrSymbol[5][0] == 'x' && arrSymbol[5][4] == 'x' &&
		   arrSymbol[3][2] == 'x') return '8';
		
		if(arrSymbol[1][0] == 'x' && arrSymbol[1][4] == 'x' && 
		   arrSymbol[5][0] == '.' && arrSymbol[5][4] == 'x' &&
		   arrSymbol[6][0] == 'x') return '9';
		
		if(arrSymbol[1][0] == 'x' && arrSymbol[1][4] == 'x' && 
		   arrSymbol[5][0] == 'x' && arrSymbol[5][4] == 'x' &&
		   arrSymbol[3][2] == '.') return '0';
		
		if(arrSymbol[1][0] == '.' && arrSymbol[1][4] == '.' && 
		   arrSymbol[5][0] == '.' && arrSymbol[5][4] == '.') return '+';
		
		
		return '!';
		
		
	}
	
	
}
